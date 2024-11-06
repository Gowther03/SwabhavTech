package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Task;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		for(int i = 0; i<10; i++) {
			service.execute(new Task());		
		}
		
		ExecutorService service2 = Executors.newCachedThreadPool();
		for(int i = 0; i<10; i++) {
			service2.execute(new Task());		
		}
		
		ExecutorService service3 = Executors.newSingleThreadExecutor();
		for(int i = 0; i<10; i++) {
			service3.execute(new Task());		
		}
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println(processors);
		
		ExecutorService service4 = Executors.newScheduledThreadPool(processors);
		for(int i = 0; i<21; i++) {
			service4.execute(new Task());		
		}
		
		
	}

}
