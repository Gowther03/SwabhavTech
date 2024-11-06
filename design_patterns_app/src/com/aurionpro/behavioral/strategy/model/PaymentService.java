package com.aurionpro.behavioral.strategy.model;

public class PaymentService {
	private int cost;
	private boolean includeDelivery;
	
	private PaymentStrategy strategy;
	public void processOrder() {
		strategy.collectPaymentDetails();
		if(strategy.validatePayment()) {
			strategy.pay(getTotal());
		}
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setIncludeDelivery(boolean delivery) {
		this.includeDelivery = delivery;
	}
	private int getTotal() {
		return includeDelivery? cost+10: cost;
	}
	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
}
