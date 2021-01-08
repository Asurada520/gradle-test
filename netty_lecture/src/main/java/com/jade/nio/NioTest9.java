package com.jade.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest9 {

    public static void main(String[] args) throws Exception{

        RandomAccessFile randomAccessFile = new RandomAccessFile("NioTest9.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 5);

        map.put(0, (byte) 'a');
        map.put(1, (byte) 'b');

        randomAccessFile.close();


    }
}
