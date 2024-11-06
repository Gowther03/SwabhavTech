package com.aurionpro.behavioral.strategy.test;

import java.util.Scanner;

import com.aurionpro.behavioral.strategy.model.PaymentByCreditCard;
import com.aurionpro.behavioral.strategy.model.PaymentByUPIApp;
import com.aurionpro.behavioral.strategy.model.PaymentService;

public class PaymentTest {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentService service = new PaymentService();
		System.out.println("Product: Smartphone");
		System.out.print("Enter the cost: ");
		service.setCost(scanner.nextInt());
		System.out.print("Has Delivery cost?: ");
		service.setIncludeDelivery(scanner.nextBoolean());
		System.out.println("\nUsing Payment By Credit Card Strategy");
		service.setStrategy(new PaymentByCreditCard());
		service.processOrder();
		System.out.println("\nUsing Payment By UPI app Strategy");
		service.setStrategy(new PaymentByUPIApp());
		service.processOrder();
	}

}
