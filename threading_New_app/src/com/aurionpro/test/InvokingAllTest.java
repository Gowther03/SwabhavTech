
package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.RandomIntegerGenerator;

public class InvokingAllTest {
	public static void main(String[] args) throws Exception {
		List<RandomIntegerGenerator> randoms = new ArrayList<RandomIntegerGenerator>();
		randoms.add(new RandomIntegerGenerator());
		randoms.add(new RandomIntegerGenerator());
		randoms.add(new RandomIntegerGenerator());
		randoms.add(new RandomIntegerGenerator());
		randoms.add(new RandomIntegerGenerator());

		ExecutorService service = Executors.newScheduledThreadPool(5);
		List<Future<Integer>> futures = service.invokeAll(randoms);
		for(Future<Integer> future: futures) {
			System.out.println(future.get());
		}
		System.out.println("--------------------------");
		
		System.out.println(service.invokeAny(randoms));
		
		service.shutdown();
	}

}
