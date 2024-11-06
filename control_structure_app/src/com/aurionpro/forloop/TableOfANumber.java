package com.aurionpro.forloop;

import java.util.Scanner;

public class TableOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number --> ");
		int number = scanner.nextInt();
		
		for(int i = 1;i<=10;i++) {
			System.out.println(number + " X " + i + " = " + number*i);
		}

	}

}
