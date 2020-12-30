package com.jade.proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: Teacher.proto")
public final class TeacherServiceGrpc {

  private TeacherServiceGrpc() {}

  public static final String SERVICE_NAME = "com.jade.proto.TeacherService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.jade.proto.MyRequest,
      com.jade.proto.MyResponse> METHOD_GET_REAL_NAME_BY_USERNAME =
      io.grpc.MethodDescriptor.<com.jade.proto.MyRequest, com.jade.proto.MyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.jade.proto.TeacherService", "GetRealNameByUsername"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.jade.proto.MyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.jade.proto.MyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.jade.proto.TeacherRequest,
      com.jade.proto.TeacherResponse> METHOD_GET_TEACHER_BY_AGE =
      io.grpc.MethodDescriptor.<com.jade.proto.TeacherRequest, com.jade.proto.TeacherResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.jade.proto.TeacherService", "GetTeacherByAge"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.jade.proto.TeacherRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.jade.proto.TeacherResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.jade.proto.TeacherRequest,
      com.jade.proto.TeacherResponseList> METHOD_GET_TEACHER_WRAPPER_BY_AGES =
      io.grpc.MethodDescriptor.<com.jade.proto.TeacherRequest, com.jade.proto.TeacherResponseList>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.jade.proto.TeacherService", "GetTeacherWrapperByAges"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.jade.proto.TeacherRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.jade.proto.TeacherResponseList.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.jade.proto.StreamRequest,
      com.jade.proto.StreamResponse> METHOD_BI_TALK =
      io.grpc.MethodDescriptor.<com.jade.proto.StreamRequest, com.jade.proto.StreamResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.jade.proto.TeacherService", "BiTalk"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.jade.proto.StreamRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.jade.proto.StreamResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeacherServiceStub newStub(io.grpc.Channel channel) {
    return new TeacherServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeacherServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TeacherServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeacherServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TeacherServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TeacherServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealNameByUsername(com.jade.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.jade.proto.MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REAL_NAME_BY_USERNAME, responseObserver);
    }

    /**
     */
    public void getTeacherByAge(com.jade.proto.TeacherRequest request,
        io.grpc.stub.StreamObserver<com.jade.proto.TeacherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TEACHER_BY_AGE, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jade.proto.TeacherRequest> getTeacherWrapperByAges(
        io.grpc.stub.StreamObserver<com.jade.proto.TeacherResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GET_TEACHER_WRAPPER_BY_AGES, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jade.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.jade.proto.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BI_TALK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_REAL_NAME_BY_USERNAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.jade.proto.MyRequest,
                com.jade.proto.MyResponse>(
                  this, METHODID_GET_REAL_NAME_BY_USERNAME)))
          .addMethod(
            METHOD_GET_TEACHER_BY_AGE,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jade.proto.TeacherRequest,
                com.jade.proto.TeacherResponse>(
                  this, METHODID_GET_TEACHER_BY_AGE)))
          .addMethod(
            METHOD_GET_TEACHER_WRAPPER_BY_AGES,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.jade.proto.TeacherRequest,
                com.jade.proto.TeacherResponseList>(
                  this, METHODID_GET_TEACHER_WRAPPER_BY_AGES)))
          .addMethod(
            METHOD_BI_TALK,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.jade.proto.StreamRequest,
                com.jade.proto.StreamResponse>(
                  this, METHODID_BI_TALK)))
          .build();
    }
  }

  /**
   */
  public static final class TeacherServiceStub extends io.grpc.stub.AbstractStub<TeacherServiceStub> {
    private TeacherServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealNameByUsername(com.jade.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.jade.proto.MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeacherByAge(com.jade.proto.TeacherRequest request,
        io.grpc.stub.StreamObserver<com.jade.proto.TeacherResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_TEACHER_BY_AGE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jade.proto.TeacherRequest> getTeacherWrapperByAges(
        io.grpc.stub.StreamObserver<com.jade.proto.TeacherResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GET_TEACHER_WRAPPER_BY_AGES, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jade.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.jade.proto.StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_BI_TALK, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TeacherServiceBlockingStub extends io.grpc.stub.AbstractStub<TeacherServiceBlockingStub> {
    private TeacherServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jade.proto.MyResponse getRealNameByUsername(com.jade.proto.MyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.jade.proto.TeacherResponse> getTeacherByAge(
        com.jade.proto.TeacherRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_TEACHER_BY_AGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeacherServiceFutureStub extends io.grpc.stub.AbstractStub<TeacherServiceFutureStub> {
    private TeacherServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TeacherServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TeacherServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jade.proto.MyResponse> getRealNameByUsername(
        com.jade.proto.MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REAL_NAME_BY_USERNAME, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME_BY_USERNAME = 0;
  private static final int METHODID_GET_TEACHER_BY_AGE = 1;
  private static final int METHODID_GET_TEACHER_WRAPPER_BY_AGES = 2;
  private static final int METHODID_BI_TALK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeacherServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TeacherServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME_BY_USERNAME:
          serviceImpl.getRealNameByUsername((com.jade.proto.MyRequest) request,
              (io.grpc.stub.StreamObserver<com.jade.proto.MyResponse>) responseObserver);
          break;
        case METHODID_GET_TEACHER_BY_AGE:
          serviceImpl.getTeacherByAge((com.jade.proto.TeacherRequest) request,
              (io.grpc.stub.StreamObserver<com.jade.proto.TeacherResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEACHER_WRAPPER_BY_AGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getTeacherWrapperByAges(
              (io.grpc.stub.StreamObserver<com.jade.proto.TeacherResponseList>) responseObserver);
        case METHODID_BI_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biTalk(
              (io.grpc.stub.StreamObserver<com.jade.proto.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class TeacherServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jade.proto.TeacherProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TeacherServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeacherServiceDescriptorSupplier())
              .addMethod(METHOD_GET_REAL_NAME_BY_USERNAME)
              .addMethod(METHOD_GET_TEACHER_BY_AGE)
              .addMethod(METHOD_GET_TEACHER_WRAPPER_BY_AGES)
              .addMethod(METHOD_BI_TALK)
              .build();
        }
      }
    }
    return result;
  }
}
