package com.aurionpro.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	private Student student;
	private IStudentService studentService;
	@BeforeEach
	void init() {
		studentService = Mockito.mock(IStudentService.class);
		student = new Student(studentService);
	}
	@Test
	void testCalculatePercentage() {
		Mockito.when(studentService.getMarks()).thenReturn(500);
		Mockito.when(studentService.getNumberOfSubjects()).thenReturn(10);
		assertEquals(50, student.calculatePercentage());
	}

}
