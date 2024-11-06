package com.aurionpro.test;

import java.util.Random;
import java.util.function.Supplier;

public class Suppliertest {
	public static void main(String[] args) {
		Supplier<Integer> randomNumberSupplier = ()->{
			return (new Random()).nextInt();
		};
		
		System.out.println(randomNumberSupplier.get());
		
		Supplier<String> greeting =()->"Hello";
		
		System.out.println(greeting.get());
	}
}
