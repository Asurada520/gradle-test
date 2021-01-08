package com.jade.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest3 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("NIOTest3.txt");

        FileChannel channel = fileOutputStream.getChannel();

        byte[] message = "Hello World, NinHao".getBytes();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        for (int i = 0; i <message.length ; i++) {
            byteBuffer.put(message[i]);
        }

        byteBuffer.flip();

        channel.write(byteBuffer);


        fileOutputStream.close();


    }
}
