package com.aurionpro.model;

public abstract class BankAccount implements ITransaction{
	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount(int accountNumber, String name){
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
}
