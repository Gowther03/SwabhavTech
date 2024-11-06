package com.aurionpro.behavioral.observer.model;

public class WhatsAppNotifier implements INotifier{

	@Override
	public void sendNotification(Account account, double amount, String message, boolean isException, String eMessage) {
		// TODO Auto-generated method stub
		if(isException) {
			System.out.println("WhatsApp: " + eMessage);
		}else {
			System.out.println("WhatsApp: " + account.getAccountNo() + " " + message + " with " + amount);
			System.out.println("Balance: " +  account.getBalance());
		}
	}

}
