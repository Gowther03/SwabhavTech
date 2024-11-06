package com.aurionpro.others;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int number = s.nextInt();
        int start = 1;
        int sum = 0;
        System.out.print("Sum of ");
        while(start < number) {
        	if(number%start == 0) {
        		System.out.print(start + " ");
        		sum+=start;
        	}
        	start++;
        }
        
        if(sum == number) {
        	System.out.println(" = " + number + ", So a Perfect Number");
        }else {
        	System.out.println(" != " + number + " So not a Perfect Number");
        }

	}

}
