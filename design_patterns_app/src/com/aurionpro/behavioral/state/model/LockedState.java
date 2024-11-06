package com.aurionpro.behavioral.state.model;

public class LockedState extends State {

	public LockedState(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String onHome() {
		// TODO Auto-generated method stub
		phone.setState(new ReadyState(phone));
		return phone.unlock();
	}

	@Override
	public String onOffOn() {
		// TODO Auto-generated method stub
		phone.setState(new OffState(phone));
		return phone.lock();
	}

}
