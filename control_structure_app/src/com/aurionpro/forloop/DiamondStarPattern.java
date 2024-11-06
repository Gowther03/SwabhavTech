package com.aurionpro.forloop;

import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length --> ");
		int length = scanner.nextInt();
		
		for(int i = 1;i<=length * 2;i++) {
			int totalColumns = i > length ? 2 * length - i : i;
			int spaces = length - totalColumns;
			for(int j = 1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=totalColumns;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
