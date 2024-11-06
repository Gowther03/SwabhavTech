package com.aurionpro.ocp.solution.model;

public class FixedDeposit {
	private int accountNo;
	private String name;
	private double principleAmount;
	private IFestivalOffer festivalOffer;
	private double duration;
	
	public FixedDeposit(int accountNo, String name, double principleAmount, IFestivalOffer festivalOffer, double duration) {
		this.accountNo = accountNo;
		this.name = name;
		this.principleAmount = principleAmount;
		this.festivalOffer = festivalOffer;
		this.duration = duration;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getPrincipleAmount() {
		return principleAmount;
	}

	public IFestivalOffer getFestivalOffer() {
		return festivalOffer;
	}

	public double getDuration() {
		return duration;
	}
}
