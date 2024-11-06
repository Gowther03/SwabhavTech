package com.aurionpro.arrays;

import java.util.Scanner;

public class ShiftingSTringCharacters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String --> ");
		String string = scanner.next();
		System.out.print("Enter the Shifts --> ");
		int shift = scanner.nextInt();
		System.out.print("Changed string --> ");
	
		for(int i = 0; i<string.length(); i++) {
			if((int)string.charAt(i) > 26) {
				System.out.print((char)((int)string.charAt(i)%26 + shift));
			}else {
				System.out.print((char) (string.charAt(i) + shift));
			}
			
		}
	}
}
