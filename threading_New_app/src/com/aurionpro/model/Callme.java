package com.aurionpro.model;

public class Callme {
	synchronized void call(String msg) {
	
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException exception) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
