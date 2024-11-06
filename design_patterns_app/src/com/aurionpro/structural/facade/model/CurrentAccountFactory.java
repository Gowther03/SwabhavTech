package com.aurionpro.structural.facade.model;

public class CurrentAccountFactory implements IAccountFactory{

	@Override
	public IAccount makeAccount() {
		// TODO Auto-generated method stub
		return new CurrentAccount();
	}

}
