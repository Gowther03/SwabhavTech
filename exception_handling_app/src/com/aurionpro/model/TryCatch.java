package com.aurionpro.model;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int number = Integer.parseInt(args[0]);
			int number3 = Integer.parseInt(args[1]);
			double result = number/number3;
			System.out.println("Result is: " + result);
		}
		catch(ArithmeticException exception){
			System.out.println("cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Wrong number of inputs!");
		}
		catch(NumberFormatException exception) {
			System.out.println("Only Integers are allowed");
		}
		catch(Exception exception) {
			System.out.println("");

		}
		System.out.println("bye");
	}
	
}
