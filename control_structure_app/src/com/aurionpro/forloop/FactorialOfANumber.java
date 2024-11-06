package com.aurionpro.forloop;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number --> ");
		int number = scanner.nextInt();
		int factorial = 1;
		for(int i = number;i>=1;i--) {
			factorial *= i;
		}
		System.out.print("Factorial is --> " + factorial);
	}

}
