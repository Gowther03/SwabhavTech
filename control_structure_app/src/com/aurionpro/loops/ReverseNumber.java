package com.aurionpro.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		while(number > 0) {
			reverse *= 10;
			reverse = reverse + number%10;
			number /= 10;
		}
		System.out.println("Reverse is " + reverse);

	}

}
