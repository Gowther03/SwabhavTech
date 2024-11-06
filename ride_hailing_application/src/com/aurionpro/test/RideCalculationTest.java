package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.EconomySection;
import com.aurionpro.model.IRide;
import com.aurionpro.model.LuxurySection;
import com.aurionpro.model.PremiumSection;
public class RideCalculationTest {

	public static void main(String[] args) 
	{
		System.out.println("Calcuate Ride Charges----->");
		System.out.println("Choose Ride---->");
		while(true) {
			chooseRide();
		}
	}
	
	public static void chooseRide() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n1. Economy, 2. Premium, 3. Luxury, 4. Exit ---> ");
		int type = scanner.nextInt();
		switch(type) {
		case 1:
			IRide ride1 = new EconomySection();
			rideDetails(ride1);
			break;
		case 2:
			IRide ride2 = new PremiumSection();
			rideDetails(ride2);
			break;
		case 3:
			IRide ride3 = new LuxurySection();
			rideDetails(ride3);
			break;
		case 4:
			System.out.println("App Closed!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Input!");
			break;
		}
	}

	public static void rideDetails(IRide ride) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter Total Passengers: ");
		int passengers = scanner.nextInt();
		double surgePrice = 3000*passengers;
		System.out.print("Enter Distance to travel(km): ");
		int distance = scanner.nextInt();
		System.out.println();
		ride.calculateFare(surgePrice, distance);
	}
}
