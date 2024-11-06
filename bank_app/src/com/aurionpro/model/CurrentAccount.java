package com.aurionpro.model;

import com.aurionpro.exception.OverdraftExceededException;

public class CurrentAccount extends BankAccount{
	private double balance;
	private double overDraft;
	private static int currentCount;

	public CurrentAccount(int accountNumber,String holderName, double overDraft){
		super(accountNumber, holderName);
		this.overDraft = overDraft;
		currentCount++;
	}
	
	public void getCurrentCount() {
		System.out.println("Total Current Accounts created: " + currentCount);
	}
	
	@Override
	public double getBalance() {
		
		return balance;
	}
	
	@Override
	public void deposit(double deposit) {
		this.balance += deposit;
		System.out.println("----> Credit Succesfull in " + super.getHolderName() + "'s account!");
		
	}
	@Override
	public void withdraw(double withdraw) {

		if((this.balance - withdraw) < 0) {
			this.balance -= withdraw;
			System.out.println("Using Overdraft --> " + balance);
			if((this.balance) < (-overDraft)) {
				throw new OverdraftExceededException(balance, overDraft);
			}
		}else {
			this.balance -= withdraw;
			System.out.println("----> Debit Succesfull from " + super.getHolderName() + "'s account!");
		}
		
	}
}
