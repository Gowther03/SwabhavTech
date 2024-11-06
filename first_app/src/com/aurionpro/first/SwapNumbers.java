package com.aurionpro.first;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swap numbers are a: " + a +  " b: " +  b);
		int temp = a;
		a = b;
		b = temp;;
		System.out.println("Before swap numbers are a: " + a +  " b: " +  b);
	}
}
