package com.aurionpro.behavioral.strategy.model;

import java.util.Scanner;

public class PaymentByCreditCard implements PaymentStrategy{
	private CreditCard card;
	private Scanner scanner = new Scanner(System.in);
	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " using Credit Card");
		card.setAmount(card.getAmount() - amount);
		System.out.println("Current balance in Credit Card: " + card.getAmount());

	}

	@Override
	public void collectPaymentDetails() {
		System.out.print("Enter Card Number: ");
		int cardNumber = scanner.nextInt();
		System.out.print("Enter cvv: ");
		int cvv = scanner.nextInt();
		card = new CreditCard(cardNumber, cvv);
	}

	@Override
	public boolean validatePayment() {
		return true;
	}

}
