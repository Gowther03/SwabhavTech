package com.aurionpro.structural.adapter.model;

public class Hat implements IHatAdapter{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return getShortName() + getLongName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return (getBasePrice()+ (getBasePrice() * getTax()/100));
	}

	@Override
	public String getShortName() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getLongName() {
		// TODO Auto-generated method stub
		return "Tape";
	}

	@Override
	public double getBasePrice() {
		// TODO Auto-generated method stub
		return 450;
	}

	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 9;
	}

}
