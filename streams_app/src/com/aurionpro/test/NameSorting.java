package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NameSorting {
	public static void main(String[] args) {		
		List<String> studentsName = Arrays.asList("Jayesh","Nimesh","Merk","Mahesh","Ramesh");
		
		System.out.print("First 3 students in ascending order: ");
		studentsName.stream()
		.sorted()
		.limit(3)
		.forEach((name) -> System.out.print(name + " "));
	
		System.out.print("\nFirst 3 students containing 'a' in their name in ascending order: ");
		studentsName.stream()
		.sorted()
		.filter((name) -> (name.contains("a")))
		.limit(3)
		.forEach((name) -> System.out.print(name + " "));
		
		System.out.print("\nFirst 3 students in descending order: ");
		studentsName.stream()
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.forEach((name) -> System.out.print(name + " "));
		
		System.out.print("\nFirst 3 characters of all names: ");
		studentsName.stream()
		.forEach((name) -> System.out.print(name.substring(0, 3) + ", "));
		
		System.out.print("\nName having length <= 4: ");
		studentsName.stream()
		.filter((name) -> (name.length() <= 4))
		.forEach((name) -> System.out.println(name));
	}
}
