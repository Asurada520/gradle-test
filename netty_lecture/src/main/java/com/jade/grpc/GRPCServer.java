package com.jade.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {

    private Server server;

    private void start() throws IOException {

        this.server = ServerBuilder.forPort(8899).addService(new TeacherServiceImpl()).build().start();

        System.out.println("server started");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("关闭JVM");
            GRPCServer.this.stop();
        }));

        System.out.println("执行到这里");

    }

    private void stop() {
        if (null != this.server) {
            this.server.shutdown();
        }
    }

    private void awaitTermination() throws InterruptedException {
        if (null != this.server) {
            this.server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        GRPCServer grpcServer = new GRPCServer();
        grpcServer.start();
        grpcServer.awaitTermination();

    }

}
