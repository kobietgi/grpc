package com.demo;

import com.demo.runchart.RunChartServiceGrpc;
import com.demo.runchart.Runchart;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class RunChartClient {
  private final RunChartServiceGrpc.RunChartServiceBlockingStub blockingStub;
  private final RunChartServiceGrpc.RunChartServiceStub asyncStub;

  private final Channel channel;
 
  public RunChartClient() {
    channel = ManagedChannelBuilder.forAddress("localhost", RunChartServer.port).usePlaintext().build();
    blockingStub = RunChartServiceGrpc.newBlockingStub(channel);
    asyncStub = RunChartServiceGrpc.newStub(channel);
  }

  public Measurement getSnapShot() {
    var datapoint =  blockingStub.snapShot(Runchart.Empty.newBuilder().build());
    return new Measurement(datapoint);
  }

  public void sendMeasurements() {

    var measurements = importMeasurements();

    var responseObserver = new StreamObserver<Runchart.Empty>() {
      @Override
      public void onNext(Runchart.Empty empty) {
      }

      @Override
      public void onError(Throwable t) {
        t.printStackTrace();
      }

      @Override
      public void onCompleted() {
      }
    };
  }

  private Object importMeasurements() {
      return null;
  }
}
