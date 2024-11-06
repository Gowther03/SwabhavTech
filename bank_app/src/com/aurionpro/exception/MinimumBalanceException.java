package com.aurionpro.exception;

public class MinimumBalanceException extends RuntimeException {

	private double minimumBalance;
	private double balance;
	public MinimumBalanceException(double balance, double minimumBalance){
		this.minimumBalance = minimumBalance;
		this.balance = balance;
	}
	public String getMessage() {
		return "Minimum Balance: " + minimumBalance + " exceeded! -->Available balance: "+balance+"";
	}
	
}
