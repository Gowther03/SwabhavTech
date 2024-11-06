package com.aurionpro.model;

public class LuxurySection implements IRide
{
	private double chefCharge = 2030.60;
	private double serviceCharge = 2000;
	private int digitalCharge = 900;

	@Override
	public void calculateFare(double surgePrice, double distance) {
		// TODO Auto-generated method stub
		double fare = (surgePrice+distance+chefCharge + serviceCharge+ digitalCharge);
		System.out.println("Service Charge: "+serviceCharge + "     Food Charge: " + chefCharge + "     Digital Charge: " + digitalCharge);
		System.out.println("----> Total Fare: " + fare+ " <----");
	}

}
