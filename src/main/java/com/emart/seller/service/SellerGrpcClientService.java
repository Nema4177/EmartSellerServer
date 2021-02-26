package com.emart.seller.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import protofiles.SellerServiceGrpc;
import protofiles.SellerProto;

@Service
public class SellerGrpcClientService {

    private final SellerServiceGrpc.SellerServiceBlockingStub sellerStub;

    public SellerGrpcClientService() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083)
                .usePlaintext()
                .build();

        sellerStub = SellerServiceGrpc.newBlockingStub(channel);
    }

    public Object doGrpcCall(int apiNum, Object request) {

        switch (apiNum) {
            case 0:
                return sellerStub.register((SellerProto.PayloadRequest) request);
            case 1:
                return sellerStub.login((SellerProto.LoginRequest) request);
            case 2:
                return sellerStub.logout((SellerProto.LogoutRequest) request);
            case 3:
                return sellerStub.getSellerRating((SellerProto.SellerRequest) request);
            case 4:
                return sellerStub.itemSale((SellerProto.PayloadRequest) request);
            case 5:
                return sellerStub.changePrice((SellerProto.PayloadRequest) request);
            case 6:
                return sellerStub.removeItem((SellerProto.PayloadRequest) request);
            case 7:
                return sellerStub.displayItems((SellerProto.SellerRequest) request);
        }

        return null;
    }
}
