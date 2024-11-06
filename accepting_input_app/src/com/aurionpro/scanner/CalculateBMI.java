package com.aurionpro.scanner;

import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the weight: ");
		float weight = scanner.nextFloat();
		System.out.print("Enter the Height: ");
		float height = scanner.nextFloat();
		
		float bmi = weight/(height * height);
		System.out.println("Your BMI is " + bmi);
	}

}
