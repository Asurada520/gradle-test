package com.jade.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class NioServer {

    private static Map<String, SocketChannel> clientMap = new HashMap<>();


    public static void main(String[] args) throws IOException {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket = serverSocketChannel.socket();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(8899);
        serverSocket.bind(inetSocketAddress);

        Selector selector = Selector.open();

        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            try {
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();


                selectionKeys.forEach(selectionKey -> {

                    final SocketChannel client;
                    try {

                        if (selectionKey.isAcceptable()) {

                            ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
                            client = server.accept();
                            client.configureBlocking(false);
                            // 链接建立好了，然后开始关注读取事件
                            client.register(selector, SelectionKey.OP_READ);

                            String key = "[" + UUID.randomUUID().toString() + "]";
                            clientMap.put(key, client);

                        } else if (selectionKey.isReadable()) {

                            client = (SocketChannel)selectionKey.channel();
                            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                            int count = client.read(readBuffer);

                            if(count > 0){
                                readBuffer.flip();
                                Charset charset = Charset.forName("utf-8");
                                CharBuffer decode = charset.decode(readBuffer);
                                String receiveMessage = String.valueOf(decode.array());
                                System.out.println(client+ " ：" + receiveMessage);


                                String senderKey = null;

                                for(Map.Entry<String, SocketChannel> entry: clientMap.entrySet()){
                                    if(client == entry.getValue()){
                                        senderKey = entry.getKey();
                                        break;
                                    }
                                }

                                for(Map.Entry<String, SocketChannel> entry: clientMap.entrySet()){
                                    SocketChannel socketChannel = entry.getValue();
                                    ByteBuffer writerBuffer = ByteBuffer.allocate(1024);
                                    writerBuffer.put((senderKey+":" + receiveMessage).getBytes());
                                    writerBuffer.flip();
                                    socketChannel.write(writerBuffer);
                                }


                            }


                        }

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                });

                selectionKeys.clear();


            } catch (Exception ex) {
                ex.printStackTrace();
            }


        }


    }
}
