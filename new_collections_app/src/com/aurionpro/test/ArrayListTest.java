package com.aurionpro.test;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println(numbers);
		numbers.add(1, 79);
		System.out.println(numbers);
		numbers.remove(0);
		System.out.println(numbers);
		System.out.println(numbers.size());
	}
}
