package com.aurionpro.creational.abstractFactory.model;

public class TataFactory implements ICarFactory{
	ICar car;
	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		car = new Tata();
		return car;
	}

}
