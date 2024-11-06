package com.aurionpro.commandLine;

public class BMI {

	public static void main(String[] args) {
		float weight = Float.parseFloat(args[0]);
		float height = Float.parseFloat(args[1]);
		
		
		float bmi = weight/(height * height);
		System.out.println("Your BMI is: " + bmi);
	}

}
