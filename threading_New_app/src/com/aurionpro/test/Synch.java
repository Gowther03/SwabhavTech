package com.aurionpro.test;

import com.aurionpro.model.Caller;
import com.aurionpro.model.Callme;

public class Synch {

	public static void main(String[] args) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");
		
		try {
			ob1.thread.join();
			ob2.thread.join();
			ob3.thread.join();
		}catch(InterruptedException exception) {
			System.out.println("Interrupted");
		}
	}

}
