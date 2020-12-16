package com.jade.netty.chat;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;


/**
 * 逻辑 判断
 * 一对多连接方式， 多的一方互相通信
 * <p>
 * <p>
 * s a b c
 * 建立连接
 * 状态互相
 * 服务器端启动
 * 第一个建立连接
 * 第二个建立连接 服务器端 打印上线 下线 通知其他客户端上线下线
 * ...
 * 发送消息 消息广播
 */
public class MyChatServerHandler extends SimpleChannelInboundHandler<String> {


    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);


    /**
     * 服务器端 收到 任意一个客户端的消息，都会调用 channelRead0
     * A 发送消息 ABC 都会收到消息
     *
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        Channel channel = ctx.channel();
//        ctx.pipeline();
        channelGroup.forEach(ch -> {
            if (channel != ch) {
                ch.writeAndFlush(channel.remoteAddress() + " 发送的消息：" + msg + "\n");
            } else {
                ch.writeAndFlush("[自己] " + msg + "\n");
            }
        });


    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.writeAndFlush("【服务器】 - " + channel.remoteAddress() + " 加入\n");
        channelGroup.add(channel);
    }

    /**
     * 连接断开
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        channelGroup.writeAndFlush("【服务器】 - " + channel.remoteAddress() + " 离开\n");
//        channelGroup.remove(channel); // netty 自动调用
        System.out.println(channelGroup.size());

    }

    /**
     * 连接处于活动状态
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress() + " 上线");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress() + " 下线");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//        cause.printStackTrace();
        ctx.close();
    }
}
