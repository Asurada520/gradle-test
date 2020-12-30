package com.jade.grpc;

import com.jade.proto.*;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

public class TeacherServiceImpl extends TeacherServiceGrpc.TeacherServiceImplBase {

    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {

        System.out.println("接收到客户端信息：" + request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());
        responseObserver.onCompleted(); // 方法调用结束
    }


    @Override
    public void getTeacherByAge(TeacherRequest request, StreamObserver<TeacherResponse> responseObserver) {
        System.out.println("接收到客户端信息：" + request.getAge());

        responseObserver.onNext(TeacherResponse.newBuilder().setName("张三").setAge(20).setCity("北京").build());
        responseObserver.onNext(TeacherResponse.newBuilder().setName("李四").setAge(30).setCity("天津").build());
        responseObserver.onNext(TeacherResponse.newBuilder().setName("王五").setAge(40).setCity("上海").build());
        responseObserver.onNext(TeacherResponse.newBuilder().setName("赵六").setAge(50).setCity("深圳市").build());

        responseObserver.onCompleted();
    }


    @Override
    public StreamObserver<TeacherRequest> getTeacherWrapperByAges(StreamObserver<TeacherResponseList> responseObserver) {

        StreamObserver<TeacherRequest> streamObserver = new StreamObserver<TeacherRequest>() {
            @Override
            public void onNext(TeacherRequest value) {
                System.out.println("onNext: " + value.getAge());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                TeacherResponse teacherResponse = TeacherResponse.newBuilder().setName("张三").setAge(20).setCity("北京").build();
                TeacherResponse teacherResponse2 = TeacherResponse.newBuilder().setName("李四").setAge(30).setCity("南京").build();

                TeacherResponseList responseList = TeacherResponseList.newBuilder()
                        .addTeacherResponse(teacherResponse)
                        .addTeacherResponse(teacherResponse2)
                        .build();
                responseObserver.onNext(responseList);
                responseObserver.onCompleted();
            }
        };

        return streamObserver;
    }

    @Override
    public StreamObserver<StreamRequest> biTalk(StreamObserver<StreamResponse> responseObserver) {

        return new StreamObserver<StreamRequest>() {
            @Override
            public void onNext(StreamRequest value) {
                System.out.println(value.getRequestInfo());
                responseObserver.onNext(StreamResponse.newBuilder().setResponseInfo(UUID.randomUUID().toString()).build());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
