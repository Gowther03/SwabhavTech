package com.aurionpro.behavioral.strategy.model;

public class CreditCard {

	private int cardNumber;
	private int cvv;
	private int amount = 20000;
	public CreditCard(int cardNumber, int cvv) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

}
