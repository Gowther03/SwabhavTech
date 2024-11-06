package com.aurionpro.model;

public class EconomySection implements IRide{
	private double foodCharge = 1030.60;
	private double premiumCharge = 2060.90;

	@Override
	public void calculateFare(double surgePrice, double distance) {
		// TODO Auto-generated method stub
		double fare = (surgePrice+distance+foodCharge + premiumCharge);
		System.out.println("Primium Additional Fee: "+premiumCharge + "     Food Charge: " + foodCharge);
		System.out.println("----> Total Fare: " + fare+ " <----");
	}

}
