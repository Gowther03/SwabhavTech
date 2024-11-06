package com.aurionpro.operators;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Water Ride");
		
		System.out.println("Enter the Gender(Male(1) & Female(0)) --> ");
		int gender = scanner.nextInt();
		
		System.out.println("Enter the Height(cm) --> ");
		float height = scanner.nextFloat();
		
		System.out.println("Enter the Weight(kg) --> ");
		float weight = scanner.nextFloat();
		
		if(gender == 1) {
			if(((height >= 150) && (weight <= 100))) {
				
				System.out.println("You're eligible for the ride!");
				
			}else {
				
				System.out.println("You're not eligible for the ride!");
				
			}
			
		}else {
			if(((height >= 120) && (weight <= 80))) {
				
				System.out.println("You're eligible for the ride!");
				
			}else {
				
				System.out.println("You're not eligible for the ride!");
				
			}
		}
	}

}
