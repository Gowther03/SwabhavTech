package com.aurionpro.composite.model;

public class DeliveryService {
	private IBox box;
	public  void setUpOrder(IBox...boxes) {
		this.box = new CompositeBox(boxes);
	}
	public double calculateOrderPrice() {
		return box.calculatePrice();
	}
}
