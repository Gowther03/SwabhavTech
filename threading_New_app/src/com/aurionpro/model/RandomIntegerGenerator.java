package com.aurionpro.model;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomIntegerGenerator implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		return new Random().nextInt(100) +1;
	}

}
