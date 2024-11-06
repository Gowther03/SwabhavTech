package com.aurionpro.behavioral.strategy.model;

import java.util.Scanner;

public class PaymentByUPIApp implements PaymentStrategy{
	private UPIApp app;
	private String email;
	private String password;
	private Scanner scanner = new Scanner(System.in);
	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " through UPI app");
		app.setAmount(app.getAmount() - amount);
		System.out.println("Current balance in UPI app: " + app.getAmount());
	}

	@Override
	public void collectPaymentDetails() {
		System.out.print("Enter email: ");
		email = scanner.next();
		System.out.print("Enter password: ");
		password = scanner.next();
		app = new UPIApp(email, password);
	}

	@Override
	public boolean validatePayment() {
		return true;
	}

}
