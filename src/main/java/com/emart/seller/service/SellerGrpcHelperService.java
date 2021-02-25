package com.emart.seller.service;

import com.emart.seller.data.Item;
import com.emart.seller.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.grpc.stub.StreamObserver;
import org.springframework.http.HttpStatus;
import protoFiles.SellerProto;
import protoFiles.SellerServiceGrpc;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public class SellerGrpcHelperService extends SellerServiceGrpc.SellerServiceImplBase {

    private final Type type;
    private final Gson gson;

    public SellerGrpcHelperService() {
        this.gson = new Gson();
        this.type = new TypeToken<HashMap<String, String>>() {
        }.getType();
    }
    //TODO: DB calls


    @Override
    public void login(SellerProto.LoginRequest request, StreamObserver<SellerProto.APIResponse> responseObserver) {
        super.login(request, responseObserver);
        try {
            HashMap<String, String> payload = gson.fromJson(request.getPayload(), type);
            String userName = payload.get("username");
            String password = payload.get("password");

            SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
            response.setStatus(HttpStatus.OK.value()).setMessage("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
        response.setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("");
    }

    @Override
    public void register(SellerProto.PayloadRequest request, StreamObserver<SellerProto.APIResponse> responseObserver) {
        super.register(request, responseObserver);
        try {
            HashMap<String, String> payload = gson.fromJson(request.getPayload(), type);
            String userName = payload.get(Constants.request_username_key);
            String password = payload.get(Constants.request_password_key);


            SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
            response.setStatus(HttpStatus.OK.value()).setMessage("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
        response.setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("");
    }

    @Override
    public void logout(SellerProto.LogoutRequest request, StreamObserver<SellerProto.APIResponse> responseObserver) {
        super.logout(request, responseObserver);
        try {
            String userName = request.getUsername();

            SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
            response.setStatus(HttpStatus.OK.value()).setMessage("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
        response.setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("");
    }

    @Override
    public void getSellerRating(SellerProto.SellerRequest request, StreamObserver<SellerProto.SellerRatingResponse> responseObserver) {
        super.getSellerRating(request, responseObserver);
        long sellerId = request.getSellerId();

        SellerProto.SellerRatingResponse.Builder response = SellerProto.SellerRatingResponse.newBuilder();
        response.setThumbsDown(10).setThumbsDown(2);
    }

    @Override
    public void itemSale(SellerProto.PayloadRequest request, StreamObserver<SellerProto.APIResponse> responseObserver) {
        super.itemSale(request, responseObserver);
        try {
            Item item = gson.fromJson(request.getPayload(), Item.class);
            long sellerId = request.getSellerId();

            SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
            response.setStatus(HttpStatus.OK.value()).setMessage("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
        response.setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("");
    }

    @Override
    public void changePrice(SellerProto.PayloadRequest request, StreamObserver<SellerProto.APIResponse> responseObserver) {
        super.changePrice(request, responseObserver);
        try {
            HashMap<String, Object> payload = gson.fromJson(request.getPayload(), type);
            long sellerId = request.getSellerId();
            int itemId = (int) payload.get(Constants.request_item_id_key);
            double price = (double) payload.get(Constants.request_item_price_key);

            SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
            response.setStatus(HttpStatus.OK.value()).setMessage("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
        response.setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("");
    }

    @Override
    public void removeItem(SellerProto.PayloadRequest request, StreamObserver<SellerProto.APIResponse> responseObserver) {
        super.removeItem(request, responseObserver);
        try {
            HashMap<String, Object> payload = gson.fromJson(request.getPayload(), type);
            long sellerId = request.getSellerId();
            int itemId = (int) payload.get(Constants.request_item_id_key);
            int quantity = (int) payload.get(Constants.request_item_quantity_key);

            SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
            response.setStatus(HttpStatus.OK.value()).setMessage("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SellerProto.APIResponse.Builder response = SellerProto.APIResponse.newBuilder();
        response.setStatus(HttpStatus.BAD_REQUEST.value()).setMessage("");
    }

    @Override
    public void displayItems(SellerProto.SellerRequest request, StreamObserver<SellerProto.ListResponse> responseObserver) {
        super.displayItems(request, responseObserver);
        long sellerId = request.getSellerId();
        ArrayList<String> finalResultItems = new ArrayList<>();

        SellerProto.ListResponse.Builder response = SellerProto.ListResponse.newBuilder();
        response.setResponsePayload(gson.toJson(finalResultItems));
    }
}
