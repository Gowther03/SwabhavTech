package com.aurionpro.model;

public interface INotifier {

	public void showMessage(Transaction transaction, boolean isException, String message);
}
