package com.aurionpro.creational.factory.model;

public class CarFactory {
	private static ICar car;
	public static ICar makeCar(CarType type) {
		if(type == CarType.maruti ) {
			car = new Maruti();
		}
		if(type == CarType.tata) {
			car = new Tata();
		}
		if(type== CarType.mahindra) {
			car = new Mahindra();
		}
		return car;
	}
}
