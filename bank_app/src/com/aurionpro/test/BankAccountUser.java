package com.aurionpro.test;

import java.util.Random;


import java.util.Scanner;

import com.aurionpro.exception.MinimumBalanceException;
import com.aurionpro.exception.NegativeAmountException;
import com.aurionpro.exception.OverdraftExceededException;
import com.aurionpro.model.BankAccount;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.SavingsAccount;


public class BankAccountUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Press 'Y' to open Bank Account('N' -> No): ");
			String input = scanner.next();
			if(input.toLowerCase().equals("y")) {
				System.out.println("\nCreate Account");
				System.out.print("Account Type(1. Savings, 2.Current, 3.FD) --> ");
				int type = scanner.nextInt();
				createAccount(type);
			}
			else if(input.toLowerCase().equals("n")) {
				System.out.println("Thank You For Not Banking!");
				break;
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		
		
			
	}
	
	public static void createAccount(int type) 
	{
		Scanner scanner = new Scanner(System.in);
		int accountNumber = 0;
		String name = null;
		double interestRate = 0.0;
		int overDraft = 0;
		int maturityTime;
		switch(type) {
		case 1:
			accountNumber = codeGenerator();
			System.out.print("Account Holder Name: ");
			name = scanner.next();
			System.out.print("Interest Rate: ");
			interestRate = scanner.nextInt();
			SavingsAccount savingAccount = new SavingsAccount(accountNumber,name,interestRate);
			savingAccount.getSavingsCount();
			savingAccount.getAccountCount();
			accountDetails(savingAccount);
			break;
		case 2:
			accountNumber = codeGenerator();
			System.out.print("Account Holder Name: ");
			name = scanner.next();
			System.out.print("Overdraft: ");
			overDraft = scanner.nextInt();
			CurrentAccount currentAccount = new CurrentAccount(accountNumber,name,overDraft);
			currentAccount.getCurrentCount();
			currentAccount.getAccountCount();
			accountDetails(currentAccount);
			break;
		case 3:
			accountNumber = codeGenerator();
			System.out.print("Account Holder Name: ");
			name = scanner.next();
			System.out.print("Maturity Time: ");
			maturityTime = scanner.nextInt();
			
			FixedDeposit fixedAccount = new FixedDeposit(accountNumber,name,maturityTime);
			fixedAccount.getFDCount();
			fixedAccount.getAccountCount();
			accountDetails(fixedAccount);
			break;
		default:
			System.out.println("Invalid Input!");
			break;
		}
	}
	
	public static int codeGenerator() {
		Random random = new Random();
		return (random.nextInt(500000)+100000);
	}
	
	public static void accountDetails(BankAccount account) {
		Scanner scanner = new Scanner(System.in);
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
				try {
					negativeCheck(deposit);
					account.deposit(deposit);
				}
				catch(NegativeAmountException exception){
					System.out.println(exception.getMessage());
				}
				break;
			case 2:
				System.out.print("Enter Amount: ");
				double withdraw = scanner.nextDouble();
				try {
					negativeCheck(withdraw);
					account.withdraw(withdraw);
				}
				catch(NegativeAmountException exception){
					System.out.println(exception.getMessage());
				}
				catch(MinimumBalanceException exception) {
					System.out.println(exception.getMessage());
				}
				catch(OverdraftExceededException exception) {
					System.out.println(exception.getMessage());
				}
				break;
			case 3:
				System.out.println("Balance: " + account.getBalance());
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
	}
	public static void negativeCheck(double amount) {
		if(amount<0) {
			throw new NegativeAmountException();
		}
	}
}
