package com.aurionpro.model;

public class StudentInfo extends Student{
	String name = "xyz";
	public void print() {
//		System.out.println(name);
//		System.out.println(super.name);
		System.out.println("print details");
		
	}
	public void getDetails() {
		super.eligible();
		print();
	}
	public void eligible() {
		System.out.println("Elegible for second year...");
	}
}
