package com.aurionpro.structural.facade.test;

import com.aurionpro.structural.facade.model.AccountService;
import com.aurionpro.structural.facade.model.IAccount;
import com.aurionpro.structural.facade.model.SavingsAccountFactory;

public class AccountTest {
	public static void main(String[] args) {
		IAccount account1 = AccountService.makeSavingsAccount();
		account1.credit();
		account1.debit();
		IAccount account2 = AccountService.makeCurrentAccount();
		account2.credit();
		account2.debit();
		IAccount account3 = AccountService.makeAccount(new SavingsAccountFactory());
		account3.credit();
		account3.debit();
	}
	
}
