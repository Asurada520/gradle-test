package com.jade.protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestServerHandler extends SimpleChannelInboundHandler<StudentInfo.Student> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, StudentInfo.Student msg) throws Exception {

    }

}
