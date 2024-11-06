package com.aurionpro.test;

import java.util.Scanner;


import com.aurionpro.model.EmailNotValidException;
import com.aurionpro.model.InvalidPasswordException;
import com.aurionpro.model.UserLogin;

public class UserTest{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	private static String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String email, password;
		System.out.println("Enter Details--->");
		while(true) {
			try {
				System.out.print("\nEmail: ");
				email = scanner.next();
				if(!email.matches(emailRegex)) {
					throw new EmailNotValidException();
				}
				break;
			}
			catch(EmailNotValidException exception){
				System.out.println(exception.getMessage());
			}
		}
		while(true) {
			try {
				System.out.print("\nPassword: ");
				password = scanner.next();
				passwordCheck(password);
				break;
			}
			catch(InvalidPasswordException exception) {
				System.out.println(exception.getMessage());
			}
		}
		UserLogin user = new UserLogin(email, password);;
		System.out.println(ANSI_GREEN+"----Login Details Saved Successfully" + ANSI_RESET);
	}
	
	public static void passwordCheck(String password) throws InvalidPasswordException {
		if(password.length() < 8 | password.length() > 15) {
			throw new InvalidPasswordException("Password length should be between 8 to 15 characters.");
		}
		if(password.contains(" ")) {
			throw new InvalidPasswordException("Password should not contain any spaces");
		}
		if(!password.matches(".*\\d.*")) {
			throw new InvalidPasswordException("Password should contain atleast one digit(0-9).");
		}
		if(!password.matches(".*[a-z].*")) {
			throw new InvalidPasswordException("Password should contain atleast one lowercase letter (a-z).");
		}
		if(!password.matches(".*[A-Z].*")) {
			throw new InvalidPasswordException("Password should contain atleast one uppercase letter (A-Z).");
		}
		if(!password.matches(".*[!$@#%&*].*")) {
			throw new InvalidPasswordException("Password should contain atleast one special character (!$@#%&*).");
		}
	}
}
