package com.aurionpro.behavioral.strategy.model;

public interface PaymentStrategy {
	public void pay(int amount);
	public void collectPaymentDetails();
	public boolean validatePayment();
}
