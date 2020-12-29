package com.jade.grpc;

import com.jade.proto.MyRequest;
import com.jade.proto.MyResponse;
import com.jade.proto.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {

        System.out.println("接收到客户端信息：" + request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());
        responseObserver.onCompleted(); // 方法调用结束
    }
}
