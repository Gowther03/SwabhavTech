package com.aurionpro.dip.solution.test;

import java.util.Scanner;

import com.aurionpro.dip.solution.model.TaxCalculator;

public class TaxCalcutorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount = scanner.nextInt();
		System.out.println("Enter rate: ");
		int rate = scanner.nextInt();
		TaxCalculator calculator = new TaxCalculator(amount, rate);
		calculator.calculateTax();
	}
}
