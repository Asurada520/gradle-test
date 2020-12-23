package com.jade.netty.http;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class TestServer {

    public static void main(String[] args) throws InterruptedException {

        //  netty中 大多数有 对线程处理,控制 IO异步的操作，异步的调度
        /*
            定义线程组 事件循环组 异步事件循环组 存在死循环 tomcat也是如此 处理客户端发出的链接 服务器端编程
        bossGroup 不断的从客户端接收连接 但是不做处理 转给 workerGroup 处理
         一个线程组也可以完成 链接的接收和处理，
         但是不是好的编程方式 netty推荐两个线程组处理

         */
        EventLoopGroup bossGroup = new NioEventLoopGroup();

        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            /*
                netty API
                服务端启动类 启动ServerChannel
             */
            ServerBootstrap serverBootstrap = new ServerBootstrap();

            /*
            group method
                接收请求 转发
                处理请求

            channel method
                定义通道 反射创建

            childHandler method
                自定义处理器 对请求真正的处理
                自定义初始化器
             */
            serverBootstrap.group(bossGroup,workerGroup).channel(NioServerSocketChannel.class).childHandler(new TestServerInitializer());

            /*
                绑定端口 监听端口
             */
            ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();
            /*
                关闭监听
             */
            channelFuture.channel().closeFuture().sync();

        }finally {
//            优雅关闭线程组
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }

    }

}
