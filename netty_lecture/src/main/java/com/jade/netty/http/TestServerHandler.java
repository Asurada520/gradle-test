package com.jade.netty.http;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;

import java.net.URI;

/**
 * 自定义处理器
 * SimpleInChannelInBoundHandler
 *
 * 进来的请求的一个处理
 *
 *
 */
public class TestServerHandler extends SimpleChannelInboundHandler<HttpObject> {


    /**
     * 读取客户端请求 返回给客户端响应
     * @param ctx
     * @param msg
     * @throws Exception
     */

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
        System.out.println(msg.getClass());
        System.out.println(ctx.channel().remoteAddress());

        Thread.sleep(8000);

        if (msg instanceof HttpRequest) {

            HttpRequest httpRequest = (HttpRequest)msg;

            String name = httpRequest.method().name();
            System.out.println("请求方法名称："+ name);

            String uriName = httpRequest.uri();
            System.out.println("uriName:" + uriName);


            URI uri = new URI(uriName);
            String path = uri.getPath();

            if("/favicon.ico".equals(path)){
                System.out.println("请求 favicon.ico");
                return;
            }
//            构造返回内容 返回给客户端
            ByteBuf content = Unpooled.copiedBuffer("hello world ", CharsetUtil.UTF_8);
//            构造响应对象  指定协议 响应状态 响应内容
            FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, content);
//            设置头信息 内容类型-字符串， 响应内容长度-字节数
            response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");
            response.headers().set(HttpHeaderNames.CONTENT_LENGTH, content.readableBytes());
//            写入缓存缓存区 和 刷新到客户端
            ctx.writeAndFlush(response);
//            关闭连接
            ctx.channel().close();

        }
    }

    //      通道活动
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelActive");
        super.channelActive(ctx);
    }
    //      通道注册
    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelRegistered");
        super.channelRegistered(ctx);
    }
    //      通道添加
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("handlerAdded");
        super.handlerAdded(ctx);
    }
    //      通道不活动
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelInactive");
        super.channelInactive(ctx);
    }
    //      通道注销
    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channelUnregistered");
        super.channelUnregistered(ctx);
    }



}
