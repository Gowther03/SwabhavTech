package com.aurionpro.structural.facade.model;

public class SavingsAccount implements IAccount{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Credited in Savings Account");

	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debited from Savings Account");

	}

}
