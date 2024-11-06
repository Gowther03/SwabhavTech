package com.aurionpro.dip.voilation.test;

import java.util.Scanner;

import com.aurionpro.dip.voilation.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount = scanner.nextInt();
		System.out.println("Enter rate: ");
		int rate = scanner.nextInt();
		TaxCalculator taxCalculator = new TaxCalculator();
		taxCalculator.calculateTax(amount, rate);
	}

}
