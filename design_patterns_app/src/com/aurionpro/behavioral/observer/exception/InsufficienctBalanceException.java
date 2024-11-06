package com.aurionpro.behavioral.observer.exception;

public class InsufficienctBalanceException extends RuntimeException{

	public String getMessage() {
		return "Insufficient Balance";
	}
}
