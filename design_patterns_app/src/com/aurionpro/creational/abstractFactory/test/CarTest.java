package com.aurionpro.creational.abstractFactory.test;

import com.aurionpro.creational.abstractFactory.model.ICar;
import com.aurionpro.creational.abstractFactory.model.ICarFactory;
import com.aurionpro.creational.abstractFactory.model.MarutiFactory;
import com.aurionpro.creational.abstractFactory.model.TataFactory;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICarFactory factory = new MarutiFactory();
		ICar car1 = factory.makeCar();
		car1.start();
		car1.stop();
		
		ICarFactory factory2 = new TataFactory();
		ICar car2 = factory2.makeCar();
		car2.start();
		car2.stop();
	}

}
