package com.aurionpro.assignments;

import java.util.Random;
import java.util.Scanner;

public class RollnHoldDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		int turns = 0;
		int flag = 1;
		System.out.println("Welcome to the Dice Game");
		System.out.println("Score 20 or more to win (Press any key to quit any time) --> Start -->");
	
		while(flag == 1) {
			
			turns++;
			if(turns > 6) {
				System.out.println("Turns Ended! Game Over!");
				turns = 0;
				score = 0;
				System.out.print("Press any key to play again! (n[No!]) --> ");
				String play = scanner.next();
				if(play.equals("n")) {
					System.out.println("Game Over!");
					break;
				}
			}
			System.out.println("\nTurn " + turns);
			while(turns <=6) {
				System.out.print("Roll or hold?(r/h/[quit] --> ");
				String choice = scanner.next();
				if(choice.equals("r")) {
					int dieValue = random.nextInt(6) + 1;
					System.out.println("Die value --> " + dieValue);
					if(dieValue == 1) {
						score = 0;
						System.out.println("Turn Over! Score set to zero");
						System.out.println("Restarting Turns!");
						break;
					}
					score += dieValue;
					System.out.println("Current Score --> " + score);
					if(score >= 20) {
						break;
					}
				}else if(choice.equals("h")){
					break;
				}
				else if(choice.equals("q")){
					flag = 0;
					break;
				}
				else {
					System.out.println("Invalid Choice");
				}
			}
			if(score >= 20) {
				System.out.println("You won in " + turns + " turns");
				turns = 0;
				score = 0;
				System.out.print("Press any key to play again! (n[quit]) --> ");
				String play = scanner.next();
				if(play.equals("n")) {
					System.out.println("Game Over!");
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Game Over!");
				break;
			}
		}
	}
}
