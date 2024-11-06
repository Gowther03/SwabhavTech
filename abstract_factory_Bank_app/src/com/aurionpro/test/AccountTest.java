package com.aurionpro.test;

import com.aurionpro.model.CurrentAccountFactory;
import com.aurionpro.model.IAccount;
import com.aurionpro.model.IAccountFactory;
import com.aurionpro.model.SavingsAccountFactory;

public class AccountTest {
	public static void main(String[] args) {
		IAccountFactory factory1 = new SavingsAccountFactory();
		IAccount savingsAccount = factory1.makeAccount();
		savingsAccount.credit();
		savingsAccount.debit();
		
		IAccountFactory factory2 = new CurrentAccountFactory();
		IAccount currentAccount =  factory2.makeAccount();
		currentAccount.credit();
		currentAccount.debit();
	}
}
