package com.aurionpro.games;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Number Guesser Game");
		System.out.println("Guess the correct number to win (Press any key to quit any time)\n");
		
		int turns = 0;
		while(true) {
			turns++;
			System.out.println("--------Turn " + turns + "--------");
			int generatedNumber = random.nextInt(500) + 1;
			System.out.println("Number Generated!");
			int guesses = 0;
			while(true) {
				guesses++;
				System.out.print("Your Guess? --> ");
				int number = scanner.nextInt();
				if(number == generatedNumber) {
					System.out.println("----Correct!---- You win in " + guesses + " guesses.");
					break;
				}else if(number > generatedNumber) {
					System.out.println("-----------------> Number too high");
				}else if(number < generatedNumber) {
					System.out.println("-----------------> Number too low!");
				}
			}
			System.out.print("\nPress any key to play again! (n[No!]) --> ");
			String play = scanner.next();
			if(play.equals("n")) {
				System.out.println("----Game Over!----");
				break;
			}
		}
	}

}
