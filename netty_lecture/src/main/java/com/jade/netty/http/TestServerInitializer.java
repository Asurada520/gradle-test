package com.jade.netty.http;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * 初始化器
 * ChannelInitializer
 */
public class TestServerInitializer extends ChannelInitializer<SocketChannel> {

    /**
     * 初始化管道 回调方法
     * @param socketChannel
     * @throws Exception
     */
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        /*
            管道
                每个管道可以有很多的handler
                    每个handler相当于拦截器
                    每个拦截器 针对本身请求或者业务情况，来完成相应的处理
         */
        ChannelPipeline pipeline = socketChannel.pipeline();
        /*
            系统处理器 对请求编解码用的 对httpRequest 编解码
         */
        pipeline.addLast("HttpServerCodec",new HttpServerCodec());
        /*
            自定义处理器
                实现方式 有多种
                指定名字 和 对象
         */
        pipeline.addLast("TestServerHandler",new TestServerHandler());

    }
}
