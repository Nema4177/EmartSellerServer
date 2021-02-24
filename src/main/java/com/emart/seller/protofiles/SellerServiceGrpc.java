package protoFiles;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: seller.proto")
public final class SellerServiceGrpc {

  private SellerServiceGrpc() {}

  public static final String SERVICE_NAME = "SellerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protoFiles.SellerProto.LoginRequest,
      protoFiles.SellerProto.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = protoFiles.SellerProto.LoginRequest.class,
      responseType = protoFiles.SellerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.SellerProto.LoginRequest,
      protoFiles.SellerProto.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<protoFiles.SellerProto.LoginRequest, protoFiles.SellerProto.APIResponse> getLoginMethod;
    if ((getLoginMethod = SellerServiceGrpc.getLoginMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getLoginMethod = SellerServiceGrpc.getLoginMethod) == null) {
          SellerServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<protoFiles.SellerProto.LoginRequest, protoFiles.SellerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest,
      protoFiles.SellerProto.APIResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = protoFiles.SellerProto.PayloadRequest.class,
      responseType = protoFiles.SellerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest,
      protoFiles.SellerProto.APIResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest, protoFiles.SellerProto.APIResponse> getRegisterMethod;
    if ((getRegisterMethod = SellerServiceGrpc.getRegisterMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getRegisterMethod = SellerServiceGrpc.getRegisterMethod) == null) {
          SellerServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<protoFiles.SellerProto.PayloadRequest, protoFiles.SellerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.SellerProto.LogoutRequest,
      protoFiles.SellerProto.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = protoFiles.SellerProto.LogoutRequest.class,
      responseType = protoFiles.SellerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.SellerProto.LogoutRequest,
      protoFiles.SellerProto.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<protoFiles.SellerProto.LogoutRequest, protoFiles.SellerProto.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = SellerServiceGrpc.getLogoutMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getLogoutMethod = SellerServiceGrpc.getLogoutMethod) == null) {
          SellerServiceGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<protoFiles.SellerProto.LogoutRequest, protoFiles.SellerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.SellerProto.SellerRequest,
      protoFiles.SellerProto.SellerRatingResponse> getGetSellerRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSellerRating",
      requestType = protoFiles.SellerProto.SellerRequest.class,
      responseType = protoFiles.SellerProto.SellerRatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.SellerProto.SellerRequest,
      protoFiles.SellerProto.SellerRatingResponse> getGetSellerRatingMethod() {
    io.grpc.MethodDescriptor<protoFiles.SellerProto.SellerRequest, protoFiles.SellerProto.SellerRatingResponse> getGetSellerRatingMethod;
    if ((getGetSellerRatingMethod = SellerServiceGrpc.getGetSellerRatingMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getGetSellerRatingMethod = SellerServiceGrpc.getGetSellerRatingMethod) == null) {
          SellerServiceGrpc.getGetSellerRatingMethod = getGetSellerRatingMethod =
              io.grpc.MethodDescriptor.<protoFiles.SellerProto.SellerRequest, protoFiles.SellerProto.SellerRatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSellerRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.SellerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.SellerRatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("getSellerRating"))
              .build();
        }
      }
    }
    return getGetSellerRatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest,
      protoFiles.SellerProto.APIResponse> getItemSaleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "itemSale",
      requestType = protoFiles.SellerProto.PayloadRequest.class,
      responseType = protoFiles.SellerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest,
      protoFiles.SellerProto.APIResponse> getItemSaleMethod() {
    io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest, protoFiles.SellerProto.APIResponse> getItemSaleMethod;
    if ((getItemSaleMethod = SellerServiceGrpc.getItemSaleMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getItemSaleMethod = SellerServiceGrpc.getItemSaleMethod) == null) {
          SellerServiceGrpc.getItemSaleMethod = getItemSaleMethod =
              io.grpc.MethodDescriptor.<protoFiles.SellerProto.PayloadRequest, protoFiles.SellerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "itemSale"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("itemSale"))
              .build();
        }
      }
    }
    return getItemSaleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest,
      protoFiles.SellerProto.APIResponse> getChangePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changePrice",
      requestType = protoFiles.SellerProto.PayloadRequest.class,
      responseType = protoFiles.SellerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest,
      protoFiles.SellerProto.APIResponse> getChangePriceMethod() {
    io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest, protoFiles.SellerProto.APIResponse> getChangePriceMethod;
    if ((getChangePriceMethod = SellerServiceGrpc.getChangePriceMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getChangePriceMethod = SellerServiceGrpc.getChangePriceMethod) == null) {
          SellerServiceGrpc.getChangePriceMethod = getChangePriceMethod =
              io.grpc.MethodDescriptor.<protoFiles.SellerProto.PayloadRequest, protoFiles.SellerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("changePrice"))
              .build();
        }
      }
    }
    return getChangePriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest,
      protoFiles.SellerProto.APIResponse> getRemoveItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeItem",
      requestType = protoFiles.SellerProto.PayloadRequest.class,
      responseType = protoFiles.SellerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest,
      protoFiles.SellerProto.APIResponse> getRemoveItemMethod() {
    io.grpc.MethodDescriptor<protoFiles.SellerProto.PayloadRequest, protoFiles.SellerProto.APIResponse> getRemoveItemMethod;
    if ((getRemoveItemMethod = SellerServiceGrpc.getRemoveItemMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getRemoveItemMethod = SellerServiceGrpc.getRemoveItemMethod) == null) {
          SellerServiceGrpc.getRemoveItemMethod = getRemoveItemMethod =
              io.grpc.MethodDescriptor.<protoFiles.SellerProto.PayloadRequest, protoFiles.SellerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("removeItem"))
              .build();
        }
      }
    }
    return getRemoveItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.SellerProto.SellerRequest,
      protoFiles.SellerProto.ListResponse> getDisplayItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayItems",
      requestType = protoFiles.SellerProto.SellerRequest.class,
      responseType = protoFiles.SellerProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.SellerProto.SellerRequest,
      protoFiles.SellerProto.ListResponse> getDisplayItemsMethod() {
    io.grpc.MethodDescriptor<protoFiles.SellerProto.SellerRequest, protoFiles.SellerProto.ListResponse> getDisplayItemsMethod;
    if ((getDisplayItemsMethod = SellerServiceGrpc.getDisplayItemsMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getDisplayItemsMethod = SellerServiceGrpc.getDisplayItemsMethod) == null) {
          SellerServiceGrpc.getDisplayItemsMethod = getDisplayItemsMethod =
              io.grpc.MethodDescriptor.<protoFiles.SellerProto.SellerRequest, protoFiles.SellerProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "displayItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.SellerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.SellerProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("displayItems"))
              .build();
        }
      }
    }
    return getDisplayItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SellerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerServiceStub>() {
        @java.lang.Override
        public SellerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerServiceStub(channel, callOptions);
        }
      };
    return SellerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SellerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerServiceBlockingStub>() {
        @java.lang.Override
        public SellerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerServiceBlockingStub(channel, callOptions);
        }
      };
    return SellerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SellerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerServiceFutureStub>() {
        @java.lang.Override
        public SellerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerServiceFutureStub(channel, callOptions);
        }
      };
    return SellerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SellerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(protoFiles.SellerProto.LoginRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void register(protoFiles.SellerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void logout(protoFiles.SellerProto.LogoutRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void getSellerRating(protoFiles.SellerProto.SellerRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.SellerRatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSellerRatingMethod(), responseObserver);
    }

    /**
     */
    public void itemSale(protoFiles.SellerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getItemSaleMethod(), responseObserver);
    }

    /**
     */
    public void changePrice(protoFiles.SellerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangePriceMethod(), responseObserver);
    }

    /**
     */
    public void removeItem(protoFiles.SellerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveItemMethod(), responseObserver);
    }

    /**
     */
    public void displayItems(protoFiles.SellerProto.SellerRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.ListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisplayItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.SellerProto.LoginRequest,
                protoFiles.SellerProto.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.SellerProto.PayloadRequest,
                protoFiles.SellerProto.APIResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLogoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.SellerProto.LogoutRequest,
                protoFiles.SellerProto.APIResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getGetSellerRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.SellerProto.SellerRequest,
                protoFiles.SellerProto.SellerRatingResponse>(
                  this, METHODID_GET_SELLER_RATING)))
          .addMethod(
            getItemSaleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.SellerProto.PayloadRequest,
                protoFiles.SellerProto.APIResponse>(
                  this, METHODID_ITEM_SALE)))
          .addMethod(
            getChangePriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.SellerProto.PayloadRequest,
                protoFiles.SellerProto.APIResponse>(
                  this, METHODID_CHANGE_PRICE)))
          .addMethod(
            getRemoveItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.SellerProto.PayloadRequest,
                protoFiles.SellerProto.APIResponse>(
                  this, METHODID_REMOVE_ITEM)))
          .addMethod(
            getDisplayItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.SellerProto.SellerRequest,
                protoFiles.SellerProto.ListResponse>(
                  this, METHODID_DISPLAY_ITEMS)))
          .build();
    }
  }

  /**
   */
  public static final class SellerServiceStub extends io.grpc.stub.AbstractAsyncStub<SellerServiceStub> {
    private SellerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(protoFiles.SellerProto.LoginRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void register(protoFiles.SellerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(protoFiles.SellerProto.LogoutRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSellerRating(protoFiles.SellerProto.SellerRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.SellerRatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSellerRatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void itemSale(protoFiles.SellerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getItemSaleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePrice(protoFiles.SellerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeItem(protoFiles.SellerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void displayItems(protoFiles.SellerProto.SellerRequest request,
        io.grpc.stub.StreamObserver<protoFiles.SellerProto.ListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisplayItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SellerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SellerServiceBlockingStub> {
    private SellerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public protoFiles.SellerProto.APIResponse login(protoFiles.SellerProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.SellerProto.APIResponse register(protoFiles.SellerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.SellerProto.APIResponse logout(protoFiles.SellerProto.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.SellerProto.SellerRatingResponse getSellerRating(protoFiles.SellerProto.SellerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSellerRatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.SellerProto.APIResponse itemSale(protoFiles.SellerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getItemSaleMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.SellerProto.APIResponse changePrice(protoFiles.SellerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangePriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.SellerProto.APIResponse removeItem(protoFiles.SellerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.SellerProto.ListResponse displayItems(protoFiles.SellerProto.SellerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisplayItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SellerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SellerServiceFutureStub> {
    private SellerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.SellerProto.APIResponse> login(
        protoFiles.SellerProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.SellerProto.APIResponse> register(
        protoFiles.SellerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.SellerProto.APIResponse> logout(
        protoFiles.SellerProto.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.SellerProto.SellerRatingResponse> getSellerRating(
        protoFiles.SellerProto.SellerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSellerRatingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.SellerProto.APIResponse> itemSale(
        protoFiles.SellerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getItemSaleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.SellerProto.APIResponse> changePrice(
        protoFiles.SellerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangePriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.SellerProto.APIResponse> removeItem(
        protoFiles.SellerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.SellerProto.ListResponse> displayItems(
        protoFiles.SellerProto.SellerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisplayItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_REGISTER = 1;
  private static final int METHODID_LOGOUT = 2;
  private static final int METHODID_GET_SELLER_RATING = 3;
  private static final int METHODID_ITEM_SALE = 4;
  private static final int METHODID_CHANGE_PRICE = 5;
  private static final int METHODID_REMOVE_ITEM = 6;
  private static final int METHODID_DISPLAY_ITEMS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SellerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SellerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((protoFiles.SellerProto.LoginRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((protoFiles.SellerProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((protoFiles.SellerProto.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse>) responseObserver);
          break;
        case METHODID_GET_SELLER_RATING:
          serviceImpl.getSellerRating((protoFiles.SellerProto.SellerRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.SellerProto.SellerRatingResponse>) responseObserver);
          break;
        case METHODID_ITEM_SALE:
          serviceImpl.itemSale((protoFiles.SellerProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse>) responseObserver);
          break;
        case METHODID_CHANGE_PRICE:
          serviceImpl.changePrice((protoFiles.SellerProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ITEM:
          serviceImpl.removeItem((protoFiles.SellerProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.SellerProto.APIResponse>) responseObserver);
          break;
        case METHODID_DISPLAY_ITEMS:
          serviceImpl.displayItems((protoFiles.SellerProto.SellerRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.SellerProto.ListResponse>) responseObserver);
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

  private static abstract class SellerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SellerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protoFiles.SellerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SellerService");
    }
  }

  private static final class SellerServiceFileDescriptorSupplier
      extends SellerServiceBaseDescriptorSupplier {
    SellerServiceFileDescriptorSupplier() {}
  }

  private static final class SellerServiceMethodDescriptorSupplier
      extends SellerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SellerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SellerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SellerServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getRegisterMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getGetSellerRatingMethod())
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
