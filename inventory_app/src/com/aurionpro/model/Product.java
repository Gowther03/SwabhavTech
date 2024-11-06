package com.aurionpro.model;

import java.io.Serializable;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productId;
	private String name;
	private String description;
	private int quantity;
	private double price;
	private Supplier supplier;
	
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	public void removeQuantity(int quantity) {
		this.quantity -= quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int productId, String name, String description, int quantity, double price) {
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void showDetails() {
		System.out.print("\nProduct ID: " + productId
				+ "\nProduct Name: " +  name
				+ "\nQuantity: " + quantity
				+ "\nPrice: " + price
				+ "\nDescription: " + description);
		if(supplier != null) {
			System.out.println("\nSupplier: " + supplier.getName() + " [" + supplier.getSupplierId() + "]");
		}else {
			System.out.println("\nSupplier: Admin");
		}
	}
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		this.quantity= quantity;
	}

	
}
