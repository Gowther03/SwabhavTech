package com.aurionpro.test;

import java.util.Random;
import java.util.*;
import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class BankAccountUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Press 'Y' to open Bank Account('N' -> No): ");
		String input = scanner.next();		
		if(input.toLowerCase().equals("y")) {

			System.out.println("Create Account");
			BankAccount account = new BankAccount();
			int accountNumber = random.nextInt(500000)+100000;
			account.setAccountNumber(accountNumber);
			System.out.print("Account Holder Name: ");
			String name = scanner.next();
			account.setHolderName(name);
			System.out.println("Your Account Number: "+ account.getAccountNumber());
			System.out.println("\n-----Menu-----");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			while(true) {
				System.out.print("\nEnter Menu Number to Perform Specified Action: ");
				int action = scanner.nextInt();
				switch(action) {
				case 1:
					System.out.print("Enter Amount: ");
					double deposit = scanner.nextDouble();
					account.deposit(deposit);
					break;
				case 2:
					System.out.print("Enter Amount: ");
					double withdraw = scanner.nextDouble();
					account.withdraw(withdraw);
					break;
				case 3:
					System.out.println("Balance: " + account.showBalance());
					break;
				case 4:
					System.out.println("Thank You For Banking!");
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
				if(action == 4) {
					break;
				}
			}
		}else if(input.toLowerCase().equals("n")){
			System.out.println("Thank You For Not Banking!");
		}else {
			System.out.println("Invalid Input");
		}
	}
}
