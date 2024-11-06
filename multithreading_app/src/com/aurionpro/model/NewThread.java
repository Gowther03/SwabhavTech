package com.aurionpro.model;

public class NewThread extends Thread{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	
	public NewThread(String name) throws InterruptedException{
		super(name);
		System.out.println(ANSI_GREEN+"Child thread class: " + this + ANSI_RESET);
		new MyThread(name).getThread().join();
		start();
	}
	
	public void run() {
		try {
			for(int i = 5; i>0; i-- ) {
				System.out.println(ANSI_GREEN+"Child Thread class: " + i+ ANSI_RESET);
				Thread.sleep(500);
			}
		}catch(InterruptedException exception) {
			System.out.println(ANSI_GREEN+"Child class Interrupted" + ANSI_RESET);
		}
		System.out.println(ANSI_GREEN+"Exiting child class thread" + ANSI_RESET);

	}
}
