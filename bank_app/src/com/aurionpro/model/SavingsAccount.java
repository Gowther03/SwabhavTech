package com.aurionpro.model;

import com.aurionpro.exception.MinimumBalanceException;

public class SavingsAccount extends BankAccount{
	private double balance;
	private double interestRate;
	private double minimumBalance = 500;
	private static int savingsCount;
	
	public SavingsAccount(int accountNumber,String holderName, double interestRate){
		super(accountNumber, holderName);
		this.interestRate = interestRate;
		savingsCount++;
	}
	
	public void getSavingsCount() {
		System.out.println("Total Savings Accounts created: " + savingsCount);
	} 
	
	@Override
	public double getBalance() {
		System.out.println("if Interest Rate Applied: " + (balance+(balance*interestRate)));

		return balance;
	}

	@Override
	public void deposit(double deposit) {
		this.balance += deposit;
		System.out.println("----> Credit Succesfull in " + super.getHolderName() + "'s account!");
		
	}
	@Override
	public void withdraw(double withdraw) {
		if((this.balance - withdraw) < minimumBalance) {
			throw new MinimumBalanceException(balance, minimumBalance);
		}else {
			this.balance -= withdraw;
			System.out.println("----> Debit Succesfull from " + super.getHolderName() + "'s account!");
		}
		
	}
	
}
