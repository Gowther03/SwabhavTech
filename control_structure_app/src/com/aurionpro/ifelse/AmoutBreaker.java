package com.aurionpro.ifelse;

import java.util.Scanner;

public class AmoutBreaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Amount Breaker(2000, 500, 200, 100)");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter withrawal amount --> ");
		int withdrawalAmount = scanner.nextInt();
		
		if(withdrawalAmount%100 == 0) {
			
			if(withdrawalAmount <= 50000) {
				if(withdrawalAmount == 0) {
				
					System.out.println("Cannot break this amount");
				}
				
				if(withdrawalAmount >= 2000) {
					
					int twoThousands = withdrawalAmount/2000;
					withdrawalAmount = withdrawalAmount - twoThousands*2000;	
					System.out.println("Two thousands = " + twoThousands);
				}
				if(withdrawalAmount >= 500) {
					
					int fiveHundreds = withdrawalAmount/500;
					withdrawalAmount = withdrawalAmount - fiveHundreds*500;
					System.out.println("Five Hundreds = " + fiveHundreds);
				}
				if(withdrawalAmount >= 200) {
					
					int twoHundred = withdrawalAmount/200;
					withdrawalAmount = withdrawalAmount - twoHundred*200;	
					System.out.println("Two Hundreds = " + twoHundred);
				}
				if(withdrawalAmount >= 100) {
					
					int oneHundred = withdrawalAmount/100;
					withdrawalAmount = withdrawalAmount - oneHundred*100;	
					System.out.println("One Hundreds = " + oneHundred);
				}
				
			}else {
				System.out.println("Amount Invalid!");
			}
			
		}else {
			System.out.println("Amount should be in multiples of 100");
		}
		
	}

}
