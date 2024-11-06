package com.aurionpro.behavioral.state.model;

public class OffState extends State {

	public OffState(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String onHome() {
		// TODO Auto-generated method stub
		phone.setState(new LockedState(phone));
		return phone.turnOn();
	}

	@Override
	public String onOffOn() {
		// TODO Auto-generated method stub
		phone.setState(new LockedState(phone));
		return phone.turnOn();
	}

}
