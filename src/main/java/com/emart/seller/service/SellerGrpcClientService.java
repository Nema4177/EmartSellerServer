package com.emart.seller.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import protoFiles.CustomerProto;
import protoFiles.ProductProto;
import protoFiles.CustomerServiceGrpc;
import protoFiles.ProductServiceGrpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SellerGrpcClientService {

    private final CustomerServiceGrpc.CustomerServiceBlockingStub customerStub;
    private ProductServiceGrpc.ProductServiceBlockingStub productStub;

    private List<String> productBackendIPs = new ArrayList<String>(){{
        add("34.72.49.113");
        add("34.67.41.92");
        add("34.66.239.61");
        add("35.224.132.180");
        add("104.197.186.172");
    }};

    private List<String> customerBackendIPs = new ArrayList<String>(){{
        add("34.72.49.113");
        add("34.67.41.92");
        add("34.66.239.61");
        add("35.224.132.180");
        add("104.197.186.172");
    }};

    public SellerGrpcClientService() {
        Random random = new Random();
        String custIP = customerBackendIPs.get(random.nextInt(customerBackendIPs.size()));
        ManagedChannel customerChannel = ManagedChannelBuilder.forAddress(custIP, 8085)
                .usePlaintext()
                .build();

        String prodIP = productBackendIPs.get(random.nextInt(productBackendIPs.size()));
        ManagedChannel productChannel = ManagedChannelBuilder.forAddress(prodIP, 8089)
                .usePlaintext()
                .build();
        customerStub = protoFiles.CustomerServiceGrpc.newBlockingStub(customerChannel);
        productStub = protoFiles.ProductServiceGrpc.newBlockingStub(productChannel);
    }

    public void changeEndPoint(String endpoint) {
        String[] splitEndpoint = endpoint.split(":");

        ManagedChannel productChannel = ManagedChannelBuilder.forAddress(splitEndpoint[0],
                8089)
                .usePlaintext()
                .build();
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

//    public int localGetPort(int raftPort) {
//        switch (raftPort){
//            case 8081:
//                return 8088;
//            case 8082:
//                return 8089;
//        }
//        return 8088;
//    }
}
