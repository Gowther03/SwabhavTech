package com.aurionpro.composite.model;

public class Book extends Product{

	
	public Book(String name, double price) {
		super(name, price);
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}

}
