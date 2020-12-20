package com.jade.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

public class ProtoBufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {

        StudentInfo.Student student = StudentInfo.Student.newBuilder().setName("张三").setAge(20).setAddress("苏州").build();
        byte[] studentByteArray = student.toByteArray();

        StudentInfo.Student student1 = StudentInfo.Student.parseFrom(studentByteArray);

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());


    }
}
