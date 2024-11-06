package com.aurionpro.games;

import java.util.Scanner;

public class RideCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Rollercoster ride");
		System.out.println("Provide the appropriate values/information to enjoy the ride!");
		int totalCost = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Height(cm)? --> ");
		float height = scanner.nextFloat();
		
		if(height > 120) {
			
			System.out.println("You can ride");
			System.out.print("Your Age(years)? --> ");
			int age = scanner.nextInt();
			
			if(age>= 12 && age < 18) {
				
				System.out.println("Your Ride charge is $7");
				totalCost += 7;
			}else if(age>= 18 && age < 45) {
				
				System.out.println("Your Ride charge is $12");
				totalCost += 12;
			}else if(age>= 45) {
				
				System.out.println("Your Ride charge is $0");
				totalCost += 0;
			}
			else {
				
				System.out.println("Your Ride charge is $5");	
				totalCost += 5;
			}
			
			System.out.print("Want Photos for $3 (yes or no)? --> ");
			String photo = scanner.next();
			
			if(photo.equals("yes")) {
				totalCost += 3;
			}
			
		}else {
			
			System.out.println("Below the threshold! Can't Ride!");
		}
		
		System.out.println("Your Total Cost for the ride is " + totalCost);
		

	}

}
