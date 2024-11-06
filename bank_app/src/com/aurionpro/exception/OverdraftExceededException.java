package com.aurionpro.exception;

public class OverdraftExceededException extends RuntimeException{
	private double overDraft;
	private double balance;
	public OverdraftExceededException(double balance, double overDraft){
		this.overDraft = overDraft;
		this.balance = balance;
		System.out.println("OverDraft Exceeds!, Insufficient Balance!");
		System.out.println("----> Debit Unsuccesful!");
	}
	public String getMessage() {
		return "Overdraft: " + overDraft + " exceeded! -->Available balance: "+balance+"";
	}
}
