package com.aurionpro.model;

public class Student {
	private String name;
	private int rollNo;
	private double marks;
	private String result;
	
	public Student(int rollNo, String name, double marks, boolean result) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		if(result == false) {
			this.result = "Fail";
		}else {
			this.result = "Pass";

		}
		
	}
	public void getDetails() {
		System.out.println("Student Roll No: " + rollNo);
		System.out.println("Student Name: " + name);
		System.out.println("Student Marks: " + marks);
		System.out.println("Student Result: " + result);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", result=" + result + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
