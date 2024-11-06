package com.aurionpro.behavioral.observer.test;

import java.util.Scanner;

import com.aurionpro.behavioral.observer.model.Account;
import com.aurionpro.behavioral.observer.model.AccountService;

public class AccountTest {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Account Id: ");
		int accountId = scanner.nextInt();
		System.out.print("Name: ");
		String name = scanner.next();
		Account account = AccountService.makeAccount(accountId, name);
		
		System.out.println("\n1. Email, 2. WhatsApp, 3. SMS");
		int i = 0;
		while(i<3) {
			System.out.print("\nChoose the notification App: ");
			String option = scanner.next();
			notifySwitch(account, option);
			if(i==2) {
				break;
			}
			System.out.print("More Notification App?(0 -> No): " );
			String more = scanner.next();
			if(more.equals("0")) {
				break;
			}
			i++;
		}
		String flag = "1";
		while(flag.equals("1")) {
			System.out.print("\n1. Deposit, 2. Withdraw, 3. Quit:   ");
			String choice = scanner.next();
			switch(choice) {
			case "1": deposit(account);
				break;
			case "2" :withdraw(account);
				break;
			case "3" : 
				flag = "3";
				break;
			default: System.out.println("Invalid");
			   break;
			}
		}
		
	}
	
	
	public static void notifySwitch(Account account, String option) {
		switch(option) {
		case "1" : AccountService.setEmail(account);
		           break;
		case "2" : AccountService.setWhatsApp(account);
				   break;
		case "3" : AccountService.setSMS(account);
				   break;
		default: System.out.println("Invalid");
				   
 		}
	}
	public static void deposit(Account account) {
		System.out.print("\nAmount to deposit: ");
		int deposit = scanner.nextInt();
		account.credit(deposit);
	}
	public static void withdraw(Account account) {
		System.out.print("\nAmount to withdraw: ");
		int withdraw = scanner.nextInt();
		account.debit(withdraw);
	}
}
