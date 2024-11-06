package com.aurionpro.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> evenCheck =(number)->{
			if(number%2 == 0) {
				return true;
			}
			return false;
		};
		
		System.out.println(evenCheck.test(7));
		
		BiPredicate<Integer, Integer> checkEqual =(number1, number2)->{
			if(number1 == number2) {
				return true;
			}
			return false;
		};
		System.out.println(checkEqual.test(3, 2));
		
		BiPredicate<Integer, Integer> checkMax = (number1, number2)->{
			if(number1>number2) {
				return true;
			}
			return false;
		};
		
		System.out.println(checkMax.test(10, 6));
	}

}
