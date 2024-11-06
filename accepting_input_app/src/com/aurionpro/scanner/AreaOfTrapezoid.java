package com.aurionpro.scanner;

import java.util.Scanner;

public class AreaOfTrapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter base 1: ");
		float base1 = scanner.nextFloat();
		System.out.print("Enter base 1: ");
		float base2 = scanner.nextFloat();
		System.out.print("Enter base 1: ");
		float height = scanner.nextFloat();
		
		float area = ((base1 + base2)/2)*height;
		System.out.println("Area of Trapezoid: " + area);



	}

}
