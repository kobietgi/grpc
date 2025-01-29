package com.demo.runchart;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * these service will be generated in java file, and implement on this.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: runchart.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RunChartServiceGrpc {

  private RunChartServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "runchart.RunChartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.demo.runchart.Runchart.Empty,
      com.demo.runchart.Runchart.DataPoint> getSnapShotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SnapShot",
      requestType = com.demo.runchart.Runchart.Empty.class,
      responseType = com.demo.runchart.Runchart.DataPoint.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demo.runchart.Runchart.Empty,
      com.demo.runchart.Runchart.DataPoint> getSnapShotMethod() {
    io.grpc.MethodDescriptor<com.demo.runchart.Runchart.Empty, com.demo.runchart.Runchart.DataPoint> getSnapShotMethod;
    if ((getSnapShotMethod = RunChartServiceGrpc.getSnapShotMethod) == null) {
      synchronized (RunChartServiceGrpc.class) {
        if ((getSnapShotMethod = RunChartServiceGrpc.getSnapShotMethod) == null) {
          RunChartServiceGrpc.getSnapShotMethod = getSnapShotMethod =
              io.grpc.MethodDescriptor.<com.demo.runchart.Runchart.Empty, com.demo.runchart.Runchart.DataPoint>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SnapShot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.runchart.Runchart.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.runchart.Runchart.DataPoint.getDefaultInstance()))
              .setSchemaDescriptor(new RunChartServiceMethodDescriptorSupplier("SnapShot"))
              .build();
        }
      }
    }
    return getSnapShotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RunChartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RunChartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RunChartServiceStub>() {
        @java.lang.Override
        public RunChartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RunChartServiceStub(channel, callOptions);
        }
      };
    return RunChartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RunChartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RunChartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RunChartServiceBlockingStub>() {
        @java.lang.Override
        public RunChartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RunChartServiceBlockingStub(channel, callOptions);
        }
      };
    return RunChartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RunChartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RunChartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RunChartServiceFutureStub>() {
        @java.lang.Override
        public RunChartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RunChartServiceFutureStub(channel, callOptions);
        }
      };
    return RunChartServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * these service will be generated in java file, and implement on this.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void snapShot(com.demo.runchart.Runchart.Empty request,
        io.grpc.stub.StreamObserver<com.demo.runchart.Runchart.DataPoint> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSnapShotMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RunChartService.
   * <pre>
   * these service will be generated in java file, and implement on this.
   * </pre>
   */
  public static abstract class RunChartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RunChartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RunChartService.
   * <pre>
   * these service will be generated in java file, and implement on this.
   * </pre>
   */
  public static final class RunChartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RunChartServiceStub> {
    private RunChartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RunChartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RunChartServiceStub(channel, callOptions);
    }

    /**
     */
    public void snapShot(com.demo.runchart.Runchart.Empty request,
        io.grpc.stub.StreamObserver<com.demo.runchart.Runchart.DataPoint> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSnapShotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RunChartService.
   * <pre>
   * these service will be generated in java file, and implement on this.
   * </pre>
   */
  public static final class RunChartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RunChartServiceBlockingStub> {
    private RunChartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RunChartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RunChartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.demo.runchart.Runchart.DataPoint snapShot(com.demo.runchart.Runchart.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSnapShotMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RunChartService.
   * <pre>
   * these service will be generated in java file, and implement on this.
   * </pre>
   */
  public static final class RunChartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RunChartServiceFutureStub> {
    private RunChartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RunChartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RunChartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demo.runchart.Runchart.DataPoint> snapShot(
        com.demo.runchart.Runchart.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSnapShotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SNAP_SHOT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SNAP_SHOT:
          serviceImpl.snapShot((com.demo.runchart.Runchart.Empty) request,
              (io.grpc.stub.StreamObserver<com.demo.runchart.Runchart.DataPoint>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSnapShotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.demo.runchart.Runchart.Empty,
              com.demo.runchart.Runchart.DataPoint>(
                service, METHODID_SNAP_SHOT)))
        .build();
  }

  private static abstract class RunChartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RunChartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.demo.runchart.Runchart.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RunChartService");
    }
  }

  private static final class RunChartServiceFileDescriptorSupplier
      extends RunChartServiceBaseDescriptorSupplier {
    RunChartServiceFileDescriptorSupplier() {}
  }

  private static final class RunChartServiceMethodDescriptorSupplier
      extends RunChartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RunChartServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RunChartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RunChartServiceFileDescriptorSupplier())
              .addMethod(getSnapShotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
