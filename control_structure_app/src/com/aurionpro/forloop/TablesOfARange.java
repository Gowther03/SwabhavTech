package com.aurionpro.forloop;

import java.util.Scanner;

public class TablesOfARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Range --> ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		for(int i = number1 ; i <=number2 ; i++) {
			System.out.println("Table of " + i);
			for(int j = 1;j<=10;j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
