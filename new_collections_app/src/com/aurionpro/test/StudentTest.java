package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.comparators.StudentByMarks;
import com.aurionpro.comparators.StudentByName;
import com.aurionpro.comparators.StudentByRollNo;
import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
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
//		for(Student student: students) {
//			System.out.println();
//			System.out.println(student);
//			student.getDetails();
//			
//		}
		System.out.println();
		Collections.sort(students, new StudentByRollNo());
		for(Student student: students) {
			System.out.println(student);	
		}
		System.out.println();
		Collections.sort(students, new StudentByName());
		for(Student student: students) {
			System.out.println(student);	
		}
		System.out.println();
		Collections.sort(students, new StudentByMarks());
		for(Student student: students) {
			System.out.println(student);	
		}
	}
}
