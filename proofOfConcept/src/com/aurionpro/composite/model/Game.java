package com.aurionpro.composite.model;

public class Game extends Product{

	public Game(String name, double price) {
		super(name, price);
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}
}
