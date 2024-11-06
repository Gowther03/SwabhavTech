package com.aurionpro.model;

public class CurrentAccount implements IAccount{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Credited in current Account");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("debited from current Account");

	}

}
