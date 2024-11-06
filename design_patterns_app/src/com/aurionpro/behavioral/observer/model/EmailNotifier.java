package com.aurionpro.behavioral.observer.model;

public class EmailNotifier implements INotifier{

	@Override
	public void sendNotification(Account account, double amount, String message , boolean isException, String emessage) {
		// TODO Auto-generated method stub
		if(isException) {
			System.out.println("Email: " + emessage);
		}else {
			System.out.println("Email: " + account.getAccountNo() + " " + message + " with " + amount);
			System.out.println("Balance: " +  account.getBalance());
		}
		
	}

}
