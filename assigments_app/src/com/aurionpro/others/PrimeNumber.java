package com.aurionpro.others;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int number = s.nextInt();
        boolean isPrime = true;
        int start = 2;
        while(start*start <= number) {
        	if(number%start == 0) {
        		isPrime = false;
        		break;
        	}
        	start++;
        }
        
        if(isPrime && number  != 1) {
        	System.out.println(number + " is a Prime Number");
        }else {
        	System.out.println(number + " is not a Prime Number");
        }
	}

}
