package com.aurionpro.behavioral.state.test;

import com.aurionpro.behavioral.state.model.Phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		System.out.println("Current Phone State: Off");
		
		System.out.println(phone.getState().onHome());
		System.out.println(phone.getState().onHome());
		System.out.println(phone.getState().onHome());
		System.out.println(phone.getState().onOffOn());
		System.out.println(phone.getState().onHome());
		System.out.println(phone.getState().onOffOn());
		System.out.println(phone.getState().onHome());
		System.out.println(phone.getState().onHome());
		System.out.println(phone.getState().onHome());
		System.out.println(phone.getState().onOffOn());
	}

}
