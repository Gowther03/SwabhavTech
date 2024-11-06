package com.aurionpro.dip.solution.model;

public class PrintLogger implements ILogger{

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.out.println("Logged to Printer: " + err);
	}

}
