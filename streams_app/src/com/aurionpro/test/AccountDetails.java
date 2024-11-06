package com.aurionpro.test;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AccountDetails {

	private static Scanner scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Account{
			int accountNo;
			String name;
			double balance;
			
			Account(int accountNo, String name, double balance){
				this.accountNo = accountNo;
				this.name =name;
				this.balance = balance;
			}
			
			void display() {
				System.out.println("\nAccount No.: " + accountNo);
				System.out.println("Name: " + name);
				System.out.println("Balance: " + balance);
			}
			public String getName() {
				return name;
			}
			public double getBalance() {
				return balance;
			}

		}
		scanner = new Scanner(System.in);
		Account account;
		List<Account> accounts = new ArrayList<Account>();
		for(int i = 0; i<3;i++) {
			System.out.print("\nAccount No.: " );
			int accNo = scanner.nextInt();
			System.out.print("Name: ");
			String name = scanner.next();
			System.out.print("Balance: ");
			double balance = scanner.nextDouble() ;
			account = new Account(accNo, name, balance);
			accounts.add(account);
		}
		
		Account minimumBalanceAccount = accounts.stream()
												.min(Comparator.comparing((minAccount) -> minAccount
																							.getBalance()))
																							.get();
		System.out.println("\nAccount with Minimum balance -->");
		minimumBalanceAccount.display();
		
		Account maximumBalanceAccount = accounts.stream()
												.max(Comparator.comparing(maxAccount -> maxAccount
																							.getBalance()))
																							.get();
		System.out.println("\nAccount with Maximum balance -->");
		maximumBalanceAccount.display();
		
		System.out.println("\nAccounts having HolderName length >= 6 -->");
		accounts.stream()
				.filter(charAccount -> (charAccount.getName().length()>=6))
				.forEach(tempAccount -> tempAccount.display());
		
		
		double sum = accounts.stream().mapToDouble(tempAccount -> tempAccount.getBalance()).sum();
		System.out.print("\nTotal of Balance of all accounts --> " + sum);		
	}
}
