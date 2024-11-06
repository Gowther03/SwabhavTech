package com.aurionpro.model;

public abstract class BankAccount {
	
	private int accountNumber;
	private String holderName;
	private String accountType;
	private static int accountCount;
	
	BankAccount(int accountNumber, String holderName){
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		accountCount++;
	}
		
	public void getAccountCount() {
		System.out.println("Total Accounts created: " + accountCount);
	}	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}
	public abstract void deposit(double deposit);
	public abstract double getBalance();

	public abstract void withdraw(double withdraw);

}
