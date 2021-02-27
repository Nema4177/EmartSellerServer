package com.emart.seller.controller;

import com.emart.seller.service.SellerGrpcClientService;
import com.emart.seller.utils.Constants;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import protofiles.SellerProto;

@RestController
public class SellerController {

//	@Autowired
//	SellerService service;

//	@Autowired
//	ItemRepository itemRepository;

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
		JSONObject entity = new JSONObject();

		SellerProto.PayloadRequest payloadRequest = SellerProto.PayloadRequest.newBuilder().setPayload(input.toString()).build();
		SellerProto.RegisterResponse response = (SellerProto.RegisterResponse) this.sellerGrpcHelperService.doGrpcCall(0, payloadRequest);

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		entity.put(Constants.request_name_key, response.getName());
		entity.put(Constants.response_sellerId_key, response.getSellerId());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<JSONObject> login(@RequestBody JSONObject input) {
		JSONObject entity = new JSONObject();

		SellerProto.LoginRequest loginRequest = SellerProto.LoginRequest.newBuilder().setPayload(input.toString()).build();
		SellerProto.RegisterResponse response = (SellerProto.RegisterResponse) this.sellerGrpcHelperService.doGrpcCall(1, loginRequest);
		System.out.println(response.getMessage() + response.getStatus() + "res from grpc");

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		entity.put(Constants.request_name_key, response.getName());
		entity.put(Constants.response_sellerId_key, response.getSellerId());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/logout")
	public ResponseEntity<JSONObject> logout(@RequestParam String username, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.LogoutRequest logoutRequest = SellerProto.LogoutRequest.newBuilder().setUsername(username).setSellerId(sellerId).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(2, logoutRequest);

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping("/getSellerRating")
	public ResponseEntity<JSONObject> getSellerRating(@RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.SellerRequest sellerRequest = SellerProto.SellerRequest.newBuilder().setSellerId(sellerId).build();
		SellerProto.SellerRatingResponse response = (SellerProto.SellerRatingResponse) this.sellerGrpcHelperService.doGrpcCall(3, sellerRequest);

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		entity.put(Constants.response_upvotes_key, response.getThumbsUp());
		entity.put(Constants.response_downvotes_key, response.getThumbsDown());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/addItem")
	public ResponseEntity<JSONObject> addItem(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.PayloadRequest payloadRequest = SellerProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setSellerId(sellerId).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(4, payloadRequest);

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/changeSalePrice")
	public ResponseEntity<JSONObject> changeSalePrice(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.PayloadRequest payloadRequest = SellerProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setSellerId(sellerId).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(5, payloadRequest);

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/removeItem")
	public ResponseEntity<JSONObject> removeItem(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.PayloadRequest payloadRequest = SellerProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setSellerId(sellerId).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(6, payloadRequest);

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping("/getAllItems")
	public ResponseEntity<JSONObject> getItems(@RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.SellerRequest sellerRequest = SellerProto.SellerRequest.newBuilder().setSellerId(sellerId).build();
		SellerProto.ListResponse response = (SellerProto.ListResponse) this.sellerGrpcHelperService.doGrpcCall(7, sellerRequest);

		entity.put(Constants.response_status_key, response.getStatus());
		entity.put(Constants.response_message_key, response.getMessage());
		entity.put(Constants.response_itemsList_key, response.getResponsePayload());
		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}
}
