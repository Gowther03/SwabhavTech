package com.aurionpro.dip.solution.model;

public class FileLogger implements ILogger{

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.out.println("Logged to File: " + err);
	}

}
