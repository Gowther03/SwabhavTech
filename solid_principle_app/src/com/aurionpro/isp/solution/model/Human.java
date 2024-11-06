package com.aurionpro.isp.solution.model;

public class Human implements IHuman{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating");

	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Drinking");
	}

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Start Work");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("stop work");
	}

}
