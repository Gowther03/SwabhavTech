package com.aurionpro.behavioral.state.model;

public class ReadyState extends State {

	public ReadyState(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String onHome() {
		// TODO Auto-generated method stub
		return phone.home();
	}

	@Override
	public String onOffOn() {
		// TODO Auto-generated method stub
		phone.setState(new OffState(phone));
		return phone.lock();
	}

}
