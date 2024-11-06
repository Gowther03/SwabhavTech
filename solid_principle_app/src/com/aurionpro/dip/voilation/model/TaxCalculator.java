package com.aurionpro.dip.voilation.model;

public class TaxCalculator {
//	DBLogger dbLogger;
	public TaxCalculator() {
		
	}
	public void calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount/rate;
			System.out.println("Tax Amount: " + tax);
		}catch(Exception exception) {
			new DBLogger().log("Divide by zero Error");
		}
	}
}
