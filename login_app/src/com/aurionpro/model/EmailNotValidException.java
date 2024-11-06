package com.aurionpro.model;

public class EmailNotValidException extends RuntimeException{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public String getMessage() {
		return (ANSI_RED +"\n----Email Not Valid----"+ANSI_RESET);
	}

}
