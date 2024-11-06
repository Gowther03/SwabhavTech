package com.aurionpro.comparators;

import java.util.Comparator;

import com.aurionpro.model.Student;

public class StudentByMarks implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return (int)(student1.getMarks() - student2.getMarks());
	}

}
