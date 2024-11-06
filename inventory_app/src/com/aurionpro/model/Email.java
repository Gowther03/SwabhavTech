package com.aurionpro.model;

public class Email implements INotifier{

	@Override
	public void showMessage(Transaction transaction, boolean isException, String message) {
		if(isException) {
			System.out.println("Email:\n" + message+ "\n");
		}else {
			System.out.println("Email: " + transaction.getQuantity() + " "+transaction.getType());
			System.out.println("Through Transaction ID: "+ transaction.getTransactionId());
			System.out.println("in the Product : " + transaction.getProduct().getName()+"["+transaction.getProduct().getProductId()+"]");
			System.out.println("Date: " + transaction.getDate() + "\n");
		}
	}

}
