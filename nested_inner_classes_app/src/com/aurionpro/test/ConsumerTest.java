package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> factorialConsumer =(number)->{
			int fact=1;
			for(int i = 1; i<=number;i++) {
				fact *= i;
			}
			System.out.println("Factorial using BiConsumer: "+fact);
		};
		
		factorialConsumer.accept(5);

		BiConsumer<Integer, Integer> additionConsumenr = (number1, number2)->{
			System.out.println("Addition using BiConsumer: "+(number1+number2));
		};
		
		additionConsumenr.accept(10, 20);
	}

}
