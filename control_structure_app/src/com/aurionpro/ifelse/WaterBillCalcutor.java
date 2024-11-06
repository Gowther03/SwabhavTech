package com.aurionpro.ifelse;

import java.util.Scanner;

public class WaterBillCalcutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int meterCharge = 75;
		int charge = 0;
		System.out.println("Water Bill Calcultor!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number of Units consumed --> ");
		int unitsConsumed = scanner.nextInt();
		
		if(unitsConsumed <= 100) {
			
			charge = unitsConsumed * 5;
		}
		else {
			if(unitsConsumed <= 250) {
				
				charge = unitsConsumed * 10;
			}
			else {
				charge = unitsConsumed * 20;
			}
		}
		
		int totalWaterBill = charge + meterCharge;
		System.out.println("Your Total Water bill charge is " + totalWaterBill);
		
	}

}
