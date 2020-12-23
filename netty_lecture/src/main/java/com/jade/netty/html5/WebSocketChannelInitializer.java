package com.jade.netty.html5;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

public class WebSocketChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        pipeline.addLast("HttpServerCodec", new HttpServerCodec());
        pipeline.addLast("ChunkedWriteHandler", new ChunkedWriteHandler());
//        netty http编程 使用比较多的对象 请求分块或者分段的方式 切分N段,
//        字节方式 将段聚合在一起，形成完整的request/response
        pipeline.addLast("HttpObjectAggregator", new HttpObjectAggregator(8192));

//        ws://server:port/context_path
//        访问路径：
//        ws://localhost:9999/ws
        pipeline.addLast("WebSocketServerProtocolHandler", new WebSocketServerProtocolHandler("/ws"));

        pipeline.addLast(new TextWebSocketFrameHandler());
    }
}
