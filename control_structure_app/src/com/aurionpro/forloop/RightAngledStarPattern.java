package com.aurionpro.forloop;

import java.util.Scanner;

public class RightAngledStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length --> ");
		int length = scanner.nextInt();
		
		for(int i = 1;i<=length;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
