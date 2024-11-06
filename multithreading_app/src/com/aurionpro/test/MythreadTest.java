package com.aurionpro.test;

import com.aurionpro.model.NewThread;

public class MythreadTest {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	public static void main(String[] args) throws InterruptedException {
		new NewThread("thread1");
		new NewThread("thread2");
		new NewThread("thread3");

		try {
			for(int i = 5; i > 0; i--) {
				 System.out.println(ANSI_RED+"Main Thread: " + i + ANSI_RESET);
				 Thread.sleep(500);
			}
		}catch(InterruptedException exception) {
			System.out.println(ANSI_RED+"Main threasd interruptued" + ANSI_RESET);
		}
		
//		try {
//			thread1.getThread().join();
//			thread2.getThread().join();
//			thread3.getThread().join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(ANSI_RED+"Main thread exiting" + ANSI_RESET);
	}

}
