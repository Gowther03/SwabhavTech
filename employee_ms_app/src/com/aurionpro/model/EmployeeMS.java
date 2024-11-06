package com.aurionpro.model;

public abstract class EmployeeMS {
	private int employeeCode;
	private String employeeName;
	private static int employeeCount;
	
	EmployeeMS(int employeeCode,String employeeName){
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;	
		employeeCount++;
	}
	public void getEmployeeCount() {
		System.out.println("Total Employee created: " + employeeCount);
	}
	public String generateEmail() {
		String email =employeeName;
		return (email.toLowerCase().replace(" ", ".").concat("@aurionpro.com"));
	}
	
	public void getName() {
		System.out.println("Employee Name: " + employeeName);
	}
	public void getEmployeeCode() {
		System.out.println("\nEmployee Code: " + employeeCode);
	}
	public abstract void displayDetails();
	public abstract double calculateBonus();
	
}
