package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class Factorialtest {
	public static void main(String[] args) {
		IFactorial factorial = new IFactorial() {

			@Override
			public int calculateFactorial(int number) {
				int fact = 1;
				for(int i = 1; i<=number;i++) {
					fact *= i;
				}
				return fact;
				
			}
			
		};
		
		IFactorial factorial2 = (number)->{
			int fact = 1;
			for(int i = 1; i<=number;i++) {
				fact *= i;
			}
			return fact;
		};
		
		System.out.println(factorial2.calculateFactorial(5));;
		System.out.println(factorial.calculateFactorial(7));;
	}

}
