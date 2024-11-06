package com.aurionpro.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int counter = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		int tempForCounting = number;
		int temp = number;
		
		while(tempForCounting>0) {
			int digit = tempForCounting%10;
			tempForCounting = tempForCounting/10;
			counter++;
		}
		
		while(temp>0) {
			int digit = temp%10;
			sum += Math.pow(digit, counter);
			temp = temp/10;
		}
		
		if(number == sum) {
			System.out.println(number + " = " + sum + " Its an Armstrong Number");
		}else {
			System.out.println(number + " != " + sum + " Its not an Armstrong Number");

		}		
		

	}

}
