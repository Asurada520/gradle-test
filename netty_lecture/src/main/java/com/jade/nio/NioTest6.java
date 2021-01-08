package com.jade.nio;

import java.nio.ByteBuffer;

/**
 * sliceBuffer 案例 测试 与原buffer共享相同的底层数组
 */
public class NioTest6 {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        for (int i = 0; i < byteBuffer.capacity(); i++) {
            byteBuffer.put((byte) i);
        }

        byteBuffer.position(2);
        byteBuffer.limit(6);

        ByteBuffer sliceBuffer = byteBuffer.slice();

        for (int i = 0; i < sliceBuffer.capacity(); i++) {
            byte b = sliceBuffer.get(i);
            b *= 2;
            sliceBuffer.put(i, b);
        }

        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());

        int i = 0;
        while (byteBuffer.hasRemaining()) {
            System.out.println("key: " + i++ + ", value: " + byteBuffer.get());
        }


    }
}
