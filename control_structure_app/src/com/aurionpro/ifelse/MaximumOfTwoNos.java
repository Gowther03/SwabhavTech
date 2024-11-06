package com.aurionpro.ifelse;

import java.util.Scanner;

public class MaximumOfTwoNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		float number1 = scanner.nextFloat();
		System.out.print("Enter number 2: ");
		float number2 = scanner.nextFloat();
		
		if(number1 > number2) {
			System.out.print(number1 + " is Greater");
		}
		else {
			System.out.print(number2 + " is Greater");

		}


	}

}
