package com.aurionpro.comparators;

import java.util.Comparator;

import com.aurionpro.model.Student;

public class StudentByName implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return student1.getName().compareTo(student2.getName());
		
//		return ((int)student1.getName().charAt(0) -  (int)student2.getName().charAt(0));
	}

}
