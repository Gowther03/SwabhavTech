package com.aurionpro.scanner;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x1: ");
		float x1 = scanner.nextFloat();
		System.out.print("Enter x2: ");
		float x2 = scanner.nextFloat();
		System.out.print("Enter y1: ");
		float y1 = scanner.nextFloat();
		System.out.print("Enter y2: ");
		float y2 = scanner.nextFloat();
		
		double distance = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
		System.out.println("Distance between x and y is " + distance);
	
	}

}
