package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.CarInspectionService;
import com.aurionpro.structural.decorator.model.CarServiceDecorator;
import com.aurionpro.structural.decorator.model.CarServiceProvider;
import com.aurionpro.structural.decorator.model.ICarService;


public class CarServiceTest {
	public static void main(String[] args) {
		
		
		//Without Facade --> CarServiceProvider
		
//		ICarService service1 = new CarInspectionService();
//		CarServiceDecorator oilChange = new OilChange(service1);
//		CarServiceDecorator wheelAlign = new WheelAlignement(oilChange);
//		System.out.println(wheelAlign.getCost());
		
		//With Facade
		
		ICarService service = CarServiceProvider.startService();
		CarServiceDecorator oilchange = CarServiceProvider.oilChange(service);
		System.out.println(oilchange.getCost());
		CarServiceDecorator wheel = CarServiceProvider.wheelAlignment(oilchange);
		System.out.println(wheel.getCost());
		CarServiceDecorator oil = CarServiceProvider.oilChange(wheel);
		System.out.println(oil.getCost());
	}
}
