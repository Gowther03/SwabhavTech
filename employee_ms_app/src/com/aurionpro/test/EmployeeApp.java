package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.ContractualEmployee;
import com.aurionpro.model.EmployeeMS;
import com.aurionpro.model.Intern;
import com.aurionpro.model.PermanentEmployee;


public class EmployeeApp {
	static int flag = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("----Employee Management System----");
		while(flag == 1) {
			System.out.print("Press 'Y' to Add Employee('N' -> No): ");
			String input = scanner.next();
			takeInput(input);
		}
	}
	
	public static void takeInput(String input) {
		Scanner scanner = new Scanner(System.in);
		if(input.toLowerCase().equals("y")) {
			System.out.println("\nEmployee Details-->");
			System.out.print("Employee Type(1. Permanent, 2.Contractual, 3.Intern) --> ");
			int type = scanner.nextInt();
			createEmployee(type);
		}
		else if(input.toLowerCase().equals("n")) {
			System.out.println("Thank You!");
			flag = 0;
		}
		else {
			System.out.println("Invalid Input");
		}

	}
	
	public static void createEmployee(int type) 
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int employeeCode = 0;
		String name = null;
		double salary = 0.0;
		int duration = 0;
		switch(type) {
		case 1:
			employeeCode = codeGenerator();
			System.out.print("\nEmployee Name: ");
			name = scanner.nextLine();
			System.out.print("Salary: ");
			salary = scanner.nextDouble();
			PermanentEmployee permanentEmployee = new PermanentEmployee(employeeCode,name,salary);
			permanentEmployee.getCount();
			permanentEmployee.getEmployeeCount();
			employeeDetails(permanentEmployee);
			break;
		case 2:
			employeeCode = codeGenerator();
			System.out.print("Employee Name: ");
			name = scanner.nextLine();
			System.out.print("Salary: ");
			salary = scanner.nextDouble();
			System.out.print("duration: ");
			duration = scanner.nextInt();
			ContractualEmployee contractualEmployee = new ContractualEmployee(employeeCode,name,salary,duration);
			contractualEmployee.getCount();
			contractualEmployee.getEmployeeCount();
			employeeDetails(contractualEmployee);
			break;
		case 3:
			employeeCode = codeGenerator();
			System.out.print("Intern Name: ");
			name = scanner.nextLine();
			System.out.print("Stipend: ");
			salary = scanner.nextDouble();
			System.out.print("duration: ");
			duration = scanner.nextInt();
			Intern intern = new Intern(employeeCode,name,salary,duration);
			intern.getCount();
			intern.getEmployeeCount();
			employeeDetails(intern);
			break;
		default:
			System.out.println("Invalid Input!");
			break;
		}
	}
	
	public static int codeGenerator() {
		Random random = new Random();
		return (random.nextInt(500000)+100000);
	}
	
	public static void employeeDetails(EmployeeMS employee) {
		Scanner scanner = new Scanner(System.in);
		employee.getEmployeeCode();
		System.out.println("\n-----Information-----");
		System.out.println("1. Employee Details");
		System.out.println("2. Bonus Provided");
		System.out.println("3. Exit");
		while(true) {
			System.out.print("\nEnter Menu Number to Get Specified Information: ");
			int action = scanner.nextInt();
			switch(action) {
			case 1:
				System.out.println("\nEmployee Details: ");
				employee.displayDetails();;
				break;
			case 2:
				System.out.print("Bonus Provided: " + employee.calculateBonus());
				break;
			case 3:
				System.out.println("Menu Closed!");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			if(action == 3) {
				break;
			}
		}
	}

}
