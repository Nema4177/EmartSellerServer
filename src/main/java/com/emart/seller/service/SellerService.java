package com.emart.seller.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.seller.DAO.SellerDAO;
import com.emart.seller.data.Item;
import com.emart.seller.data.ItemCondition;
import com.emart.seller.utils.Constants;

@Service
public class SellerService {
	
	@Autowired
	SellerDAO sellerDao;
	
	public String getItems() {
		return "List of Items";
	}

	public JSONObject createAccount(JSONObject input) throws Exception{
		JSONObject response = new JSONObject();
		try {
			String username = (String) input.get("username");
			String password = (String) input.get("password");
			int sellerId = sellerDao.createAccount(username,password);
			response.put(Constants.response_sellerId_key, sellerId);
		}catch(Exception e) {
			System.out.println("Exception encountered when creating account "+e.getMessage());
			e.printStackTrace();
		}
		return response;

	}

	public JSONObject login(JSONObject input) throws Exception{
		JSONObject response = new JSONObject();
		try {
			String username = (String) input.get("username");
			String password = (String) input.get("password");
			int sellerId = sellerDao.login(username,password);
			response.put(Constants.response_sellerId_key, sellerId);
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Exception encountered when logging in "+e.getMessage());		
		}
		return response;
	}

	public void logout(int sellerId) {
		// TODO Auto-generated method stub
		
	}

	public int getSellerRating(int sellerId) throws Exception{		
		int sellerRating=0;
		try {
			sellerRating = sellerDao.getSellerRating(sellerId);
		}catch(Exception e) {
			System.out.println("Exception encountered when getting seller rating "+e.getMessage());
			e.printStackTrace();
		}
		return sellerRating;		
	}

	public void addItem(JSONObject input, int sellerId) {
		
    	String itemId = (String) input.get(Constants.request_item_id_key);
    	Double price = (Double) input.get(Constants.request_item_price_key);
    	String keywords = (String) input.get(Constants.request_item_keywords_key);
    	String[] keywordArray = keywords.split("-");
    	int category = (int) input.get(Constants.request_item_category_key);
    	int quantity = (int) input.get(Constants.request_item_quantity_key);
    	String itemName = (String) input.get(Constants.request_item_name_key);
    	ItemCondition itemCondition = (ItemCondition) input.get(Constants.request_item_condition_key);
    	Item item = new Item(itemName,category,new ArrayList<>(Arrays.asList(keywordArray)),itemCondition,price,sellerId,quantity);
	}

	public void changeSalePrice(JSONObject input, int sellerId) throws Exception{
		try {
			String itemId = (String) input.get(Constants.request_item_id_key);
			Double newSalePrice = (Double) input.get(Constants.request_item_price_key);
			sellerDao.changeSalePrice(itemId,newSalePrice);	
		}
		catch(Exception e) {
			System.out.println("Exception encountered when changing saleprice "+e.getMessage());
			e.printStackTrace();
		}
		
	}

	public void getItems(int sellerId) {
		sellerDao.getItems(sellerId);
	}

	public void removeItem(JSONObject input, int sellerId) throws Exception{
		try {
			String itemId = (String) input.get("itemId");
			String quantity = (String) input.get("quantity");
			sellerDao.remove(itemId,quantity);		
		}
		catch(Exception e) {
			System.out.println("Exception encountered when removing item "+e.getMessage());
			e.printStackTrace();
		}
	}

}
