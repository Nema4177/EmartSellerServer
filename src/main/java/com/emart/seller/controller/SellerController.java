package com.emart.seller.controller;

import com.emart.seller.service.SellerGrpcClientService;
import com.emart.seller.utils.Constants;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import protoFiles.CustomerProto;
import protoFiles.ProductProto;

@RestController
public class SellerController {

	@Autowired
	SellerGrpcClientService sellerGrpcHelperService;

	@GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String test() {

		return "success";
	}

	@GetMapping(path = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> greeting() {

		JSONObject entity = new JSONObject();
		entity.put("value", 20);
		entity.put("status", "success");

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping(path = "/createAccount", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> createAccount(@RequestBody JSONObject input) {
		System.out.println("Method: createAccount");
		System.out.println("Input is: "+input);
		JSONObject entity = new JSONObject();

		CustomerProto.PayloadRequest payloadRequest = CustomerProto.PayloadRequest.newBuilder().setPayload(input.toString()).build();
		CustomerProto.RegisterResponse response = (CustomerProto.RegisterResponse) this.sellerGrpcHelperService.doGrpcCall(0, payloadRequest);
		
		System.out.println("Response message is "+response.getMessage());
		
		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		entity.put(Constants.request_name_key, response.getName());
		entity.put(Constants.response_sellerId_key, response.getId());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping(path="/login",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> login(@RequestBody JSONObject input) {
		System.out.println("Method: login");
		System.out.println("Input: "+input);
		JSONObject entity = new JSONObject();

		CustomerProto.LoginRequest loginRequest = CustomerProto.LoginRequest.newBuilder().setPayload(input.toString()).build();
		CustomerProto.RegisterResponse response = (CustomerProto.RegisterResponse) this.sellerGrpcHelperService.doGrpcCall(1, loginRequest);
		System.out.println(response.getMessage() + response.getStatus() + "res from grpc");

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		entity.put(Constants.request_name_key, response.getName());
		entity.put(Constants.response_sellerId_key, response.getId());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping(path="/logout",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> logout(@RequestParam String username, @RequestParam int sellerId) {
		System.out.println("Method: logout");
		System.out.println("username: "+username+" sellerId: "+sellerId);
		JSONObject entity = new JSONObject();

		CustomerProto.LogoutRequest logoutRequest = CustomerProto.LogoutRequest.newBuilder().setUsername(username).setId(sellerId).build();
		CustomerProto.APIResponse response = (CustomerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(2, logoutRequest);
		
		System.out.println("Response message is "+response.getMessage());
		
		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping(path="/getSellerRating",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> getSellerRating(@RequestParam int sellerId) {
		System.out.println("Method: getSellerRating");
		System.out.println("SellerId: "+sellerId);
		JSONObject entity = new JSONObject();

		CustomerProto.SellerRequest sellerRequest = CustomerProto.SellerRequest.newBuilder().setSellerId(sellerId).build();
		CustomerProto.SellerRatingResponse response = (CustomerProto.SellerRatingResponse) this.sellerGrpcHelperService.doGrpcCall(3, sellerRequest);
		System.out.println("Response message is "+response.getMessage);
		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		entity.put(Constants.response_upvotes_key, response.getThumbsUp());
		entity.put(Constants.response_downvotes_key, response.getThumbsDown());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping(path="/addItem",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> addItem(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		ProductProto.PayloadRequest payloadRequest = ProductProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setId(sellerId).build();
		ProductProto.APIResponse response = (ProductProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(4, payloadRequest);

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping(path="/changeSalePrice",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> changeSalePrice(@RequestBody JSONObject input, @RequestParam int sellerId) {
		System.out.println("Method: changeSalePrice");
		System.out.println("SellerId: "+sellerId+"\nInput:"+input);
		JSONObject entity = new JSONObject();

		ProductProto.PayloadRequest payloadRequest = ProductProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setId(sellerId).build();
		ProductProto.APIResponse response = (ProductProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(5, payloadRequest);
		
		System.out.println("Response message is: "+response.getMessage());
		
		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping(path="/removeItem",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> removeItem(@RequestBody JSONObject input, @RequestParam int sellerId) {
		System.out.println("Method: RemoveItem");
		System.out.println("SellerId: "+sellerId+"\n input:"+input);
		JSONObject entity = new JSONObject();

		ProductProto.PayloadRequest payloadRequest = ProductProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setId(sellerId).build();
		ProductProto.APIResponse response = (ProductProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(6, payloadRequest);
		
		System.out.println("Response message is "+response.getMessage());
		
		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping(path="/getAllItems",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> getItems(@RequestParam int sellerId) {
		System.out.println("Method: getAllItems");
		System.out.println("SellerId: "+sellerId);
		JSONObject entity = new JSONObject();

		ProductProto.SellerRequest sellerRequest = ProductProto.SellerRequest.newBuilder().setSellerId(sellerId).build();
		ProductProto.ListResponse response = (ProductProto.ListResponse) this.sellerGrpcHelperService.doGrpcCall(7, sellerRequest);
		System.out.println("Response Message is "+response.getMessage());
		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		entity.put(Constants.response_itemsList_key, response.getResponsePayload());

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}
}
