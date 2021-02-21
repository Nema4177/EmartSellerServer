package com.emart.seller.controller;

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

import com.emart.seller.data.ItemRepository;
import com.emart.seller.service.SellerService;

@RestController
public class SellerController {

	@Autowired
	SellerService service;

	@Autowired
	ItemRepository itemRepository;

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
		try {
			service.createAccount(input);
			entity.put("sellerId", sellerId);
			entity.put("value", input.get("value"));
			entity.put("status", "success");
		} catch (Exception e) {

		}

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<JSONObject> login(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();
		try {
			service.login(input);
			entity.put("sellerId", sellerId);
			entity.put("value", input.get("value"));
			entity.put("status", "success");

		} catch (Exception e) {

		}

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping("/logout")
	public ResponseEntity<JSONObject> logout(@RequestParam int sellerId) {
		service.logout(sellerId);

		JSONObject entity = new JSONObject();
		entity.put("value", 20);
		entity.put("status", "success");

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping("/getSellerRating")
	public ResponseEntity<JSONObject> getSellerRating(@RequestParam int sellerId) {
		JSONObject entity = new JSONObject();

		try {
			service.getSellerRating(sellerId);
			entity.put("value", 20);
			entity.put("status", "success");
		} catch (Exception e) {

		}

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/addItem")
	public ResponseEntity<JSONObject> addItem(@RequestBody JSONObject input, @RequestParam int sellerId) {
		service.addItem(input, sellerId);

		JSONObject entity = new JSONObject();
		entity.put("value", 20);
		entity.put("status", "success");

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/changeSalePrice")
	public ResponseEntity<JSONObject> changeSalePrice(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();
		try {
			service.changeSalePrice(input, sellerId);

			entity.put("value", 20);
			entity.put("status", "success");
		} catch (Exception e) {

		}

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@PostMapping("/removeItem")
	public ResponseEntity<JSONObject> removeItem(@RequestBody JSONObject input, @RequestParam int sellerId) {
		JSONObject entity = new JSONObject();
		try {
			service.removeItem(input, sellerId);
			entity.put("value", 20);
			entity.put("status", "success");

		} catch (Exception e) {

		}

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}

	@GetMapping("/getAllItems")
	public ResponseEntity<JSONObject> getItems(@RequestParam int sellerId) {
		service.getItems(sellerId);

		JSONObject entity = new JSONObject();
		entity.put("value", 20);
		entity.put("status", "success");

		return new ResponseEntity<JSONObject>(entity, HttpStatus.OK);
	}
}
