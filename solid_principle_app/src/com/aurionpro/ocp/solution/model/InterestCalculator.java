package com.aurionpro.ocp.solution.model;

public class InterestCalculator {
	public double calculateInterest(FixedDeposit fixedDeposit) {
		return (fixedDeposit.getPrincipleAmount() * fixedDeposit.getFestivalOffer().getInterestRate()*fixedDeposit.getDuration())/100;
		
	}
}
