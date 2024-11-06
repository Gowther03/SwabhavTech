package com.aurionpro.scanner;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Principal: ");
		float principal = scanner.nextFloat();
		System.out.print("Enter the Rate: ");
		float rate = scanner.nextFloat();
		System.out.print("Enter the Time: ");
		float time = scanner.nextFloat();
		
		double roi = Math.pow((1 + (rate/100)), time);
		double compoundInterest = principal * roi;
		
		System.out.println("Compound Interest is " + compoundInterest);


	}

}
