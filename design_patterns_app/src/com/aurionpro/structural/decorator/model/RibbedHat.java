package com.aurionpro.structural.decorator.model;

public class RibbedHat extends HatDecorators{

	public RibbedHat(IHat hat) {
		super.Hat = hat;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ribbed " + super.Hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 300 + super.Hat.getPrice();
	}

}
