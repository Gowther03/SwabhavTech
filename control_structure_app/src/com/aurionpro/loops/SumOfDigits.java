package com.aurionpro.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		while(number>0) {
			sum = sum + number%10;
			number = number/10;
		}
		
		System.out.println("Sum of its digits is " + sum);

	}

}
