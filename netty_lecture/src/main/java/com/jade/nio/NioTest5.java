package com.jade.nio;

import java.nio.ByteBuffer;

public class NioTest5 {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(64);

        byteBuffer.putChar('琪');
        byteBuffer.putInt(6);

        byteBuffer.flip();

        System.out.println(byteBuffer.getChar());
        System.out.println(byteBuffer.getInt());
//        System.out.println(byteBuffer.getInt());

    }
}
