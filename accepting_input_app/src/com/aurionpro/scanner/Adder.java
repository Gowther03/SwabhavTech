package com.aurionpro.scanner;
import java.util.*;

public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter number 1: ");
		int number2 = scanner.nextInt();
		
		int sum = number1 + number2;
		System.out.println("Sum is " +  sum);
	}

}
