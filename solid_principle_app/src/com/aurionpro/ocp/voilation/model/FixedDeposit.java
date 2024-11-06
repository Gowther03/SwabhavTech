package com.aurionpro.ocp.voilation.model;

public class FixedDeposit {
	private int accountNo;
	private String name;
	private double principleAmount;
	private FestivalOffer offer;
	private double duration;
	
	public FixedDeposit(int accountNo, String name, double principleAmount, double duration) {
		this.accountNo = accountNo;
		this.name = name;
		this.principleAmount = principleAmount;

		this.duration = duration;
	}
	
	public double calculateInterest(String index) {
		return ((principleAmount*getInterestRate(index)*duration)/100);
	}
	public double getInterestRate(String index) {
		switch(index) {
		case "1": 
			offer = FestivalOffer.DIWALI;
			return 8;
		case "2": 
			offer = FestivalOffer.HOLI;
			return 8.5;
		case "3": 
			offer = FestivalOffer.CHRISTMAS;
			return 7.5;
		case "4": 
			offer = FestivalOffer.NEWYEAR;
			return 7;
		default:
			return 0;
		}
	}
}
