package com.aurionpro.structural.decorator.model;


public class CarServiceProvider {
	
	public static ICarService startService() {
		return new CarInspectionService();
	}
	public static CarServiceDecorator oilChange(ICarService newService) {
		CarServiceDecorator decorator = new OilChange(newService);
		return decorator;
	}
	public static CarServiceDecorator wheelAlignment(ICarService newService) {
		CarServiceDecorator decorator = new WheelAlignement(newService);
		return decorator;
	}
}
