package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BondsSection;
import com.aurionpro.model.IPlatform;
import com.aurionpro.model.StocksSection;
import com.aurionpro.model.MutualFundsSection;

public class PlatformTest {

	public static void main(String[] args) 
	{
		System.out.println("Investment Portfolio----->");
		System.out.println("Choose Portfolio---->");
		while(true) {
			choosePortfolio();
		}
	}
	
	public static void choosePortfolio() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n1. Stocks, 2. Bonds, 3. Mutual Funds, 4. Exit ---> ");
		int type = scanner.nextInt();
		IPlatform portfolio = null;
		
		switch(type) {
		case 1:
			portfolio = new StocksSection();
			portfolioDetails(portfolio);
			break;
		case 2:
			portfolio = new BondsSection();
			portfolioDetails(portfolio);
			break;
		case 3:
			portfolio = new MutualFundsSection();
			portfolioDetails(portfolio);
			break;
		case 4:
			System.out.println("App Closed!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Input!");
			break;
		}
		

	}

	public static void portfolioDetails(IPlatform portfolio) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter the Amount to Invest: ");
		double amount = scanner.nextDouble();
		System.out.print("\nEnter the Market Condition: ");
		double marketCondition = scanner.nextDouble();
		System.out.println();
		System.out.printf("Your returns based on the selected portfolio: %.2f\n", portfolio.calculateReturns(amount, marketCondition));
	}
}
