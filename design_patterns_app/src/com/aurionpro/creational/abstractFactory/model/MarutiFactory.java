package com.aurionpro.creational.abstractFactory.model;

public class MarutiFactory implements ICarFactory{
	ICar car;
	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		car = new Maruti();
		return car;
	}

}