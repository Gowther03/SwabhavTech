
package com.aurionpro.creational.abstractFactory.model;

public class MahindraFactory implements ICarFactory{
	ICar car;
	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		car = new Mahindra();
		return car;
	}

}
