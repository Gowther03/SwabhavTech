package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 12, 13, 14);
		
		Stream<Integer> numberStream = numbers.stream();
		
		numberStream.forEach((number) -> System.out.println(number*number));
		
		numbers.stream().filter((number) -> (number%2 != 0)).forEach((number) -> System.out.println(number));
		
		List<Integer> oddNumbers = numbers.stream().filter((number) -> (number%2 == 0)).collect(Collectors.toList());
		
		System.out.println(oddNumbers);
		
		oddNumbers.stream().forEach((number) -> System.out.println(number));
		
		numbers
		.stream()
		.map((number) -> number*number)
		.filter((number) -> (number>100))
		.forEach((number) -> System
				.out
				.println(number));
		
		System.out.println("Sum of all Elements: " + numbers.stream().reduce(0, (sum, number) -> sum+number));
		
		System.out.println("Maximun of all Elements: " + numbers.stream().reduce(0, (max, number) -> max>number? max:number));
		
		System.out.println("Minimum of all Elements: " + numbers.stream().reduce(Integer.MAX_VALUE, (min, number) -> min<number? min : number));
		
		
	}
}
