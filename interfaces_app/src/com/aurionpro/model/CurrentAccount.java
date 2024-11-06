package com.aurionpro.model;

public class CurrentAccount extends BankAccount implements ITransaction{

	public CurrentAccount(int accountNumber,String name){
		super(accountNumber, name);
	}

	@Override
	public void deposit(int deposit) {
		setBalance(getBalance() + deposit);
		System.out.println("----> Debit Succesfull!");
	}

	@Override
	public void withdraw(int withdraw) {
		setBalance(getBalance() - withdraw);
		System.out.println("----> Debit Succesfull!");
	}

}
