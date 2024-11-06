package com.aurionpro.structural.facade.model;

public class AccountService {
	private static IAccountFactory factory;
	private static IAccount account;
	public static IAccount makeSavingsAccount() {
		factory = new SavingsAccountFactory();
		account = factory.makeAccount();
		return account;
	}
	public static IAccount makeCurrentAccount() {
		factory = new CurrentAccountFactory();
		account =  factory.makeAccount();
		return account;
	}
	public static IAccount makeAccount(IAccountFactory factory) {
		return factory.makeAccount();
		
	}
}
