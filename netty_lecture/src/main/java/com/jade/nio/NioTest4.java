package com.jade.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest4 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        FileChannel inputChannel = fileInputStream.getChannel();

        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        while (true){
            byteBuffer.clear();
            int read = inputChannel.read(byteBuffer);
            System.out.println("Read count: " + read);

            if(-1 == read){
                break;
            }

            byteBuffer.flip();
            outputChannel.write(byteBuffer);
        }

        fileOutputStream.close();
        fileInputStream.close();


    }
}
