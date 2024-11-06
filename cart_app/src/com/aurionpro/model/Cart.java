package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Date;

public class Cart {
	private int cartId;
	private ArrayList<ListItem> listItems;
	private double total;
	private Date date;
	private int productCount;
	private int totalQuantity;
	
	public Cart(int cartId, ArrayList<ListItem> listItems, Date date, int productCount) {
		this.cartId = cartId;
		this.listItems = listItems;
		this.date = date;
		this.productCount += productCount;
	}

	public ArrayList<ListItem> getListItems() {
		return listItems;
	}

	public void setListItems(ArrayList<ListItem> listItems) {
		this.listItems = listItems;
	}
	
	public double calculateTotal(ArrayList<ListItem> listItems) {
		for(ListItem listItem: listItems) {
			total += listItem.getProduct().getPrice() * listItem.getQuantity();
		}
		return total;
	}
	
	public int calculateQuantity(ArrayList<ListItem> listItems) {
		for(ListItem listItem: listItems) {
			totalQuantity += listItem.getQuantity();
		}
		return totalQuantity;
	}

	public int getCartId() {
		return cartId;
	}

	public Date getDate() {
		return date;
	}

	public int getProductCount() {
		return productCount;
	}
}
