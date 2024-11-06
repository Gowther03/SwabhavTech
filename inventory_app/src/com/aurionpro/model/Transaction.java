package com.aurionpro.model;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int transactionId;
	private Date date;
	private int quantity;
	private String type;
	private Product product;
	
	public Transaction(int transactionId, Date date, int quantity, String type, Product product) {
		this.transactionId = transactionId;
		this.date = date;
		this.quantity = quantity;
		this.type = type;
		this.setProduct(product);
	}
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public void showDetails() {
		System.out.println("\nTransaction ID: " + transactionId
				+ "\nProduct ID: " +  product.getProductId()
				+ "\nTransaction: " + quantity + " " + type
				+ "\nDate: " + date);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
