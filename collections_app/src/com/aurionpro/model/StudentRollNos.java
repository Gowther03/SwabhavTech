package com.aurionpro.model;

import java.util.HashMap;
import java.util.Scanner;

public class StudentRollNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] marks = new int[3];
		String[] name = new String[3];
		HashMap<String, Integer> students = new HashMap<>();
		for(int i = 0; i<3;i++) {
			System.out.println("Enter Student "+ (i+1) + " values");
			System.out.print("Name: ");
			name[i] = scanner.next();
			System.out.println("Name: ");
			marks[i] = scanner.nextInt();
			students.put(name[i], marks[i]);
		}
		System.out.println("1.Check Marks, 2.Remove student");
		int option = scanner.nextInt();
		switch(option) {
		case 1 -> getMarks(students);
		case 2 -> removeStudents(students);
		default -> System.out.println("Invalid option");
		}
	}

	public static void getMarks(HashMap<String, Integer> students) {
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
	public static void removeStudents(HashMap<String, Integer> students) {
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
