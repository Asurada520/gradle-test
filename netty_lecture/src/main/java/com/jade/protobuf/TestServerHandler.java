package com.jade.protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestServerHandler extends SimpleChannelInboundHandler<PersonInfo.MyMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, PersonInfo.MyMessage msg) throws Exception {

        PersonInfo.MyMessage.DataType dataType = msg.getDataType();
        if(dataType == PersonInfo.MyMessage.DataType.PersonType){
            PersonInfo.Person person = msg.getPerson();
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getAddress());

        }else if(dataType == PersonInfo.MyMessage.DataType.DogType){
            PersonInfo.Dog dog = msg.getDog();
            System.out.println(dog.getName());
            System.out.println(dog.getAge());

        }else if(dataType == PersonInfo.MyMessage.DataType.CatType){
            PersonInfo.Cat cat = msg.getCat();
            System.out.println(cat.getName());
            System.out.println(cat.getCity());
        }


//        System.out.println(msg.getName());
//        System.out.println(msg.getAge());
//        System.out.println(msg.getAddress());

    }

}
