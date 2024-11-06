package com.aurionpro.test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.aurionpro.model.Student;

public class StudentTestUsingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> students = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<2;i++) {
			System.out.println("Enter Student "+ (i+1) + " values---->\n");
			System.out.print("Name: ");
			String name = scanner.next();
			System.out.print("Roll No: ");
			int rollNo = scanner.nextInt();
			System.out.print("Marks: ");
			int marks = scanner.nextInt();
			System.out.print("Result: ");
			boolean result = scanner.nextBoolean();
			students.add(new Student(rollNo, name, marks, result));
		}
		Iterator<Student> iterate = students.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}

}
