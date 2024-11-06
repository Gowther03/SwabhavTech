package com.aurionpro.structural.decorator.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(ICarService service) {
		this.service = service;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 500 + service.getCost();
	}

}
