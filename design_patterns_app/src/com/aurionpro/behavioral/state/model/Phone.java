package com.aurionpro.behavioral.state.model;

public class Phone {
	private State state;
	
	public Phone() {
		state = new OffState(this);
	}
	public State getState() {
		return this.state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	public String lock() {
		return "Locking phone and turning off the Screen";
	}
	public String home() {
		return "Going to Home Screen";
	}
	public String unlock() {
		return "Unlocking the phone to Home Screen";
	}
	public String turnOn() {
		return "Turning Screen on, Device still locked";
	}
}
