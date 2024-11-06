package com.aurionpro.srp.solution.model;

public class TaxCalculator {
	public double calculateTaxAmount(Invoice invoice){
		return (invoice.getAmount() * invoice.getTaxPercent()/100);
	}
}
