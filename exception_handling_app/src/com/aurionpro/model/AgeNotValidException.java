package com.aurionpro.model;

public class AgeNotValidException extends RuntimeException{
	private int age;
	public AgeNotValidException(int age) {
		this.age = age;
		
	}
	
	public String getMessage() {
		return "Your entered age: " + age + " is not more than 18";
	}
}
