package com.aurionpro.behavioral.strategy.model;

public class UPIApp {

	private String email;
	private String password;
	private int amount = 20000;
	
	public UPIApp(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}
}
