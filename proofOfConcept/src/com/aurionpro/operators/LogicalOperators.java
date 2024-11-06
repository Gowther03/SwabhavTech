package com.aurionpro.operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Park Ride");
		
		System.out.println("Enter the Height(cm) --> ");
		float height = scanner.nextFloat();
		
		System.out.println("Enter the Weight(kg) --> ");
		float weight = scanner.nextFloat();
		
		if(((height >= 150) && (weight >= 50)) || ((height >= 120) && (weight >= 50))) {
			
			System.out.println("You're eligible for the ride!");
		}else {
			System.out.println("You're not eligible for the ride!");
		}
	}

}
