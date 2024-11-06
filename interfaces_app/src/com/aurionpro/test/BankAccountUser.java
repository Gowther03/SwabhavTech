package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccount;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class BankAccountUser {

	public static void main(String[] args) {
		System.out.println("----Bank Account----");
		System.out.println("Accountc Type(1. Savings, 2. Current)");
		Scanner scanner = new Scanner(System.in);
		int type = scanner.nextInt();
		switch(type) {
		case 1:
			System.out.println("Name: ");
			String name = scanner.next();
			BankAccount account = new SavingsAccount(101, name);
			System.out.println("Amount to deposit: ");
			int deposit = scanner.nextInt();
			account.deposit(deposit);
			System.out.println("Amount to withdraw: ");
			int withdraw = scanner.nextInt();
			account.withdraw(withdraw);
			System.out.println("Balance in Acc " + account.getAccountNumber() + " is " + account.getBalance());
			break;
		case 2:
			System.out.println("Name: ");
			String name2 = scanner.next();
			CurrentAccount account2 = new CurrentAccount(101, name2);
			System.out.println("Amount to deposit: ");
			int deposit2 = scanner.nextInt();
			account2.deposit(deposit2);
			System.out.println("Amount to withdraw: ");
			int withdraw2 = scanner.nextInt();
			account2.withdraw(withdraw2);
			System.out.println("Balance in Acc " + account2.getAccountNumber() + " is " + account2.getBalance());

			break;
		}
		
	}

}
