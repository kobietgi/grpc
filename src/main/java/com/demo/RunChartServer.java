package com.demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.grpc.BindableService;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;

//can host multiple services.
public class RunChartServer { 

  public static final int port = 3030;
  private final Server server;

  public RunChartServer() {
    var builder = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create());
    server = builder.addService((BindableService) new RunChartService()).build();
  }

  public void start() throws IOException {
    server.start();
    System.out.println("server started...");

    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        try {
          RunChartServer.this.stop();
        } catch (InterruptedException e) {
          e.printStackTrace(System.err);
        }
      }
    });
  }

  public void stop() throws InterruptedException {
    if (server != null) {
      server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
    }
  }

}
