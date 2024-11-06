package com.aurionpro.isp.voilation.model;

public class Human implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Started Working");
		
	}

	@Override
	public void stopWor() {
		// TODO Auto-generated method stub
		System.out.println("Stoped Working");

	}

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

}
