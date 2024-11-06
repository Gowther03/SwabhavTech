package com.aurionpro.exception;

public class MobileNotValidException extends RuntimeException{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";

	public MobileNotValidException(String message){
		super(ANSI_RED+"----"+message+"----"+ANSI_RESET);
	}
}