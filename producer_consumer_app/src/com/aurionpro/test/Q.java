package com.aurionpro.test;

public class Q {

	public int n;
	public boolean valueSet = false;
	public synchronized int get() {
		while(!valueSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterrupedException caught");
			}
		}
		System.out.println("Got: " + n);
		valueSet = true;
		notify();
		return n;
	}
	public synchronized void put(int n) {
		while(!valueSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterrupedException caught");
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}
