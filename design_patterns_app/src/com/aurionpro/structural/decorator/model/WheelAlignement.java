package com.aurionpro.structural.decorator.model;

public class WheelAlignement extends CarServiceDecorator{

	public WheelAlignement(ICarService service) {
		this.service = service;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1000 + service.getCost();
	}
}
