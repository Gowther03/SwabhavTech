package com.aurionpro.games;

import java.util.Scanner;

public class ATMSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float balance = 0;
		
		
		while(true) {
			
			System.out.println("ATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Please choose an option: ");
			int option = scanner.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Your current balance is: " + balance);
				break;
			case 2:
				System.out.print("Enter amount to deposit: ");
				int deposit = scanner.nextInt();
				balance += deposit;
				break;
			case 3:
				System.out.print("Enter amount to withdraw: ");
				int withdraw = scanner.nextInt();
				
				if(balance == 0 || balance < withdraw) {
					System.out.println("Cannot Withdraw: Insufficient Balance!");
					break;
				}
				balance -= withdraw;
				break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!!");
				break;
			default:
				System.out.println("Invalid input. Please select correct option");
				break;
			}
			
			if(option == 4) {
				break;
			}
		}
		

	}

}
