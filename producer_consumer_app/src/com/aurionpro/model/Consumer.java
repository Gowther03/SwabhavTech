package com.aurionpro.model;

import com.aurionpro.test.Q;

public class Consumer implements Runnable{
	public Q q;
	public Thread thread;
	public Consumer(Q q){
		this.q = q;
		thread = new Thread(this, "Consumer");
		thread.start();
	}
	@Override
	public void run() {
		while(true) {
			q.get();
		}	
	}

}
