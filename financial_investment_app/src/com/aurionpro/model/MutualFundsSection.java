package com.aurionpro.model;

public class MutualFundsSection extends Returns{

	@Override
	public double calculateReturns(double amount,double marketCondition) {
		// TODO Auto-generated method stub
		double returns = getReturnsPercentage(amount, marketCondition, 0.75);
		System.out.printf("Return Percentage: %.2f%%\n", returns);
		return amount+(amount*returns/100);
	}
}
