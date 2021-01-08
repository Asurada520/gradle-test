package com.jade.nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

public class NioTest11 {
    public static void main(String[] args) throws IOException {

//        构建socket server
        ServerSocketChannel socketChannel = ServerSocketChannel.open();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(8899);
        socketChannel.socket().bind(inetSocketAddress);

        int messageLength = 2 + 3 + 4;

        ByteBuffer[] buffers = new ByteBuffer[3];
        buffers[0] = ByteBuffer.allocate(2);
        buffers[1] = ByteBuffer.allocate(3);
        buffers[2] = ByteBuffer.allocate(4);

        SocketChannel channel = socketChannel.accept();

        while (true) {

            int byteReads = 0;

            while (byteReads < messageLength) {
                long r = channel.read(buffers);
                byteReads += r;
                System.out.println("byteReads: " + byteReads);
                Arrays.asList(buffers).stream().map(buffer -> "position:" + buffer.position()
                        + ", limit:" + buffer.limit()).forEach(System.out::println);
            }


        }


    }
}
