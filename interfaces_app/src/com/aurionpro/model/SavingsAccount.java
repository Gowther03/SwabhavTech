package com.aurionpro.model;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(int accountNumber, String name) {
		super(accountNumber, name);
	}

	@Override
	public void deposit(int deposit) {
		setBalance(getBalance() + deposit);
		System.out.println("----> Credit Succesfull!");
		
	}

	@Override
	public void withdraw(int withdraw) {
		setBalance(getBalance() - withdraw);
		System.out.println("----> Debit Succesfull!");

	}

}
