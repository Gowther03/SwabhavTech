package com.aurionpro.model;

public class PermanentEmployee extends EmployeeMS{
	private double salary;
	private double raise = 30;
	private static int count;
	
	public PermanentEmployee(int employeeCode,String employeeName, double salary) {
		super(employeeCode, employeeName);
		this.salary = salary;
		count++;
	}
	
	public void getCount() {
		System.out.println("\nTotal Permanent Employee created: " + count);
	}
	@Override
	public void displayDetails() {
		System.out.println("Employee Type: Permanent");
		this.getEmployeeCode();
		this.getName();
		System.out.println("Work Email: " + this.generateEmail());
		System.out.println("Salary per annum: " + (salary*12));
	}
	
	public void raiseDetails() {
		System.out.println("Raise Offered: " + raise + "%");
		System.out.println("Raise Cycle: 6 months");
		System.out.println("Salary When Raise Offered: " + (salary+(salary*12 * 30/100)));
	}

	@Override
	public double calculateBonus() {
		if(salary >= 7000 & salary <=21000) {
			return (7000*8.33/100 * 12);
		}
		else if(salary >= 21000) {
			return 0;
		}
		return (int)(salary*8.33/100 *12);
	}
}
