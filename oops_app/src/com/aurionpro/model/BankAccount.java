package com.aurionpro.model;

public class BankAccount {
	
	private int accountNumber;
	private String holderName;
	private double balance;
	private double minimumBalance = 500;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double showBalance() {
		return balance;
	}
	public void deposit(double deposit) {
		this.balance += deposit;
		System.out.println("----> Credit Succesfull in " + this.holderName + "'s account!");
	}
	public void withdraw(double withdraw) {
		
		if((this.balance - withdraw) < minimumBalance) {
			System.out.println("Insufficient Balance!");
			System.out.println("----> Debit Unsuccesful!");
		}else {
			this.balance -= withdraw;
			System.out.println("----> Debit Succesfull from " + this.holderName + "'s account!");
		}
	}
}
