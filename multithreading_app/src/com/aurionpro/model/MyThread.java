package com.aurionpro.model;

public class MyThread implements Runnable{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	private Thread thread;
	public MyThread(String name) {
		thread = new Thread( this, name);
		System.out.println("Child thread interface: " + thread);
		thread.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i = 5; i>0; i-- ) {
				System.out.println(thread.getName() + " interface: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException exception) {
			System.out.println("Child " +thread.getName()+ " interface Interrupted");
		}
		System.out.println("Exiting child " +thread.getName()+ " interface");
		
	}
	public Thread getThread() {
		return thread;
	}

}
