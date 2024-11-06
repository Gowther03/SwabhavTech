package com.aurionpro.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTestUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<3;i++) {
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
		for(Student student: students) {
			System.out.println();
			System.out.println(student);
			student.getDetails();
			
		}
	}

}
