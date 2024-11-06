package com.aurionpro.others;

import java.util.Scanner;

public class PrimeNosRightAngledPyramidPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		int length = scanner.nextInt();
		int number = 2;//3//4//5
		for(int i = 1; i<=length; i++) {
			int j = 0;
			while(j < i) {//2
				boolean isPrime = true;
		        int start = 2;
		        while(start*start <= number) {
		        	if(number%start == 0) {
		        		isPrime = false;
		        		break;
		        	}
		        	start++;
		        }
		        if(isPrime) {
		        	System.out.print(" " + number + " ");
		        	j++;//2
		        }
		        number++;
			}
			System.out.println();
		}
		
	}

}
