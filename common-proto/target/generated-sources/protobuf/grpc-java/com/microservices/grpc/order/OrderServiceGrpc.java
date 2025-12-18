package com.microservices.grpc.order;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: order.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "order.OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.order.GetOrderRequest,
      com.microservices.grpc.order.OrderResponse> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrder",
      requestType = com.microservices.grpc.order.GetOrderRequest.class,
      responseType = com.microservices.grpc.order.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.order.GetOrderRequest,
      com.microservices.grpc.order.OrderResponse> getGetOrderMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.order.GetOrderRequest, com.microservices.grpc.order.OrderResponse> getGetOrderMethod;
    if ((getGetOrderMethod = OrderServiceGrpc.getGetOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrderMethod = OrderServiceGrpc.getGetOrderMethod) == null) {
          OrderServiceGrpc.getGetOrderMethod = getGetOrderMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.order.GetOrderRequest, com.microservices.grpc.order.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.GetOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetOrder"))
              .build();
        }
      }
    }
    return getGetOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.order.GetOrdersByUserRequest,
      com.microservices.grpc.order.OrdersResponse> getGetOrdersByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrdersByUser",
      requestType = com.microservices.grpc.order.GetOrdersByUserRequest.class,
      responseType = com.microservices.grpc.order.OrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.order.GetOrdersByUserRequest,
      com.microservices.grpc.order.OrdersResponse> getGetOrdersByUserMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.order.GetOrdersByUserRequest, com.microservices.grpc.order.OrdersResponse> getGetOrdersByUserMethod;
    if ((getGetOrdersByUserMethod = OrderServiceGrpc.getGetOrdersByUserMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrdersByUserMethod = OrderServiceGrpc.getGetOrdersByUserMethod) == null) {
          OrderServiceGrpc.getGetOrdersByUserMethod = getGetOrdersByUserMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.order.GetOrdersByUserRequest, com.microservices.grpc.order.OrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrdersByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.GetOrdersByUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.OrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetOrdersByUser"))
              .build();
        }
      }
    }
    return getGetOrdersByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.order.GetAllOrdersRequest,
      com.microservices.grpc.order.OrdersResponse> getGetAllOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllOrders",
      requestType = com.microservices.grpc.order.GetAllOrdersRequest.class,
      responseType = com.microservices.grpc.order.OrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.order.GetAllOrdersRequest,
      com.microservices.grpc.order.OrdersResponse> getGetAllOrdersMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.order.GetAllOrdersRequest, com.microservices.grpc.order.OrdersResponse> getGetAllOrdersMethod;
    if ((getGetAllOrdersMethod = OrderServiceGrpc.getGetAllOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetAllOrdersMethod = OrderServiceGrpc.getGetAllOrdersMethod) == null) {
          OrderServiceGrpc.getGetAllOrdersMethod = getGetAllOrdersMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.order.GetAllOrdersRequest, com.microservices.grpc.order.OrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.GetAllOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.OrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetAllOrders"))
              .build();
        }
      }
    }
    return getGetAllOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.order.CreateOrderRequest,
      com.microservices.grpc.order.OrderResponse> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrder",
      requestType = com.microservices.grpc.order.CreateOrderRequest.class,
      responseType = com.microservices.grpc.order.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.order.CreateOrderRequest,
      com.microservices.grpc.order.OrderResponse> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.order.CreateOrderRequest, com.microservices.grpc.order.OrderResponse> getCreateOrderMethod;
    if ((getCreateOrderMethod = OrderServiceGrpc.getCreateOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getCreateOrderMethod = OrderServiceGrpc.getCreateOrderMethod) == null) {
          OrderServiceGrpc.getCreateOrderMethod = getCreateOrderMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.order.CreateOrderRequest, com.microservices.grpc.order.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("CreateOrder"))
              .build();
        }
      }
    }
    return getCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.order.UpdateOrderStatusRequest,
      com.microservices.grpc.order.OrderResponse> getUpdateOrderStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrderStatus",
      requestType = com.microservices.grpc.order.UpdateOrderStatusRequest.class,
      responseType = com.microservices.grpc.order.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.order.UpdateOrderStatusRequest,
      com.microservices.grpc.order.OrderResponse> getUpdateOrderStatusMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.order.UpdateOrderStatusRequest, com.microservices.grpc.order.OrderResponse> getUpdateOrderStatusMethod;
    if ((getUpdateOrderStatusMethod = OrderServiceGrpc.getUpdateOrderStatusMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getUpdateOrderStatusMethod = OrderServiceGrpc.getUpdateOrderStatusMethod) == null) {
          OrderServiceGrpc.getUpdateOrderStatusMethod = getUpdateOrderStatusMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.order.UpdateOrderStatusRequest, com.microservices.grpc.order.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrderStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.UpdateOrderStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("UpdateOrderStatus"))
              .build();
        }
      }
    }
    return getUpdateOrderStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.order.CancelOrderRequest,
      com.microservices.grpc.order.CancelResponse> getCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOrder",
      requestType = com.microservices.grpc.order.CancelOrderRequest.class,
      responseType = com.microservices.grpc.order.CancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.order.CancelOrderRequest,
      com.microservices.grpc.order.CancelResponse> getCancelOrderMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.order.CancelOrderRequest, com.microservices.grpc.order.CancelResponse> getCancelOrderMethod;
    if ((getCancelOrderMethod = OrderServiceGrpc.getCancelOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getCancelOrderMethod = OrderServiceGrpc.getCancelOrderMethod) == null) {
          OrderServiceGrpc.getCancelOrderMethod = getCancelOrderMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.order.CancelOrderRequest, com.microservices.grpc.order.CancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.CancelOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order.CancelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("CancelOrder"))
              .build();
        }
      }
    }
    return getCancelOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub>() {
        @java.lang.Override
        public OrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceStub(channel, callOptions);
        }
      };
    return OrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub>() {
        @java.lang.Override
        public OrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub>() {
        @java.lang.Override
        public OrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceFutureStub(channel, callOptions);
        }
      };
    return OrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getOrder(com.microservices.grpc.order.GetOrderRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    /**
     */
    default void getOrdersByUser(com.microservices.grpc.order.GetOrdersByUserRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrdersByUserMethod(), responseObserver);
    }

    /**
     */
    default void getAllOrders(com.microservices.grpc.order.GetAllOrdersRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllOrdersMethod(), responseObserver);
    }

    /**
     */
    default void createOrder(com.microservices.grpc.order.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }

    /**
     */
    default void updateOrderStatus(com.microservices.grpc.order.UpdateOrderStatusRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrderStatusMethod(), responseObserver);
    }

    /**
     */
    default void cancelOrder(com.microservices.grpc.order.CancelOrderRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.CancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOrderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrderService.
   */
  public static abstract class OrderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrderService.
   */
  public static final class OrderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrderServiceStub> {
    private OrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOrder(com.microservices.grpc.order.GetOrderRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrdersByUser(com.microservices.grpc.order.GetOrdersByUserRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrdersByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllOrders(com.microservices.grpc.order.GetAllOrdersRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOrder(com.microservices.grpc.order.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrderStatus(com.microservices.grpc.order.UpdateOrderStatusRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrderStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOrder(com.microservices.grpc.order.CancelOrderRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order.CancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrderService.
   */
  public static final class OrderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.microservices.grpc.order.OrderResponse getOrder(com.microservices.grpc.order.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.order.OrdersResponse getOrdersByUser(com.microservices.grpc.order.GetOrdersByUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrdersByUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.order.OrdersResponse getAllOrders(com.microservices.grpc.order.GetAllOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.order.OrderResponse createOrder(com.microservices.grpc.order.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.order.OrderResponse updateOrderStatus(com.microservices.grpc.order.UpdateOrderStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrderStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.order.CancelResponse cancelOrder(com.microservices.grpc.order.CancelOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrderService.
   */
  public static final class OrderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.order.OrderResponse> getOrder(
        com.microservices.grpc.order.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.order.OrdersResponse> getOrdersByUser(
        com.microservices.grpc.order.GetOrdersByUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrdersByUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.order.OrdersResponse> getAllOrders(
        com.microservices.grpc.order.GetAllOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.order.OrderResponse> createOrder(
        com.microservices.grpc.order.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.order.OrderResponse> updateOrderStatus(
        com.microservices.grpc.order.UpdateOrderStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrderStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.order.CancelResponse> cancelOrder(
        com.microservices.grpc.order.CancelOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ORDER = 0;
  private static final int METHODID_GET_ORDERS_BY_USER = 1;
  private static final int METHODID_GET_ALL_ORDERS = 2;
  private static final int METHODID_CREATE_ORDER = 3;
  private static final int METHODID_UPDATE_ORDER_STATUS = 4;
  private static final int METHODID_CANCEL_ORDER = 5;

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
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((com.microservices.grpc.order.GetOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse>) responseObserver);
          break;
        case METHODID_GET_ORDERS_BY_USER:
          serviceImpl.getOrdersByUser((com.microservices.grpc.order.GetOrdersByUserRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrdersResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ORDERS:
          serviceImpl.getAllOrders((com.microservices.grpc.order.GetAllOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrdersResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((com.microservices.grpc.order.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER_STATUS:
          serviceImpl.updateOrderStatus((com.microservices.grpc.order.UpdateOrderStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.order.OrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((com.microservices.grpc.order.CancelOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.order.CancelResponse>) responseObserver);
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
          getGetOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.order.GetOrderRequest,
              com.microservices.grpc.order.OrderResponse>(
                service, METHODID_GET_ORDER)))
        .addMethod(
          getGetOrdersByUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.order.GetOrdersByUserRequest,
              com.microservices.grpc.order.OrdersResponse>(
                service, METHODID_GET_ORDERS_BY_USER)))
        .addMethod(
          getGetAllOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.order.GetAllOrdersRequest,
              com.microservices.grpc.order.OrdersResponse>(
                service, METHODID_GET_ALL_ORDERS)))
        .addMethod(
          getCreateOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.order.CreateOrderRequest,
              com.microservices.grpc.order.OrderResponse>(
                service, METHODID_CREATE_ORDER)))
        .addMethod(
          getUpdateOrderStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.order.UpdateOrderStatusRequest,
              com.microservices.grpc.order.OrderResponse>(
                service, METHODID_UPDATE_ORDER_STATUS)))
        .addMethod(
          getCancelOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.order.CancelOrderRequest,
              com.microservices.grpc.order.CancelResponse>(
                service, METHODID_CANCEL_ORDER)))
        .build();
  }

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.microservices.grpc.order.OrderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getGetOrderMethod())
              .addMethod(getGetOrdersByUserMethod())
              .addMethod(getGetAllOrdersMethod())
              .addMethod(getCreateOrderMethod())
              .addMethod(getUpdateOrderStatusMethod())
              .addMethod(getCancelOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
