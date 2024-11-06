package com.aurionpro.commandLine;

public class MinutesToHours {

	public static void main(String[] args) {
		
		int minutes = Integer.parseInt(args[0]);
		
		int hours = minutes/60;
		int mins = minutes%60;
		
		System.out.println("Time is " +  hours + " hours and " + mins + " minutes");
	}

}
