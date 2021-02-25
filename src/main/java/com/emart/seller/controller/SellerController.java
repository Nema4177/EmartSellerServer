package com.emart.seller.controller;

import com.emart.seller.service.SellerGrpcClientService;
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
import protoFiles.SellerProto;

import com.emart.seller.data.ItemRepository;
import com.emart.seller.service.SellerService;

@RestController
public class SellerController {

	@Autowired
	SellerService service;

	@Autowired
	ItemRepository itemRepository;

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
	public ResponseEntity<JSONObject> createAccount(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.PayloadRequest payloadRequest = SellerProto.PayloadRequest.newBuilder().setPayload(input.toString()).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(0, payloadRequest);

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<JSONObject> login(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.LoginRequest loginRequest = SellerProto.LoginRequest.newBuilder().setPayload(input.toString()).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(1, loginRequest);

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping("/logout")
	public ResponseEntity<JSONObject> logout(@RequestParam String username) {
		JSONObject entity = new JSONObject();

		SellerProto.LogoutRequest logoutRequest = SellerProto.LogoutRequest.newBuilder().setUsername(username).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(2, logoutRequest);

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping("/getSellerRating")
	public ResponseEntity<JSONObject> getSellerRating(@RequestParam long sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.SellerRequest sellerRequest = SellerProto.SellerRequest.newBuilder().setSellerId(sellerId).build();
		SellerProto.SellerRatingResponse response = (SellerProto.SellerRatingResponse) this.sellerGrpcHelperService.doGrpcCall(3, sellerRequest);

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/addItem")
	public ResponseEntity<JSONObject> addItem(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.PayloadRequest payloadRequest = SellerProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setSellerId(sellerId).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(4, payloadRequest);

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/changeSalePrice")
	public ResponseEntity<JSONObject> changeSalePrice(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.PayloadRequest payloadRequest = SellerProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setSellerId(sellerId).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(5, payloadRequest);

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/removeItem")
	public ResponseEntity<JSONObject> removeItem(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.PayloadRequest payloadRequest = SellerProto.PayloadRequest.newBuilder()
				.setPayload(input.toString()).setSellerId(sellerId).build();
		SellerProto.APIResponse response = (SellerProto.APIResponse) this.sellerGrpcHelperService.doGrpcCall(6, payloadRequest);

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping("/getAllItems")
	public ResponseEntity<JSONObject> getItems(@RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		SellerProto.SellerRequest sellerRequest = SellerProto.SellerRequest.newBuilder().setSellerId(sellerId).build();
		SellerProto.ListResponse response = (SellerProto.ListResponse) this.sellerGrpcHelperService.doGrpcCall(7, sellerRequest);

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}
}
