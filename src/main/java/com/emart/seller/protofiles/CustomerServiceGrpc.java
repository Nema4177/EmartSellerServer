package protoFiles;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: customer.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.LoginRequest,
      protoFiles.CustomerProto.RegisterResponse> getSellerLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerLogin",
      requestType = protoFiles.CustomerProto.LoginRequest.class,
      responseType = protoFiles.CustomerProto.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.LoginRequest,
      protoFiles.CustomerProto.RegisterResponse> getSellerLoginMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.LoginRequest, protoFiles.CustomerProto.RegisterResponse> getSellerLoginMethod;
    if ((getSellerLoginMethod = CustomerServiceGrpc.getSellerLoginMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getSellerLoginMethod = CustomerServiceGrpc.getSellerLoginMethod) == null) {
          CustomerServiceGrpc.getSellerLoginMethod = getSellerLoginMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.LoginRequest, protoFiles.CustomerProto.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("sellerLogin"))
              .build();
        }
      }
    }
    return getSellerLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest,
      protoFiles.CustomerProto.RegisterResponse> getSellerRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerRegister",
      requestType = protoFiles.CustomerProto.PayloadRequest.class,
      responseType = protoFiles.CustomerProto.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest,
      protoFiles.CustomerProto.RegisterResponse> getSellerRegisterMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest, protoFiles.CustomerProto.RegisterResponse> getSellerRegisterMethod;
    if ((getSellerRegisterMethod = CustomerServiceGrpc.getSellerRegisterMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getSellerRegisterMethod = CustomerServiceGrpc.getSellerRegisterMethod) == null) {
          CustomerServiceGrpc.getSellerRegisterMethod = getSellerRegisterMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.PayloadRequest, protoFiles.CustomerProto.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("sellerRegister"))
              .build();
        }
      }
    }
    return getSellerRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.LogoutRequest,
      protoFiles.CustomerProto.APIResponse> getSellerLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerLogout",
      requestType = protoFiles.CustomerProto.LogoutRequest.class,
      responseType = protoFiles.CustomerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.LogoutRequest,
      protoFiles.CustomerProto.APIResponse> getSellerLogoutMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.LogoutRequest, protoFiles.CustomerProto.APIResponse> getSellerLogoutMethod;
    if ((getSellerLogoutMethod = CustomerServiceGrpc.getSellerLogoutMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getSellerLogoutMethod = CustomerServiceGrpc.getSellerLogoutMethod) == null) {
          CustomerServiceGrpc.getSellerLogoutMethod = getSellerLogoutMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.LogoutRequest, protoFiles.CustomerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("sellerLogout"))
              .build();
        }
      }
    }
    return getSellerLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.LoginRequest,
      protoFiles.CustomerProto.RegisterResponse> getBuyerLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buyerLogin",
      requestType = protoFiles.CustomerProto.LoginRequest.class,
      responseType = protoFiles.CustomerProto.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.LoginRequest,
      protoFiles.CustomerProto.RegisterResponse> getBuyerLoginMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.LoginRequest, protoFiles.CustomerProto.RegisterResponse> getBuyerLoginMethod;
    if ((getBuyerLoginMethod = CustomerServiceGrpc.getBuyerLoginMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getBuyerLoginMethod = CustomerServiceGrpc.getBuyerLoginMethod) == null) {
          CustomerServiceGrpc.getBuyerLoginMethod = getBuyerLoginMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.LoginRequest, protoFiles.CustomerProto.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "buyerLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("buyerLogin"))
              .build();
        }
      }
    }
    return getBuyerLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest,
      protoFiles.CustomerProto.RegisterResponse> getBuyerRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buyerRegister",
      requestType = protoFiles.CustomerProto.PayloadRequest.class,
      responseType = protoFiles.CustomerProto.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest,
      protoFiles.CustomerProto.RegisterResponse> getBuyerRegisterMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest, protoFiles.CustomerProto.RegisterResponse> getBuyerRegisterMethod;
    if ((getBuyerRegisterMethod = CustomerServiceGrpc.getBuyerRegisterMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getBuyerRegisterMethod = CustomerServiceGrpc.getBuyerRegisterMethod) == null) {
          CustomerServiceGrpc.getBuyerRegisterMethod = getBuyerRegisterMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.PayloadRequest, protoFiles.CustomerProto.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "buyerRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("buyerRegister"))
              .build();
        }
      }
    }
    return getBuyerRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.LogoutRequest,
      protoFiles.CustomerProto.APIResponse> getBuyerLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buyerLogout",
      requestType = protoFiles.CustomerProto.LogoutRequest.class,
      responseType = protoFiles.CustomerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.LogoutRequest,
      protoFiles.CustomerProto.APIResponse> getBuyerLogoutMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.LogoutRequest, protoFiles.CustomerProto.APIResponse> getBuyerLogoutMethod;
    if ((getBuyerLogoutMethod = CustomerServiceGrpc.getBuyerLogoutMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getBuyerLogoutMethod = CustomerServiceGrpc.getBuyerLogoutMethod) == null) {
          CustomerServiceGrpc.getBuyerLogoutMethod = getBuyerLogoutMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.LogoutRequest, protoFiles.CustomerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "buyerLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("buyerLogout"))
              .build();
        }
      }
    }
    return getBuyerLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.SellerRequest,
      protoFiles.CustomerProto.SellerRatingResponse> getGetSellerRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSellerRating",
      requestType = protoFiles.CustomerProto.SellerRequest.class,
      responseType = protoFiles.CustomerProto.SellerRatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.SellerRequest,
      protoFiles.CustomerProto.SellerRatingResponse> getGetSellerRatingMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.SellerRequest, protoFiles.CustomerProto.SellerRatingResponse> getGetSellerRatingMethod;
    if ((getGetSellerRatingMethod = CustomerServiceGrpc.getGetSellerRatingMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetSellerRatingMethod = CustomerServiceGrpc.getGetSellerRatingMethod) == null) {
          CustomerServiceGrpc.getGetSellerRatingMethod = getGetSellerRatingMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.SellerRequest, protoFiles.CustomerProto.SellerRatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSellerRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.SellerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.SellerRatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getSellerRating"))
              .build();
        }
      }
    }
    return getGetSellerRatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest,
      protoFiles.CustomerProto.APIResponse> getPurchaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "purchase",
      requestType = protoFiles.CustomerProto.PayloadRequest.class,
      responseType = protoFiles.CustomerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest,
      protoFiles.CustomerProto.APIResponse> getPurchaseMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest, protoFiles.CustomerProto.APIResponse> getPurchaseMethod;
    if ((getPurchaseMethod = CustomerServiceGrpc.getPurchaseMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getPurchaseMethod = CustomerServiceGrpc.getPurchaseMethod) == null) {
          CustomerServiceGrpc.getPurchaseMethod = getPurchaseMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.PayloadRequest, protoFiles.CustomerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "purchase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("purchase"))
              .build();
        }
      }
    }
    return getPurchaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest,
      protoFiles.CustomerProto.APIResponse> getFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedback",
      requestType = protoFiles.CustomerProto.PayloadRequest.class,
      responseType = protoFiles.CustomerProto.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest,
      protoFiles.CustomerProto.APIResponse> getFeedbackMethod() {
    io.grpc.MethodDescriptor<protoFiles.CustomerProto.PayloadRequest, protoFiles.CustomerProto.APIResponse> getFeedbackMethod;
    if ((getFeedbackMethod = CustomerServiceGrpc.getFeedbackMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getFeedbackMethod = CustomerServiceGrpc.getFeedbackMethod) == null) {
          CustomerServiceGrpc.getFeedbackMethod = getFeedbackMethod =
              io.grpc.MethodDescriptor.<protoFiles.CustomerProto.PayloadRequest, protoFiles.CustomerProto.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "feedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protoFiles.CustomerProto.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("feedback"))
              .build();
        }
      }
    }
    return getFeedbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub>() {
        @java.lang.Override
        public CustomerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceStub(channel, callOptions);
        }
      };
    return CustomerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub>() {
        @java.lang.Override
        public CustomerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub>() {
        @java.lang.Override
        public CustomerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sellerLogin(protoFiles.CustomerProto.LoginRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerLoginMethod(), responseObserver);
    }

    /**
     */
    public void sellerRegister(protoFiles.CustomerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerRegisterMethod(), responseObserver);
    }

    /**
     */
    public void sellerLogout(protoFiles.CustomerProto.LogoutRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerLogoutMethod(), responseObserver);
    }

    /**
     */
    public void buyerLogin(protoFiles.CustomerProto.LoginRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyerLoginMethod(), responseObserver);
    }

    /**
     */
    public void buyerRegister(protoFiles.CustomerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyerRegisterMethod(), responseObserver);
    }

    /**
     */
    public void buyerLogout(protoFiles.CustomerProto.LogoutRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyerLogoutMethod(), responseObserver);
    }

    /**
     */
    public void getSellerRating(protoFiles.CustomerProto.SellerRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.SellerRatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSellerRatingMethod(), responseObserver);
    }

    /**
     */
    public void purchase(protoFiles.CustomerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchaseMethod(), responseObserver);
    }

    /**
     */
    public void feedback(protoFiles.CustomerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeedbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSellerLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.LoginRequest,
                protoFiles.CustomerProto.RegisterResponse>(
                  this, METHODID_SELLER_LOGIN)))
          .addMethod(
            getSellerRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.PayloadRequest,
                protoFiles.CustomerProto.RegisterResponse>(
                  this, METHODID_SELLER_REGISTER)))
          .addMethod(
            getSellerLogoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.LogoutRequest,
                protoFiles.CustomerProto.APIResponse>(
                  this, METHODID_SELLER_LOGOUT)))
          .addMethod(
            getBuyerLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.LoginRequest,
                protoFiles.CustomerProto.RegisterResponse>(
                  this, METHODID_BUYER_LOGIN)))
          .addMethod(
            getBuyerRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.PayloadRequest,
                protoFiles.CustomerProto.RegisterResponse>(
                  this, METHODID_BUYER_REGISTER)))
          .addMethod(
            getBuyerLogoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.LogoutRequest,
                protoFiles.CustomerProto.APIResponse>(
                  this, METHODID_BUYER_LOGOUT)))
          .addMethod(
            getGetSellerRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.SellerRequest,
                protoFiles.CustomerProto.SellerRatingResponse>(
                  this, METHODID_GET_SELLER_RATING)))
          .addMethod(
            getPurchaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.PayloadRequest,
                protoFiles.CustomerProto.APIResponse>(
                  this, METHODID_PURCHASE)))
          .addMethod(
            getFeedbackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protoFiles.CustomerProto.PayloadRequest,
                protoFiles.CustomerProto.APIResponse>(
                  this, METHODID_FEEDBACK)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerServiceStub> {
    private CustomerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void sellerLogin(protoFiles.CustomerProto.LoginRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellerRegister(protoFiles.CustomerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellerLogout(protoFiles.CustomerProto.LogoutRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyerLogin(protoFiles.CustomerProto.LoginRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyerLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyerRegister(protoFiles.CustomerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyerRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyerLogout(protoFiles.CustomerProto.LogoutRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyerLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSellerRating(protoFiles.CustomerProto.SellerRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.SellerRatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSellerRatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchase(protoFiles.CustomerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void feedback(protoFiles.CustomerProto.PayloadRequest request,
        io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public protoFiles.CustomerProto.RegisterResponse sellerLogin(protoFiles.CustomerProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.CustomerProto.RegisterResponse sellerRegister(protoFiles.CustomerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.CustomerProto.APIResponse sellerLogout(protoFiles.CustomerProto.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.CustomerProto.RegisterResponse buyerLogin(protoFiles.CustomerProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyerLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.CustomerProto.RegisterResponse buyerRegister(protoFiles.CustomerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyerRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.CustomerProto.APIResponse buyerLogout(protoFiles.CustomerProto.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyerLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.CustomerProto.SellerRatingResponse getSellerRating(protoFiles.CustomerProto.SellerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSellerRatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.CustomerProto.APIResponse purchase(protoFiles.CustomerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public protoFiles.CustomerProto.APIResponse feedback(protoFiles.CustomerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.RegisterResponse> sellerLogin(
        protoFiles.CustomerProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.RegisterResponse> sellerRegister(
        protoFiles.CustomerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.APIResponse> sellerLogout(
        protoFiles.CustomerProto.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.RegisterResponse> buyerLogin(
        protoFiles.CustomerProto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyerLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.RegisterResponse> buyerRegister(
        protoFiles.CustomerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyerRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.APIResponse> buyerLogout(
        protoFiles.CustomerProto.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyerLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.SellerRatingResponse> getSellerRating(
        protoFiles.CustomerProto.SellerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSellerRatingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.APIResponse> purchase(
        protoFiles.CustomerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protoFiles.CustomerProto.APIResponse> feedback(
        protoFiles.CustomerProto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SELLER_LOGIN = 0;
  private static final int METHODID_SELLER_REGISTER = 1;
  private static final int METHODID_SELLER_LOGOUT = 2;
  private static final int METHODID_BUYER_LOGIN = 3;
  private static final int METHODID_BUYER_REGISTER = 4;
  private static final int METHODID_BUYER_LOGOUT = 5;
  private static final int METHODID_GET_SELLER_RATING = 6;
  private static final int METHODID_PURCHASE = 7;
  private static final int METHODID_FEEDBACK = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELLER_LOGIN:
          serviceImpl.sellerLogin((protoFiles.CustomerProto.LoginRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse>) responseObserver);
          break;
        case METHODID_SELLER_REGISTER:
          serviceImpl.sellerRegister((protoFiles.CustomerProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse>) responseObserver);
          break;
        case METHODID_SELLER_LOGOUT:
          serviceImpl.sellerLogout((protoFiles.CustomerProto.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse>) responseObserver);
          break;
        case METHODID_BUYER_LOGIN:
          serviceImpl.buyerLogin((protoFiles.CustomerProto.LoginRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse>) responseObserver);
          break;
        case METHODID_BUYER_REGISTER:
          serviceImpl.buyerRegister((protoFiles.CustomerProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.RegisterResponse>) responseObserver);
          break;
        case METHODID_BUYER_LOGOUT:
          serviceImpl.buyerLogout((protoFiles.CustomerProto.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse>) responseObserver);
          break;
        case METHODID_GET_SELLER_RATING:
          serviceImpl.getSellerRating((protoFiles.CustomerProto.SellerRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.SellerRatingResponse>) responseObserver);
          break;
        case METHODID_PURCHASE:
          serviceImpl.purchase((protoFiles.CustomerProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse>) responseObserver);
          break;
        case METHODID_FEEDBACK:
          serviceImpl.feedback((protoFiles.CustomerProto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<protoFiles.CustomerProto.APIResponse>) responseObserver);
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

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protoFiles.CustomerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getSellerLoginMethod())
              .addMethod(getSellerRegisterMethod())
              .addMethod(getSellerLogoutMethod())
              .addMethod(getBuyerLoginMethod())
              .addMethod(getBuyerRegisterMethod())
              .addMethod(getBuyerLogoutMethod())
              .addMethod(getGetSellerRatingMethod())
              .addMethod(getPurchaseMethod())
              .addMethod(getFeedbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
