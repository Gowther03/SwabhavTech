package com.aurionpro.model;

public class BondsSection extends Returns{
	@Override
	public double calculateReturns(double amount, double marketCondition) {
		
		double returns = getReturnsPercentage(amount, marketCondition, 0.5);
		System.out.printf("Return Percentage: %.2f%%\n", returns);
		return amount+(amount*returns/100);
	}

}
