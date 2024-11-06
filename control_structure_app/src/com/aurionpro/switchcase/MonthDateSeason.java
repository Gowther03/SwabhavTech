package com.aurionpro.switchcase;

import java.util.Scanner;

public class MonthDateSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Month number --> ");
		int month = scanner.nextInt();

		
		switch(month) {
		case 10: 
		case 11: 
		case 12: 
		case 1 : 
		case 2: 
			System.out.print("Its Winter");
			break;
		case 3: 
		case 4: 
		case 5: 
			System.out.print("Its Summer");
			break;
		case 6: 
		case 7: 
		case 8: 
		case 9: 
			System.out.print("Its Rainy");
			break;
		
		default: 
			System.out.print("Wrong Input");
			break;
		
		}
	}

}
