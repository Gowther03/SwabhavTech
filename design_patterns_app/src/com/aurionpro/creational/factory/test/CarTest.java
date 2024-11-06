package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.CarType;
import com.aurionpro.creational.factory.model.ICar;


public class CarTest {
	public static void main(String[] args) {
		ICar car1 = CarFactory.makeCar(CarType.maruti);
		car1.start();
		car1.stop();
		
		ICar car2 = CarFactory.makeCar(CarType.tata);
		car2.start();
		car2.stop();
		ICar car3 = CarFactory.makeCar(CarType.mahindra);
		car3.start();
		car3.stop();
	}
}
