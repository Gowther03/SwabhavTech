package com.aurionpro.model;

import java.util.ArrayList;

public class User {
	private int userId;
	private String userName;
	private String phone;
	private ArrayList<Cart> carts;
	
	public User(int userId, String userName, String phone, ArrayList<Cart> carts) {
		this.userId =userId;
		this.userName = userName;
		this.phone = phone;
		this.carts = carts;	
	}
	public int getUserId() {
		return userId;
	}
	
	public void displayUserBill() {
		System.out.println("Customer Name: " + userName + "[" + userId + "]");
		System.out.println("Phone No.: " + phone);
		for(Cart cart: carts) {
			System.out.println("\nCart " + (carts.indexOf(cart)+1) + "[" + cart.getCartId() + "]: ");
			System.out.println("Sr.\tID\tName\t\tPrice\tQty\tTotal");
			for(ListItem item: cart.getListItems()) {
				System.out.println((cart.getListItems().indexOf(item)+1) + ". \t" + item.getProduct().getProductId()
						+ "\t" + item.getProduct().getName()
						+ "\t\t" + item.getProduct().getPrice()
						+ "\t" + item.getQuantity()
						+ "\t" + (item.getProduct().getPrice() * item.getQuantity()));
			}
			System.out.println("-----------------------------------------------------");
			System.out.println("Total:\t\t" + cart.getProductCount() + "\t\t\t" + cart.calculateQuantity(cart.getListItems())+ "\t" + cart.calculateTotal(cart.getListItems()));
			System.out.println("\nDate: " + cart.getDate());
		}
	}
}
