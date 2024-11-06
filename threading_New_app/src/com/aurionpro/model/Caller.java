package com.aurionpro.model;

public class Caller implements Runnable{
	String msg;
	Callme target;
	public Thread thread;
	
	public Caller(Callme target, String msg) {
		//Jugaad to make the outputs synchronized
//		try {
//			Thread.sleep(1100);
//		}catch(InterruptedException exception) {
//			System.out.println("Interrupted");
//		}
		this.target = target;
		this.msg = msg;
		thread = new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		synchronized (target) {
			target.call(msg);
		}
	}

}
