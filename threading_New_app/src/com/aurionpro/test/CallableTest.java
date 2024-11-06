package com.aurionpro.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.RandomIntegerGenerator;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newScheduledThreadPool(5);
		
		for(int i = 0; i<10; i++) {
			Future<Integer> future = service.submit(new RandomIntegerGenerator());
			System.out.println(future.get());
		}
		service.shutdown();

	}

}
