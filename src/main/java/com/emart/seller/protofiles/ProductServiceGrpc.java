package protoFiles;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.ListResponse> getItemSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "itemSearch",
      requestType = protoFiles.ProductProto.PayloadRequest.class,
      responseType = protoFiles.ProductProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.ListResponse> getItemSearchMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.ListResponse> getItemSearchMethod;
    if ((getItemSearchMethod = ProductServiceGrpc.getItemSearchMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getItemSearchMethod = ProductServiceGrpc.getItemSearchMethod) == null) {
          ProductServiceGrpc.getItemSearchMethod = getItemSearchMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "itemSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("itemSearch"))
              .build();
        }
      }
    }
    return getItemSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getItemAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "itemAdd",
      requestType = protoFiles.ProductProto.PayloadRequest.class,
      responseType = protoFiles.ProductProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getItemAddMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse> getItemAddMethod;
    if ((getItemAddMethod = ProductServiceGrpc.getItemAddMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getItemAddMethod = ProductServiceGrpc.getItemAddMethod) == null) {
          ProductServiceGrpc.getItemAddMethod = getItemAddMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "itemAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("itemAdd"))
              .build();
        }
      }
    }
    return getItemAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getItemDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "itemDelete",
      requestType = protoFiles.ProductProto.PayloadRequest.class,
      responseType = protoFiles.ProductProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getItemDeleteMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse> getItemDeleteMethod;
    if ((getItemDeleteMethod = ProductServiceGrpc.getItemDeleteMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getItemDeleteMethod = ProductServiceGrpc.getItemDeleteMethod) == null) {
          ProductServiceGrpc.getItemDeleteMethod = getItemDeleteMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "itemDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("itemDelete"))
              .build();
        }
      }
    }
    return getItemDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest,
      protoFiles.ProductProto.APIResponse> getClearCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clearCart",
      requestType = protoFiles.ProductProto.CartRequest.class,
      responseType = protoFiles.ProductProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest,
      protoFiles.ProductProto.APIResponse> getClearCartMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest, protoFiles.ProductProto.APIResponse> getClearCartMethod;
    if ((getClearCartMethod = ProductServiceGrpc.getClearCartMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getClearCartMethod = ProductServiceGrpc.getClearCartMethod) == null) {
          ProductServiceGrpc.getClearCartMethod = getClearCartMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.CartRequest, protoFiles.ProductProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clearCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.CartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("clearCart"))
              .build();
        }
      }
    }
    return getClearCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest,
      protoFiles.ProductProto.ListResponse> getDisplayCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayCart",
      requestType = protoFiles.ProductProto.CartRequest.class,
      responseType = protoFiles.ProductProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest,
      protoFiles.ProductProto.ListResponse> getDisplayCartMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest, protoFiles.ProductProto.ListResponse> getDisplayCartMethod;
    if ((getDisplayCartMethod = ProductServiceGrpc.getDisplayCartMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDisplayCartMethod = ProductServiceGrpc.getDisplayCartMethod) == null) {
          ProductServiceGrpc.getDisplayCartMethod = getDisplayCartMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.CartRequest, protoFiles.ProductProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "displayCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.CartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("displayCart"))
              .build();
        }
      }
    }
    return getDisplayCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.ListResponse> getPurchaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "purchase",
      requestType = protoFiles.ProductProto.PayloadRequest.class,
      responseType = protoFiles.ProductProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.ListResponse> getPurchaseMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.ListResponse> getPurchaseMethod;
    if ((getPurchaseMethod = ProductServiceGrpc.getPurchaseMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getPurchaseMethod = ProductServiceGrpc.getPurchaseMethod) == null) {
          ProductServiceGrpc.getPurchaseMethod = getPurchaseMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "purchase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("purchase"))
              .build();
        }
      }
    }
    return getPurchaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedback",
      requestType = protoFiles.ProductProto.PayloadRequest.class,
      responseType = protoFiles.ProductProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getFeedbackMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse> getFeedbackMethod;
    if ((getFeedbackMethod = ProductServiceGrpc.getFeedbackMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getFeedbackMethod = ProductServiceGrpc.getFeedbackMethod) == null) {
          ProductServiceGrpc.getFeedbackMethod = getFeedbackMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "feedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("feedback"))
              .build();
        }
      }
    }
    return getFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest,
      protoFiles.ProductProto.ListResponse> getPurchaseHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "purchaseHistory",
      requestType = protoFiles.ProductProto.CartRequest.class,
      responseType = protoFiles.ProductProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest,
      protoFiles.ProductProto.ListResponse> getPurchaseHistoryMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.CartRequest, protoFiles.ProductProto.ListResponse> getPurchaseHistoryMethod;
    if ((getPurchaseHistoryMethod = ProductServiceGrpc.getPurchaseHistoryMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getPurchaseHistoryMethod = ProductServiceGrpc.getPurchaseHistoryMethod) == null) {
          ProductServiceGrpc.getPurchaseHistoryMethod = getPurchaseHistoryMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.CartRequest, protoFiles.ProductProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "purchaseHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.CartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("purchaseHistory"))
              .build();
        }
      }
    }
    return getPurchaseHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getItemSaleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "itemSale",
      requestType = protoFiles.ProductProto.PayloadRequest.class,
      responseType = protoFiles.ProductProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getItemSaleMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse> getItemSaleMethod;
    if ((getItemSaleMethod = ProductServiceGrpc.getItemSaleMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getItemSaleMethod = ProductServiceGrpc.getItemSaleMethod) == null) {
          ProductServiceGrpc.getItemSaleMethod = getItemSaleMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "itemSale"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("itemSale"))
              .build();
        }
      }
    }
    return getItemSaleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getChangePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changePrice",
      requestType = protoFiles.ProductProto.PayloadRequest.class,
      responseType = protoFiles.ProductProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getChangePriceMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse> getChangePriceMethod;
    if ((getChangePriceMethod = ProductServiceGrpc.getChangePriceMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getChangePriceMethod = ProductServiceGrpc.getChangePriceMethod) == null) {
          ProductServiceGrpc.getChangePriceMethod = getChangePriceMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("changePrice"))
              .build();
        }
      }
    }
    return getChangePriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getRemoveItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeItem",
      requestType = protoFiles.ProductProto.PayloadRequest.class,
      responseType = protoFiles.ProductProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest,
      protoFiles.ProductProto.APIResponse> getRemoveItemMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse> getRemoveItemMethod;
    if ((getRemoveItemMethod = ProductServiceGrpc.getRemoveItemMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getRemoveItemMethod = ProductServiceGrpc.getRemoveItemMethod) == null) {
          ProductServiceGrpc.getRemoveItemMethod = getRemoveItemMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.PayloadRequest, protoFiles.ProductProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("removeItem"))
              .build();
        }
      }
    }
    return getRemoveItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.ProductProto.SellerRequest,
      protoFiles.ProductProto.ListResponse> getDisplayItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayItems",
      requestType = protoFiles.ProductProto.SellerRequest.class,
      responseType = protoFiles.ProductProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.ProductProto.SellerRequest,
      protoFiles.ProductProto.ListResponse> getDisplayItemsMethod() {
    io.grpc.MethodDescriptor<protoFiles.ProductProto.SellerRequest, protoFiles.ProductProto.ListResponse> getDisplayItemsMethod;
    if ((getDisplayItemsMethod = ProductServiceGrpc.getDisplayItemsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDisplayItemsMethod = ProductServiceGrpc.getDisplayItemsMethod) == null) {
          ProductServiceGrpc.getDisplayItemsMethod = getDisplayItemsMethod =
              io.grpc.MethodDescriptor.<protoFiles.ProductProto.SellerRequest, protoFiles.ProductProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "displayItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.SellerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.ProductProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("displayItems"))
              .build();
        }
      }
    }
    return getDisplayItemsMethod;
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
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void itemSearch(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getItemSearchMethod(), responseObserver);
    }

    /**
     */
    public void itemAdd(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getItemAddMethod(), responseObserver);
    }

    /**
     */
    public void itemDelete(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getItemDeleteMethod(), responseObserver);
    }

    /**
     */
    public void clearCart(protoFiles.ProductProto.CartRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearCartMethod(), responseObserver);
    }

    /**
     */
    public void displayCart(protoFiles.ProductProto.CartRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisplayCartMethod(), responseObserver);
    }

    /**
     */
    public void purchase(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchaseMethod(), responseObserver);
    }

    /**
     */
    public void feedback(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void purchaseHistory(protoFiles.ProductProto.CartRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchaseHistoryMethod(), responseObserver);
    }

    /**
     */
    public void itemSale(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getItemSaleMethod(), responseObserver);
    }

    /**
     */
    public void changePrice(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangePriceMethod(), responseObserver);
    }

    /**
     */
    public void removeItem(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveItemMethod(), responseObserver);
    }

    /**
     */
    public void displayItems(protoFiles.ProductProto.SellerRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisplayItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getItemSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.PayloadRequest,
                protoFiles.ProductProto.ListResponse>(
                  this, METHODID_ITEM_SEARCH)))
          .addMethod(
            getItemAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.PayloadRequest,
                protoFiles.ProductProto.APIResponse>(
                  this, METHODID_ITEM_ADD)))
          .addMethod(
            getItemDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.PayloadRequest,
                protoFiles.ProductProto.APIResponse>(
                  this, METHODID_ITEM_DELETE)))
          .addMethod(
            getClearCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.CartRequest,
                protoFiles.ProductProto.APIResponse>(
                  this, METHODID_CLEAR_CART)))
          .addMethod(
            getDisplayCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.CartRequest,
                protoFiles.ProductProto.ListResponse>(
                  this, METHODID_DISPLAY_CART)))
          .addMethod(
            getPurchaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.PayloadRequest,
                protoFiles.ProductProto.ListResponse>(
                  this, METHODID_PURCHASE)))
          .addMethod(
            getFeedbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.PayloadRequest,
                protoFiles.ProductProto.APIResponse>(
                  this, METHODID_FEEDBACK)))
          .addMethod(
            getPurchaseHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.CartRequest,
                protoFiles.ProductProto.ListResponse>(
                  this, METHODID_PURCHASE_HISTORY)))
          .addMethod(
            getItemSaleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.PayloadRequest,
                protoFiles.ProductProto.APIResponse>(
                  this, METHODID_ITEM_SALE)))
          .addMethod(
            getChangePriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.PayloadRequest,
                protoFiles.ProductProto.APIResponse>(
                  this, METHODID_CHANGE_PRICE)))
          .addMethod(
            getRemoveItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.PayloadRequest,
                protoFiles.ProductProto.APIResponse>(
                  this, METHODID_REMOVE_ITEM)))
          .addMethod(
            getDisplayItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.ProductProto.SellerRequest,
                protoFiles.ProductProto.ListResponse>(
                  this, METHODID_DISPLAY_ITEMS)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
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
    public void itemSearch(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getItemSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void itemAdd(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getItemAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void itemDelete(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getItemDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearCart(protoFiles.ProductProto.CartRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void displayCart(protoFiles.ProductProto.CartRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisplayCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchase(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void feedback(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchaseHistory(protoFiles.ProductProto.CartRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchaseHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void itemSale(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getItemSaleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePrice(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeItem(protoFiles.ProductProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void displayItems(protoFiles.ProductProto.SellerRequest request,
        io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisplayItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
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
    public protoFiles.ProductProto.ListResponse itemSearch(protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getItemSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.APIResponse itemAdd(protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getItemAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.APIResponse itemDelete(protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getItemDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.APIResponse clearCart(protoFiles.ProductProto.CartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.ListResponse displayCart(protoFiles.ProductProto.CartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisplayCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.ListResponse purchase(protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.APIResponse feedback(protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.ListResponse purchaseHistory(protoFiles.ProductProto.CartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchaseHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.APIResponse itemSale(protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getItemSaleMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.APIResponse changePrice(protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangePriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.APIResponse removeItem(protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.ProductProto.ListResponse displayItems(protoFiles.ProductProto.SellerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisplayItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
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
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.ListResponse> itemSearch(
        protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getItemSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.APIResponse> itemAdd(
        protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getItemAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.APIResponse> itemDelete(
        protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getItemDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.APIResponse> clearCart(
        protoFiles.ProductProto.CartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.ListResponse> displayCart(
        protoFiles.ProductProto.CartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisplayCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.ListResponse> purchase(
        protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.APIResponse> feedback(
        protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.ListResponse> purchaseHistory(
        protoFiles.ProductProto.CartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchaseHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.APIResponse> itemSale(
        protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getItemSaleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.APIResponse> changePrice(
        protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangePriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.APIResponse> removeItem(
        protoFiles.ProductProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.ProductProto.ListResponse> displayItems(
        protoFiles.ProductProto.SellerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisplayItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ITEM_SEARCH = 0;
  private static final int METHODID_ITEM_ADD = 1;
  private static final int METHODID_ITEM_DELETE = 2;
  private static final int METHODID_CLEAR_CART = 3;
  private static final int METHODID_DISPLAY_CART = 4;
  private static final int METHODID_PURCHASE = 5;
  private static final int METHODID_FEEDBACK = 6;
  private static final int METHODID_PURCHASE_HISTORY = 7;
  private static final int METHODID_ITEM_SALE = 8;
  private static final int METHODID_CHANGE_PRICE = 9;
  private static final int METHODID_REMOVE_ITEM = 10;
  private static final int METHODID_DISPLAY_ITEMS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ITEM_SEARCH:
          serviceImpl.itemSearch((protoFiles.ProductProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse>) responseObserver);
          break;
        case METHODID_ITEM_ADD:
          serviceImpl.itemAdd((protoFiles.ProductProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse>) responseObserver);
          break;
        case METHODID_ITEM_DELETE:
          serviceImpl.itemDelete((protoFiles.ProductProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse>) responseObserver);
          break;
        case METHODID_CLEAR_CART:
          serviceImpl.clearCart((protoFiles.ProductProto.CartRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse>) responseObserver);
          break;
        case METHODID_DISPLAY_CART:
          serviceImpl.displayCart((protoFiles.ProductProto.CartRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse>) responseObserver);
          break;
        case METHODID_PURCHASE:
          serviceImpl.purchase((protoFiles.ProductProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse>) responseObserver);
          break;
        case METHODID_FEEDBACK:
          serviceImpl.feedback((protoFiles.ProductProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse>) responseObserver);
          break;
        case METHODID_PURCHASE_HISTORY:
          serviceImpl.purchaseHistory((protoFiles.ProductProto.CartRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse>) responseObserver);
          break;
        case METHODID_ITEM_SALE:
          serviceImpl.itemSale((protoFiles.ProductProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse>) responseObserver);
          break;
        case METHODID_CHANGE_PRICE:
          serviceImpl.changePrice((protoFiles.ProductProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ITEM:
          serviceImpl.removeItem((protoFiles.ProductProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.APIResponse>) responseObserver);
          break;
        case METHODID_DISPLAY_ITEMS:
          serviceImpl.displayItems((protoFiles.ProductProto.SellerRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.ProductProto.ListResponse>) responseObserver);
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protoFiles.ProductProto.getDescriptor();
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
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getItemSearchMethod())
              .addMethod(getItemAddMethod())
              .addMethod(getItemDeleteMethod())
              .addMethod(getClearCartMethod())
              .addMethod(getDisplayCartMethod())
              .addMethod(getPurchaseMethod())
              .addMethod(getFeedbackMethod())
              .addMethod(getPurchaseHistoryMethod())
              .addMethod(getItemSaleMethod())
              .addMethod(getChangePriceMethod())
              .addMethod(getRemoveItemMethod())
              .addMethod(getDisplayItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
