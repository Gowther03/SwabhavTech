package com.aurionpro.typecasting;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		byte b = (byte)(a+2);
		
		float c = 10.5f;
		System.out.println(b + c);
		Float d = c;
		
		System.out.println(d);
		char example = 'C';
		System.out.println("C in ASCII is " + (int)example);

	}

}
