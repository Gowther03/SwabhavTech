package com.aurionpro.operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the number 2: ");
		int number2 = scanner.nextInt();
		System.out.println("Which operation(add, sub, mul, div, rem)? --> ");
		
		String option = scanner.next();
		
		if(option.equals("add")) {
			System.out.println("Addition result --> " + (number1+number2));
			
		}else if(option.equals("sub")){
			System.out.println("Subtraction result --> " + (number1-number2));
			
		}else if(option.equals("mul")){
			System.out.println("Multiplication result --> " + (number1*number2));
			
		}else if(option.equals("div")){
			System.out.println("Division result --> " + (number1/number2));
			
		}else if(option.equals("rem")){
			System.out.println("Remaider result --> " + (number1%number2));
			
		}else {
			System.out.println("wrong option");
		}
	}

}
