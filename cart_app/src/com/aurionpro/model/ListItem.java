package com.aurionpro.model;

public class ListItem {
	private int lineId;
	private Product product;
	private int quantity;
	
	public ListItem(int lineId, Product product, int quantity) {
		this.lineId = lineId;
		this.quantity = quantity;
		this.product = product;
	}

	public int getLineId() {
		return lineId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
