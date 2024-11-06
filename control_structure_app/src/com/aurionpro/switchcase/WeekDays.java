package com.aurionpro.switchcase;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the day number --> ");
		int option = scanner.nextInt();
		
		switch(option) {
		case 1: 
			System.out.print("Its Monday");
			break;
		case 2: 
			System.out.print("Its Tuesday");
			break;
		case 3: 
			System.out.print("Its Wednesday");
			break;
		case 4: 
			System.out.print("Its Thursday");
			break;
		case 5: 
			System.out.print("Its Friday");
			break;
		case 6: 
			System.out.print("Its Saturday");
			break;
		case 7: 
			System.out.print("Its Sunday");
			break;
		default: 
			System.out.print("Wrong Input");
			break;
		
		}
	}

}
