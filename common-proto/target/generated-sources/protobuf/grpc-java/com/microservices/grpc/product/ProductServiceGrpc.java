package com.microservices.grpc.product;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: product.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "product.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductRequest,
      com.microservices.grpc.product.ProductResponse> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = com.microservices.grpc.product.GetProductRequest.class,
      responseType = com.microservices.grpc.product.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductRequest,
      com.microservices.grpc.product.ProductResponse> getGetProductMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductRequest, com.microservices.grpc.product.ProductResponse> getGetProductMethod;
    if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
          ProductServiceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.product.GetProductRequest, com.microservices.grpc.product.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductsByIdsRequest,
      com.microservices.grpc.product.ProductsResponse> getGetProductsByIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsByIds",
      requestType = com.microservices.grpc.product.GetProductsByIdsRequest.class,
      responseType = com.microservices.grpc.product.ProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductsByIdsRequest,
      com.microservices.grpc.product.ProductsResponse> getGetProductsByIdsMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductsByIdsRequest, com.microservices.grpc.product.ProductsResponse> getGetProductsByIdsMethod;
    if ((getGetProductsByIdsMethod = ProductServiceGrpc.getGetProductsByIdsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductsByIdsMethod = ProductServiceGrpc.getGetProductsByIdsMethod) == null) {
          ProductServiceGrpc.getGetProductsByIdsMethod = getGetProductsByIdsMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.product.GetProductsByIdsRequest, com.microservices.grpc.product.ProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsByIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.GetProductsByIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.ProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductsByIds"))
              .build();
        }
      }
    }
    return getGetProductsByIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.product.GetAllProductsRequest,
      com.microservices.grpc.product.ProductsResponse> getGetAllProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllProducts",
      requestType = com.microservices.grpc.product.GetAllProductsRequest.class,
      responseType = com.microservices.grpc.product.ProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.product.GetAllProductsRequest,
      com.microservices.grpc.product.ProductsResponse> getGetAllProductsMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.product.GetAllProductsRequest, com.microservices.grpc.product.ProductsResponse> getGetAllProductsMethod;
    if ((getGetAllProductsMethod = ProductServiceGrpc.getGetAllProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetAllProductsMethod = ProductServiceGrpc.getGetAllProductsMethod) == null) {
          ProductServiceGrpc.getGetAllProductsMethod = getGetAllProductsMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.product.GetAllProductsRequest, com.microservices.grpc.product.ProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.GetAllProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.ProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetAllProducts"))
              .build();
        }
      }
    }
    return getGetAllProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductsByCategoryRequest,
      com.microservices.grpc.product.ProductsResponse> getGetProductsByCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsByCategory",
      requestType = com.microservices.grpc.product.GetProductsByCategoryRequest.class,
      responseType = com.microservices.grpc.product.ProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductsByCategoryRequest,
      com.microservices.grpc.product.ProductsResponse> getGetProductsByCategoryMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.product.GetProductsByCategoryRequest, com.microservices.grpc.product.ProductsResponse> getGetProductsByCategoryMethod;
    if ((getGetProductsByCategoryMethod = ProductServiceGrpc.getGetProductsByCategoryMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductsByCategoryMethod = ProductServiceGrpc.getGetProductsByCategoryMethod) == null) {
          ProductServiceGrpc.getGetProductsByCategoryMethod = getGetProductsByCategoryMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.product.GetProductsByCategoryRequest, com.microservices.grpc.product.ProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsByCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.GetProductsByCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.ProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductsByCategory"))
              .build();
        }
      }
    }
    return getGetProductsByCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.product.CreateProductRequest,
      com.microservices.grpc.product.ProductResponse> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProduct",
      requestType = com.microservices.grpc.product.CreateProductRequest.class,
      responseType = com.microservices.grpc.product.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.product.CreateProductRequest,
      com.microservices.grpc.product.ProductResponse> getCreateProductMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.product.CreateProductRequest, com.microservices.grpc.product.ProductResponse> getCreateProductMethod;
    if ((getCreateProductMethod = ProductServiceGrpc.getCreateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getCreateProductMethod = ProductServiceGrpc.getCreateProductMethod) == null) {
          ProductServiceGrpc.getCreateProductMethod = getCreateProductMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.product.CreateProductRequest, com.microservices.grpc.product.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.CreateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("CreateProduct"))
              .build();
        }
      }
    }
    return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.product.UpdateProductRequest,
      com.microservices.grpc.product.ProductResponse> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = com.microservices.grpc.product.UpdateProductRequest.class,
      responseType = com.microservices.grpc.product.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.product.UpdateProductRequest,
      com.microservices.grpc.product.ProductResponse> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.product.UpdateProductRequest, com.microservices.grpc.product.ProductResponse> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
          ProductServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.product.UpdateProductRequest, com.microservices.grpc.product.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.UpdateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.product.UpdateStockRequest,
      com.microservices.grpc.product.StockUpdateResponse> getUpdateStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStock",
      requestType = com.microservices.grpc.product.UpdateStockRequest.class,
      responseType = com.microservices.grpc.product.StockUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.product.UpdateStockRequest,
      com.microservices.grpc.product.StockUpdateResponse> getUpdateStockMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.product.UpdateStockRequest, com.microservices.grpc.product.StockUpdateResponse> getUpdateStockMethod;
    if ((getUpdateStockMethod = ProductServiceGrpc.getUpdateStockMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getUpdateStockMethod = ProductServiceGrpc.getUpdateStockMethod) == null) {
          ProductServiceGrpc.getUpdateStockMethod = getUpdateStockMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.product.UpdateStockRequest, com.microservices.grpc.product.StockUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.UpdateStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.StockUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("UpdateStock"))
              .build();
        }
      }
    }
    return getUpdateStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.product.DeleteProductRequest,
      com.microservices.grpc.product.DeleteResponse> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = com.microservices.grpc.product.DeleteProductRequest.class,
      responseType = com.microservices.grpc.product.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.product.DeleteProductRequest,
      com.microservices.grpc.product.DeleteResponse> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.product.DeleteProductRequest, com.microservices.grpc.product.DeleteResponse> getDeleteProductMethod;
    if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
          ProductServiceGrpc.getDeleteProductMethod = getDeleteProductMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.product.DeleteProductRequest, com.microservices.grpc.product.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.DeleteProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.product.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("DeleteProduct"))
              .build();
        }
      }
    }
    return getDeleteProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProduct(com.microservices.grpc.product.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    default void getProductsByIds(com.microservices.grpc.product.GetProductsByIdsRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsByIdsMethod(), responseObserver);
    }

    /**
     */
    default void getAllProducts(com.microservices.grpc.product.GetAllProductsRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllProductsMethod(), responseObserver);
    }

    /**
     */
    default void getProductsByCategory(com.microservices.grpc.product.GetProductsByCategoryRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsByCategoryMethod(), responseObserver);
    }

    /**
     */
    default void createProduct(com.microservices.grpc.product.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    default void updateProduct(com.microservices.grpc.product.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    default void updateStock(com.microservices.grpc.product.UpdateStockRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.StockUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStockMethod(), responseObserver);
    }

    /**
     */
    default void deleteProduct(com.microservices.grpc.product.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductService.
   */
  public static abstract class ProductServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProduct(com.microservices.grpc.product.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsByIds(com.microservices.grpc.product.GetProductsByIdsRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsByIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProducts(com.microservices.grpc.product.GetAllProductsRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsByCategory(com.microservices.grpc.product.GetProductsByCategoryRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsByCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProduct(com.microservices.grpc.product.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.microservices.grpc.product.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStock(com.microservices.grpc.product.UpdateStockRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.StockUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.microservices.grpc.product.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.product.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.microservices.grpc.product.ProductResponse getProduct(com.microservices.grpc.product.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.product.ProductsResponse getProductsByIds(com.microservices.grpc.product.GetProductsByIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsByIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.product.ProductsResponse getAllProducts(com.microservices.grpc.product.GetAllProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.product.ProductsResponse getProductsByCategory(com.microservices.grpc.product.GetProductsByCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsByCategoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.product.ProductResponse createProduct(com.microservices.grpc.product.CreateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.product.ProductResponse updateProduct(com.microservices.grpc.product.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.product.StockUpdateResponse updateStock(com.microservices.grpc.product.UpdateStockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.product.DeleteResponse deleteProduct(com.microservices.grpc.product.DeleteProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductService.
   */
  public static final class ProductServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.product.ProductResponse> getProduct(
        com.microservices.grpc.product.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.product.ProductsResponse> getProductsByIds(
        com.microservices.grpc.product.GetProductsByIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsByIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.product.ProductsResponse> getAllProducts(
        com.microservices.grpc.product.GetAllProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.product.ProductsResponse> getProductsByCategory(
        com.microservices.grpc.product.GetProductsByCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsByCategoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.product.ProductResponse> createProduct(
        com.microservices.grpc.product.CreateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.product.ProductResponse> updateProduct(
        com.microservices.grpc.product.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.product.StockUpdateResponse> updateStock(
        com.microservices.grpc.product.UpdateStockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.product.DeleteResponse> deleteProduct(
        com.microservices.grpc.product.DeleteProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCTS_BY_IDS = 1;
  private static final int METHODID_GET_ALL_PRODUCTS = 2;
  private static final int METHODID_GET_PRODUCTS_BY_CATEGORY = 3;
  private static final int METHODID_CREATE_PRODUCT = 4;
  private static final int METHODID_UPDATE_PRODUCT = 5;
  private static final int METHODID_UPDATE_STOCK = 6;
  private static final int METHODID_DELETE_PRODUCT = 7;

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
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((com.microservices.grpc.product.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_IDS:
          serviceImpl.getProductsByIds((com.microservices.grpc.product.GetProductsByIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PRODUCTS:
          serviceImpl.getAllProducts((com.microservices.grpc.product.GetAllProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_CATEGORY:
          serviceImpl.getProductsByCategory((com.microservices.grpc.product.GetProductsByCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductsResponse>) responseObserver);
          break;
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((com.microservices.grpc.product.CreateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.microservices.grpc.product.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.product.ProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STOCK:
          serviceImpl.updateStock((com.microservices.grpc.product.UpdateStockRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.product.StockUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.microservices.grpc.product.DeleteProductRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.product.DeleteResponse>) responseObserver);
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
          getGetProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.product.GetProductRequest,
              com.microservices.grpc.product.ProductResponse>(
                service, METHODID_GET_PRODUCT)))
        .addMethod(
          getGetProductsByIdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.product.GetProductsByIdsRequest,
              com.microservices.grpc.product.ProductsResponse>(
                service, METHODID_GET_PRODUCTS_BY_IDS)))
        .addMethod(
          getGetAllProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.product.GetAllProductsRequest,
              com.microservices.grpc.product.ProductsResponse>(
                service, METHODID_GET_ALL_PRODUCTS)))
        .addMethod(
          getGetProductsByCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.product.GetProductsByCategoryRequest,
              com.microservices.grpc.product.ProductsResponse>(
                service, METHODID_GET_PRODUCTS_BY_CATEGORY)))
        .addMethod(
          getCreateProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.product.CreateProductRequest,
              com.microservices.grpc.product.ProductResponse>(
                service, METHODID_CREATE_PRODUCT)))
        .addMethod(
          getUpdateProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.product.UpdateProductRequest,
              com.microservices.grpc.product.ProductResponse>(
                service, METHODID_UPDATE_PRODUCT)))
        .addMethod(
          getUpdateStockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.product.UpdateStockRequest,
              com.microservices.grpc.product.StockUpdateResponse>(
                service, METHODID_UPDATE_STOCK)))
        .addMethod(
          getDeleteProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.product.DeleteProductRequest,
              com.microservices.grpc.product.DeleteResponse>(
                service, METHODID_DELETE_PRODUCT)))
        .build();
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.microservices.grpc.product.ProductProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetProductMethod())
              .addMethod(getGetProductsByIdsMethod())
              .addMethod(getGetAllProductsMethod())
              .addMethod(getGetProductsByCategoryMethod())
              .addMethod(getCreateProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getUpdateStockMethod())
              .addMethod(getDeleteProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
