package com.aurionpro.model;

import java.util.Random;

public abstract class Returns implements IPlatform{
	public double getReturnsPercentage(double amount, double marketCondition, double multiplyFactor) {
		Random random = new Random();
		double currentValue = random.nextDouble(amount+500)+(amount-500);
		if(marketCondition <= 500) {
			currentValue += currentValue*multiplyFactor;
		}else if(marketCondition < 0){
			currentValue -= currentValue*multiplyFactor;
		}
		return ((currentValue - amount) / amount) * 100;		
	}
}
