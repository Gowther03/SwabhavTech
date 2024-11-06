package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentTestUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] marks = new int[3];
		String[] name = new String[3];
		Map<String, Integer> students = new HashMap<>();
		for(int i = 0; i<2;i++) {
			System.out.println("Enter Student "+ (i+1) + " values");
			System.out.print("Name: ");
			name[i] = scanner.next();
			System.out.print("Marks: ");
			marks[i] = scanner.nextInt();
			students.put(name[i], marks[i]);
		}
		
		System.out.print("1. Get Elements, 2.Check Marks, 2.Remove student --->");
		int option = scanner.nextInt();
		switch(option) {
		case 1:
			getElements(students);
			break;
		case 2:
			getMarks(students);
			break;
		case 3:
			removeStudents(students);
			break;
		default:
			System.out.println("Invalid option");
		}
	}
	
	public static void getElements(Map<String, Integer> students) {
		Set<Map.Entry<String, Integer>> studentsSet = students.entrySet();
		for(Map.Entry<String, Integer> entry : studentsSet) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
			System.out.println();
		}
	}
	public static void getMarks(Map<String, Integer> students) {
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		while(index<students.size()) {
			System.out.print("Enter Student name to get their marks: ");
			String findName = scanner.next();
			if(students.containsKey(findName)) {
				Integer number = students.get(findName);
				System.out.println("Marks: " + number);
			}else {
				System.out.println("Student Not Present");
			}
			index++;
		}
	}
	public static void removeStudents(Map<String, Integer> students) {
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		while(index<students.size()) {
			System.out.print("Enter Student name to remove: ");
			String findName = scanner.next();
			if(students.containsKey(findName)) {
				students.remove(findName);
				System.out.println("Student Removed!");
			}else {
				System.out.println("Student Not Present");
			}
			index++;
		}
	}

}
