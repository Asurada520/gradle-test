package com.jade.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("NIOTest.txt");

        FileChannel channel = fileInputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        channel.read(byteBuffer);

        byteBuffer.flip();

        while (byteBuffer.remaining() > 0) {
            byte b = byteBuffer.get();
            System.out.println("Character:" + (char) b);
        }

        fileInputStream.close();


    }
}
