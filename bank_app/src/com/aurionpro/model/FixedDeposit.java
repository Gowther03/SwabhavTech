package com.aurionpro.model;

public class FixedDeposit extends BankAccount {
	private double amount;
	private double principal;
	private double interestRate = 7.2;
	private int maturityTime;
	private static int fdCount;

	public FixedDeposit(int accountNumber,String holderName,int maturityTime){
		super(accountNumber, holderName);
		this.maturityTime = maturityTime;
		fdCount++;
	}
	
	public void getFDCount() {
		System.out.println("Total Fixed Deposits created: " + fdCount);
	} 
	
	public double getPrincipal() {
		return principal;
	}
	public double getInterestRate() {
		return interestRate;
	}
	@Override
	public double getBalance() {
		System.out.println("Pricipal Amount: " + getPrincipal() + "    Interest Applied: " + getInterestRate() + "%");
		return amount;
	}
	
	@Override
	public void deposit(double deposit) {
		this.amount += deposit;
		this.principal += deposit;
		System.out.println("----> Credit Succesfull in " + super.getHolderName() + "'s account!");
		amount += (amount*interestRate*maturityTime)/100;
	}
	
	@Override
	public void withdraw(double withdraw) {

		if((this.amount - withdraw) < 0) {
		
			System.out.println("Insufficient Balance!");
			System.out.println("----> Debit Unsuccesful!");
		}else {
			this.amount -= withdraw;
			System.out.println("----> Debit Succesfull from " + super.getHolderName() + "'s account!");
		}
		
	}
}
