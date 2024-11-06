package com.aurionpro.model;

public class Triangle implements Shape {
	private int base;
	private int height;

	public Triangle(int base, int height){
		this.base = base;
		this.height = height;

	}
	@Override
	public void area() {
		System.out.println("Area Of Triangle is" + (0.5*(base*height)));
		
	}
}
