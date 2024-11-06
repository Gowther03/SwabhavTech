package com.aurionpro.model;

public class InvalidPasswordException  extends Exception{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	
	public InvalidPasswordException(String message){
		super(ANSI_RED+"----"+message+"----"+ANSI_RESET);
	}
}
