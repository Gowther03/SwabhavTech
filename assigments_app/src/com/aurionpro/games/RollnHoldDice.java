package com.aurionpro.games;

import java.util.Random;
import java.util.Scanner;

public class RollnHoldDice {

	public static void main(String[] args) 
	{
		
		int score = 0;
		int turns = 0;
		System.out.println("Welcome to the Dice Game");
		System.out.println("Score 20 or more to win (Press any key to quit any time) --> Start -->");
		playingLoop(score, turns);        //Playing Method
		
	}
	
	public static void playingLoop(int score, int turns) 
	{
		turns++;
		turns = ifTurnsOver(turns, score);  //Turn Over Method
		System.out.println("\nTurn " + turns);
		while(turns <=6) {
			score = rollNHold(turns, score);
			if(score >= 20) {
				break;
			}
		}
		turns = ifGameWon(turns, score);	//Game Winning Method
	}
	
	public static int rollNHold(int turns, int score) 
	{
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Roll or hold?(r/h/[quit] --> ");
		String choice = scanner.next();
		if(choice.equals("r")) 
		{
			int dieValue = random.nextInt(6) + 1;
			System.out.println("Die value --> " + dieValue);
			dieValue = dieValueCheck(dieValue, turns, score); //Die Value = 1? Check Method
			score += dieValue;
			System.out.println("Current Score --> " + score);
			turns = ifGameWon(turns, score); //Game Winning Method
		}
		else if(choice.equals("h"))
			playingLoop(score, turns);       //Playing Method
		
		else if(choice.equals("q"))
		{
			System.out.println("Game Over!");
			System.exit(0);
		}
		else 
			System.out.println("Invalid Choice");
		
		return score;
	}
	
	public static int dieValueCheck(int dieValue, int turns, int score) 
	{
		if(dieValue == 1) {
			score = 0;
			System.out.println("Turn Over! Score set to zero");
			System.out.println("Starting New Turn!");
			playingLoop(score, turns);        //Playing Method
		}
		return dieValue;
	}
	
	public static void playAgain() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Press any key to play again! (n[quit]) --> ");
		String play = scanner.next();
		if(play.equals("n")) {
			System.out.println("Game Over!");
			System.exit(0);
		}
	}
	
	public static int ifTurnsOver(int turns, int score) 
	{
		if(turns > 6) {
			System.out.println("Turns Ended! Game Over!");
			turns = 0;
			score = 0;                        //Play Again Method
			playAgain();
			playingLoop(score, turns);        //Playing Method
		}
		return turns;
	}
	
	public static int ifGameWon(int turns, int score) 
	{
		if(score >= 20) {
			System.out.println("You won in " + turns + " turns");
			turns = 0;
			score = 0;
			playAgain();                      //Play Again Method
			playingLoop(score, turns);        //Play Again Method
		}
		return turns;
	}
}
