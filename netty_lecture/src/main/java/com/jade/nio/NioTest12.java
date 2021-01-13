package com.jade.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioTest12 {

    public static void main(String[] args) throws IOException {

        Selector selector = Selector.open();

        channelRegister(selector);

        while (true){

            int number = selector.select();
            System.out.println("number: " + number);
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            System.out.println("selectionKeys:" + selectionKeys);
            Iterator<SelectionKey> iterator = selectionKeys.iterator();

            while (iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();
                if(selectionKey.isAcceptable()){
                    getConnection(selector, iterator, selectionKey);
                } else if(selectionKey.isReadable()){
                    doReadChannel(iterator, selectionKey);
                }
            }
        }




    }

    private static void channelRegister(Selector selector) throws IOException {

        int[] ports = new int[5];

        ports[0] = 5000;
        ports[1] = 5001;
        ports[2] = 5002;
        ports[3] = 5003;
        ports[4] = 5004;

        for (int i = 0; i < ports.length; i++) {

            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            ServerSocket serverSocket = serverSocketChannel.socket();
            InetSocketAddress inetSocketAddress = new InetSocketAddress(ports[i]);
            serverSocket.bind(inetSocketAddress);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("监听端口：" + ports[i]);

        }
    }

    private static void doReadChannel(Iterator<SelectionKey> iterator, SelectionKey selectionKey) throws IOException {
        SocketChannel socketChannel = (SocketChannel)selectionKey.channel();

        int bytesRead = 0;

        while (true){
            ByteBuffer byteBuffer = ByteBuffer.allocate(512);
            byteBuffer.clear();
            int read = socketChannel.read(byteBuffer);
            if(read <= 0){
                break;
            }
            byteBuffer.flip();
            socketChannel.write(byteBuffer);
            bytesRead += read;
        }

        System.out.println("读取：" + bytesRead +", 来自于："+ socketChannel);
        iterator.remove();
    }

    private static void getConnection(Selector selector, Iterator<SelectionKey> iterator, SelectionKey selectionKey) throws IOException {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel)selectionKey.channel();
        SocketChannel socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector,SelectionKey.OP_READ);

        iterator.remove();

        System.out.println("获取客户端连接：" + socketChannel);
    }
}
