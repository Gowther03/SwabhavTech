package com.aurionpro.first;

public class SwapWithoutNewVariable {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		System.out.println("Before swap numbers are a: " + a +  " b: " +  b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Before swap numbers are a: " + a +  " b: " +  b);

	}

}
