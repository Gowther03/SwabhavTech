package com.aurionpro.model;

import com.aurionpro.test.Q;

public class Producer implements Runnable{
	 public Q q;
	 public Thread thread;
	 public Producer(Q q){
		 this.q = q;
		 thread = new Thread(this, "Producer");
		 thread.start();
	 }

	@Override
	public void run() {
		int i = 0;
		while(i <=10) {
			q.put(i++);
		}
	}
}
