package com.aurionpro.model;

public class Square implements Shape {
	private int base;

	public Square(int base){
		this.base = base;

	}
	@Override
	public void area() {
		System.out.println("Area Of Square is" + (base*base));
		
	}
}
