package com.aurionpro.model;

public class ContractualEmployee extends EmployeeMS {
	private double salary;
	private int duration;
	private static int count;
	
	public ContractualEmployee(int employeeCode,String employeeName, double salary, int duration) {
		super(employeeCode, employeeName);
		this.salary = salary;
		this.duration = duration;
		count++;
	}

	public void getCount() {
		System.out.println("\nTotal Contractual Employee created: " + count);
	}
	@Override
	public void displayDetails() {
		System.out.println("Employee Type: Contractual");
		this.getEmployeeCode();
		this.getName();
		System.out.println("Work Email: " + this.generateEmail());
		System.out.println("Work Duration: " + duration);
		System.out.println("Total Salary: " + (salary*duration));
	}

	@Override
	public double calculateBonus() {
		if(salary >= 7000 & salary <=21000) {
			return (7000*8.33/100 * duration);
		}
		else if(salary >= 21000) {
			return 0;
		}
		return (int)(salary*8.33/100* duration);
	}

}

