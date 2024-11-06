package com.aurionpro.model;

public class StocksSection extends Returns {

	@Override
	public double calculateReturns(double amount,double marketCondition) {
		// TODO Auto-generated method stub
		double returns = getReturnsPercentage(amount, marketCondition, 2);
		System.out.printf("Return Percentage: %.2f%%\n", returns);
		return (float)(amount+(amount*returns/100));
	}

}
