package com.aurionpro.ocp.voilation.test;

import java.util.Scanner;

import com.aurionpro.ocp.voilation.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account No: ");
		int accountNo = scanner.nextInt();
		System.out.println("Enter Name: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter Principle Amount: ");
		double amount = scanner.nextDouble();
		System.out.println("1. Diwali, 2. Holi, 3. Christmas, 4. New Year");
		System.out.println("Enter Index: ");
		String index = scanner.next();
		System.out.println("Enter the Duration in Years:");
		double duration = scanner.nextDouble();
		FixedDeposit fixedDeposit = new FixedDeposit(accountNo, name, amount, duration);
		System.out.println("Interest Amount: " + fixedDeposit.calculateInterest(index));
	}

}
