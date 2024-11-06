package com.aurionpro.model;

public class SavingsAccountFactory implements IAccountFactory{

	@Override
	public IAccount makeAccount() {
		// TODO Auto-generated method stub
		return new SavingsAccount();
	}

}
