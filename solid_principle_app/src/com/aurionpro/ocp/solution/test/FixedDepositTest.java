package com.aurionpro.ocp.solution.test;

import java.util.Scanner;

import com.aurionpro.ocp.solution.model.Christmas;
import com.aurionpro.ocp.solution.model.Diwali;
import com.aurionpro.ocp.solution.model.FixedDeposit;
import com.aurionpro.ocp.solution.model.Holi;
import com.aurionpro.ocp.solution.model.IFestivalOffer;
import com.aurionpro.ocp.solution.model.InterestCalculator;
import com.aurionpro.ocp.solution.model.NewYear;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account No: ");
		int accountNo = scanner.nextInt();
		System.out.println("Enter Name: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter Principle Amount: ");
		double amount = scanner.nextDouble();
		IFestivalOffer festivalOffer = getFestivalOffer();
		System.out.println("Enter the Duration in Years:");
		double duration = scanner.nextDouble();
		FixedDeposit fixedDeposit = new FixedDeposit(accountNo, name, amount,festivalOffer, duration);
		InterestCalculator interestCalculator = new InterestCalculator();
		System.out.println("Interest Amount: "+interestCalculator.calculateInterest(fixedDeposit));
	}
	
	public static IFestivalOffer getFestivalOffer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Diwali, 2. Holi, 3. Christmas, 4. New Year");
		while(true) {
			System.out.println("Enter Index: ");
			String index = scanner.next();
			switch (index) {
			case "1": 
				return new Diwali();
			case "2": 
				return new Holi();
			case "3": 
				return new Christmas();
			case "4": 
				return new NewYear();
			default:
				System.out.println("Unexpected value: " + index);
				break;
			}
		}
	}

}
