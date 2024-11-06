package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorators{

	public GoldenHat(IHat hat) {
		super.Hat = hat;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Golden " + super.Hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500+super.Hat.getPrice();
	}

}
