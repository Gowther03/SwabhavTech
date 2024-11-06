package com.aurionpro.test;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("MyThread");
		System.out.println(Thread.currentThread());
		for(int i = 5; i>=0; i--) {
			System.out.println(i);
			Thread.sleep(100);
		}
	}

}
