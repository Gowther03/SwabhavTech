package com.aurionpro.test;

import com.aurionpro.model.FinalDemo;

public class Main extends FinalDemo{
	
	public void display() {
		System.out.println("The final method is overridden.");
	}

	public static void main(String[] args) {
		try {
			Main obj = new Main();
			obj.display();
		} catch (IncompatibleClassChangeError e) {
			// TODO Auto-generated catch block
			System.out.println("Main cannot override display() in FinalDemo"
					+ "overriden method is final");
		}
	}

}
