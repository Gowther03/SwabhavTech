package com.aurionpro.model;

public class Product {
	private int productId;
	private double price;
	private String name;
	
	public Product(int productId,String name,double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}

	public int getProductId() {
		return productId;
	}

}
