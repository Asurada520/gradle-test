package com.jade.zerocopy;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

public class NewIOClient {

    public static void main(String[] args) throws IOException {

        String fileName = "E:/linux_java_env/jdk-8u161-linux-x64.tar.gz";

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8899));
        socketChannel.configureBlocking(true);

        FileChannel fileChannel = new FileInputStream(fileName).getChannel();

        long startTime =  System.currentTimeMillis();

        long transferCount = fileChannel.transferTo(0, fileChannel.size(), socketChannel);

        System.out.println("发送字节数：" + transferCount +"耗时：" +(System.currentTimeMillis() - startTime));

        fileChannel.close();

    }

}
