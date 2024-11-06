package com.aurionpro.test;

import com.aurionpro.model.ISayable;

public class SaySomething {

	public static void main(String[] args) {
		ISayable sayable = new ISayable() {

			@Override
			public void say() {
				// TODO Auto-generated method stub
				System.out.println("HIiII Anonymous");
			}
			
		};
		
		ISayable sayable2 = ()->System.out.println("Hii LAmbda");
		
		sayable.say();
		sayable2.say();
	}
	

}
