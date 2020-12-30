package com.jade.grpc;

import com.jade.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * 参考官方文档
 */
public class GPRCClient {

    public static void main(String[] args) {

//        连接服务器
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8899).usePlaintext().build();
//        阻塞桩 接收通道对象 客户端和服务端 交互的对象 底层是TCP请求
        TeacherServiceGrpc.TeacherServiceBlockingStub blockingStub = TeacherServiceGrpc.newBlockingStub(managedChannel);
//        异步桩
        TeacherServiceGrpc.TeacherServiceStub stub = TeacherServiceGrpc.newStub(managedChannel);

////        请求服务器 获取数据
//        MyResponse myResponse = blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("zhangsan").build());
//
//        System.out.println(myResponse.getRealname());
//
//        System.out.println("------------------------------------------------------");
//
//        Iterator<TeacherResponse> iterator = blockingStub.getTeacherByAge(TeacherRequest.newBuilder().setAge(20).build());
//        while (iterator.hasNext()) {
//            TeacherResponse teacher = iterator.next();
//            System.out.println(teacher.getName() + ", " + teacher.getAge() + ", " + teacher.getCity());
//        }
//
//        System.out.println("------------------------------------------------------");
//
//        StreamObserver<TeacherResponseList> teacherResponseListStreamObserver = new StreamObserver<TeacherResponseList>() {
//            @Override
//            public void onNext(TeacherResponseList value) {
//
//                value.getTeacherResponseList().forEach(teacherResponse -> {
//                    System.out.println(teacherResponse.getName());
//                    System.out.println(teacherResponse.getAge());
//                    System.out.println(teacherResponse.getCity());
//                    System.out.println("-----------------------");
//                });
//
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.out.println(t.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//
//                System.out.println("onCompeted!");
//            }
//        };
//
////          客户端 流式方式发送数据给服务端 一定是异步方式调用
//        StreamObserver<TeacherRequest> teacherRequestStreamObserver =
//                stub.getTeacherWrapperByAges(teacherResponseListStreamObserver);
//
//        teacherRequestStreamObserver.onNext(TeacherRequest.newBuilder().setAge(20).build());
//        teacherRequestStreamObserver.onNext(TeacherRequest.newBuilder().setAge(30).build());
//        teacherRequestStreamObserver.onNext(TeacherRequest.newBuilder().setAge(40).build());
//        teacherRequestStreamObserver.onNext(TeacherRequest.newBuilder().setAge(50).build());
//
//        teacherRequestStreamObserver.onCompleted();

        StreamObserver<StreamRequest> requestStreamObserver = stub.biTalk(new StreamObserver<StreamResponse>() {
            @Override
            public void onNext(StreamResponse value) {
                System.out.println(value.getResponseInfo());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }
        });

        for (int i = 0; i < 10 ; i++) {
            requestStreamObserver.onNext(StreamRequest.newBuilder().setRequestInfo(LocalDateTime.now().toString()).build());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
