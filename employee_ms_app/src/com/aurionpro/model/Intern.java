package com.aurionpro.model;

public class Intern extends EmployeeMS{
	private double stipend;
	private int duration;
	private static int count;
	
	public Intern(int employeeCode,String employeeName, double stipend, int duration) {
		super(employeeCode, employeeName);
		this.stipend = stipend;
		this.duration = duration;
		count++;
	}

	public void getCount() {
		System.out.println("\nTotal Interns created: " + count);
	}
	@Override
	public void displayDetails() {
		System.out.println("Employee Type: Intern");
		this.getEmployeeCode();
		this.getName();
		System.out.println("Work Email: " + this.generateEmail());
		System.out.println("Internship Duration: " + duration);
		System.out.println("Total Salary: " + (stipend*duration));
	}

	@Override
	public double calculateBonus() {
		return 0;
	}
}
