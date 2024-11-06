package com.aurionpro.dip.solution.model;

import java.util.Random;
import java.util.function.Supplier;

public class TaxCalculator {
	private int amount;
	private int rate;
	private ILogger logger;
	
	public TaxCalculator(int amount, int rate) {
		this.amount = amount;
		this.rate = rate;
		switch(randomNumberSupplier.get()) {
		case 1:
			this.logger = new DBLogger();
			break;
		case 2:
			this.logger = new PrintLogger();
			break;
		case 3:
			this.logger = new FileLogger();
			break;
		default:
			break;
		}
	}
	
	Supplier<Integer> randomNumberSupplier = ()->{
		return (new Random()).nextInt(3)+1;
	};
	
	public void calculateTax() {
		int tax = 0;
		try {
			tax = amount/rate;
			System.out.println("Tax Amount: " + tax);
		}catch(Exception exception) {
			logger.log("Divide by zero error");
		}
	}
}
