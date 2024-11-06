package com.aurionpro.scanner;

import java.util.Scanner;

public class MinuteToHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the minutes: ");
		float minutes = scanner.nextFloat();
		int hour = (int) (minutes/60);
		int mins = (int) (minutes%60);
		
		System.out.print("Time is " + hour + " hours and " + mins + " minutes");
	}

}
