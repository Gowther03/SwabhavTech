package com.aurionpro.behavioral.observer.model;

import java.util.List;

import com.aurionpro.behavioral.observer.exception.InsufficienctBalanceException;

public class Account {
	private int accountNo;
	private String holderName;
	private double balance = 0;
	private List<INotifier> notifiers;
	private boolean isException = false;
	private String message = "";
	
	
	public Account(int accountNo, String holderName, List<INotifier> notifiers) {
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.notifiers = notifiers;
	}
	
	public void credit(double amount) {
		balance += amount;
		for(INotifier notifier : notifiers) {
			System.out.println();
			notifier.sendNotification(this, amount, "has been credited", isException, message);
		}
	}
	public void debit(double amount) {
		
		try {
			if(amount>balance) {
				throw new InsufficienctBalanceException();
			}
			balance -= amount;
		}catch(InsufficienctBalanceException exception) {
			isException = true;
			message = exception.getMessage();
		}
		
		for(INotifier notifier : notifiers) {
			System.out.println();
			notifier.sendNotification(this, amount, "has been debited", isException, message);
		}
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

	public List<INotifier> getNotifiers() {
		return notifiers;
	}
}
