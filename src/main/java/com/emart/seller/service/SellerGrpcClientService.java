package com.emart.seller.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.okhttp.OkHttpChannelBuilder;
import org.springframework.stereotype.Service;
import protoFiles.CustomerProto;
import protoFiles.ProductProto;
import protoFiles.CustomerServiceGrpc;
import protoFiles.ProductServiceGrpc;

@Service
public class SellerGrpcClientService {

    private final CustomerServiceGrpc.CustomerServiceBlockingStub customerStub;
    private final ProductServiceGrpc.ProductServiceBlockingStub productStub;

    public SellerGrpcClientService() {
        ManagedChannel customerChannel = ManagedChannelBuilder.forAddress("localhost", 8085)
                .usePlaintext()
                .build();

        ManagedChannel productChannel = ManagedChannelBuilder.forAddress("localhost", 8088)
                .usePlaintext()
                .build();
        customerStub = protoFiles.CustomerServiceGrpc.newBlockingStub(customerChannel);
        productStub = protoFiles.ProductServiceGrpc.newBlockingStub(productChannel);
    }

    public Object doGrpcCall(int apiNum, Object request) {

        switch (apiNum) {
            case 0:
                return customerStub.sellerRegister((CustomerProto.PayloadRequest) request);
            case 1:
                return customerStub.sellerLogin((CustomerProto.LoginRequest) request);
            case 2:
                return customerStub.sellerLogout((CustomerProto.LogoutRequest) request);
            case 3:
                return customerStub.getSellerRating((CustomerProto.SellerRequest) request);
            case 4:
                return productStub.itemSale((ProductProto.PayloadRequest) request);
            case 5:
                return productStub.changePrice((ProductProto.PayloadRequest) request);
            case 6:
                return productStub.removeItem((ProductProto.PayloadRequest) request);
            case 7:
                return productStub.displayItems((ProductProto.SellerRequest) request);
        }

        return null;
    }
}
