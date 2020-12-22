package com.jade.protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

public class TestClientHandler extends SimpleChannelInboundHandler<PersonInfo.MyMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, PersonInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        int dataType = new Random().nextInt(3);
        PersonInfo.MyMessage myMessage = null;
        if (0 == dataType) {

            PersonInfo.Person person = PersonInfo.Person.newBuilder()
                    .setName("张三").setAge(20).setAddress("苏州").build();

            myMessage = PersonInfo.MyMessage.newBuilder()
                    .setDataType(PersonInfo.MyMessage.DataType.PersonType)
                    .setPerson(person)
                    .build();

        } else if (1 == dataType) {
            PersonInfo.Dog dog = PersonInfo.Dog.newBuilder()
                    .setName("张三").setAge(20).build();

            myMessage = PersonInfo.MyMessage.newBuilder()
                    .setDataType(PersonInfo.MyMessage.DataType.DogType)
                    .setDog(dog)
                    .build();

        } else if (2 == dataType) {

            PersonInfo.Cat cat = PersonInfo.Cat.newBuilder().setName("tqq").setCity("湖南永州").build();
            myMessage = PersonInfo.MyMessage.newBuilder().setDataType(PersonInfo.MyMessage.DataType.CatType)
                    .setCat(cat)
                    .build();

        }


//        StudentInfo.Student student = StudentInfo.Student.newBuilder()
//                .setName("张三").setAge(20).setAddress("苏州").build();

        ctx.channel().writeAndFlush(myMessage);
    }
}
