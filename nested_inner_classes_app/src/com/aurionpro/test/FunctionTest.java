package com.aurionpro.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Double> divideBY8 = (number)->(double)number/8;
		
		System.out.println("Number divide by 8 is: " + divideBY8.apply(10));

		
		BiFunction<Integer, Integer, String> checkMax = (number1, number2)->{
			if(number1>number2) {
				return number1+" is maximum";
			}
			return number2+" is maximum";
		};
		System.out.println(checkMax.apply(12, 10));
	}

}
