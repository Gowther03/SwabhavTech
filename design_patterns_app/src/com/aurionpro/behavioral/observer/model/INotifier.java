package com.aurionpro.behavioral.observer.model;

public interface INotifier {

	public void sendNotification(Account account, double amount, String message , boolean isException, String eMessage);

}
