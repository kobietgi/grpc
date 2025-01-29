package com.demo;

import java.time.ZonedDateTime;

import com.demo.runchart.RunChartServiceGrpc;
import com.demo.runchart.Runchart;
import com.google.protobuf.Timestamp;

import io.grpc.stub.StreamObserver;


//We will create a New RunChartService manual that
// extend RunChartServiceGrpc.RunChartServiceImplBase that has been generated
// RunChartServiceImplBase implement Bindable Interface, and AsyncService Interface
// AsyncService has snapshot method io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSnapShotMethod(), responseObserver);
public class RunChartService extends RunChartServiceGrpc.RunChartServiceImplBase {

  @Override
  public void snapShot(Runchart.Empty request, StreamObserver<Runchart.DataPoint> responseObserver) {
    var measurement = new Measurement();
    System.out.println("RunChartService contruct and return measurement datapoint");
    measurement.setTimestamp(ZonedDateTime.now());
    measurement.setPartNumber("111-22-3344");
    measurement.setNominal(10.);
    measurement.setTolerance(1.);
    measurement.setMeasurement(10.);

    responseObserver.onNext(measurement.toDataPoint());
    responseObserver.onCompleted();
  }
}
