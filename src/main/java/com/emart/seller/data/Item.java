package com.emart.seller.data;

public class Item {
    private int id;
    private String name;
    private int category;
    private String keywords;
    private String condition;
    private double price;
    private int sellerId;
    private int quantity;

    public Item() {
    }

    public Item(String name, int category, String keywords, String condition, double price,
                int sellerId, int quantity) {
        this.name = name;
        this.category = category;
        this.keywords = keywords;
        this.condition = condition;
        this.price = price;
        this.sellerId = sellerId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
