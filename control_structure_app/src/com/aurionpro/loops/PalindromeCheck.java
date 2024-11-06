package com.aurionpro.loops;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int reverse = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		int temp = number;
		while(temp > 0) {
			reverse *= 10;
			reverse = reverse + temp%10;
			temp /= 10;
		}
		
		if(number == reverse) {
			System.out.println(number + " = " + reverse + " Its a Palidrome");
		}else {
			System.out.println(number + " != " + reverse + " Its not a Palidrome");

		}

	}

}
