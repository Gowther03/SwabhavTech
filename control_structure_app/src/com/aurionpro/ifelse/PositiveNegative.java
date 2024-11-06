package com.aurionpro.ifelse;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number ");
		float number = scanner.nextFloat();
		
		if(number >= 0) {
			System.out.print("Number is Positive");
		}
		else {
			System.out.print("Number is Negative ");
		}
	}

}
