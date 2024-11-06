package com.aurionpro.exception;

public class NegativeAmountException extends RuntimeException{
	public String getMessage() {
		return "Amount Cannot Be Negative";
	}
}
