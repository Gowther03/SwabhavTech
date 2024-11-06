package com.aurionpro.exception;

public class NegativeValueException extends RuntimeException{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public String getMessage() {
		return ANSI_RED+"----"+"Value Cannot Be Negative"+"----"+ANSI_RESET;
	}
}