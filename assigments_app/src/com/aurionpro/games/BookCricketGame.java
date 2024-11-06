package com.aurionpro.games;

import java.util.Random;
import java.util.Scanner;

public class BookCricketGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------------Welcome to the Book Cicket Game---------------");
		System.out.println("\nRules for the Game: ");
	
		System.out.println("----------> Player 1 continues and keeps adding to the score untill page number results in a 0 score resulting in out");
		System.out.println("----------> Player 2 starts the game and tries to beat the score of player 1\n");
		

		while(true) {
			System.out.print("Enter 1 to Start Game and 0 to Exit: ");
			int start = scanner.nextInt();
			if(start == 0) {
				System.out.println("----------Game Closed!----------");
				break;
			}else if(start == 1) {
				System.out.print("\nEnter the Player 1 name: ");
				String name1 = scanner.next();
				System.out.print("\nEnter the Player 2 name: ");
				String name2 = scanner.next();
				
				System.out.println("\nPlayer : " + name1);
				int runs1 = 0;
				int round1 = 0;
				while(true) {
					System.out.print("-----> Enter 1 to Open Book: ");
					int open1 = scanner.nextInt();
					
					if(open1 == 1) {
						round1++;
						int page1 = random.nextInt(300) + 1;
						int score1 = page1%7;
						runs1 += score1;
						System.out.println("Page Number: " + page1 + "    -----    Point: " + score1 + "    -----    Score: " + runs1 + "\n");
						if(score1 == 0) {
							System.out.println("!!!     OOPS     !!! ----> Player out!");
							System.out.println(name1 + " Total Score: " + runs1);
							System.out.println(name1 + " took " + round1 + " rounds!");
							break;
						}

					}else {
						System.out.println("----->Invalid Input!<-----");
					}
				}
				System.out.println(name2 + " needs " + (runs1+1) + " runs in " + round1 + " rounds to Win Match!");
				System.out.println("\nPlayer : " + name2);
				int runs2 = 0;
				int round2 = 0;
				while(true) {
					if(round2 > round1) {
						System.out.println("-----> No Rounds Left!!! <-----");
						System.out.println(name2 + " LOOSES THE MATCH!!");
						System.out.println(name2 + " Total Score: " + runs2);
						System.out.println(name2 + " took " + round2 + " rounds!");
						System.out.println("--------------Game Over----------------");
						break;
					}
					System.out.print("-----> Enter 1 to Open Book: ");
					int open2 = scanner.nextInt();
					
					if(open2 == 1) {
						round2++;
						int page2 = random.nextInt(300) + 1;
						int score2 = page2%7;
						runs2 += score2;
						System.out.println("Page Number: " + page2 + "    -----    Point: " + score2 + "    -----    Score: " + runs2 + "            Rounds Left: " + (round1-round2) + "\n");
						if(score2 == 0) {
							System.out.println("!!!     OOPS     !!! ----> Player out!");
							System.out.println(name2 + " Total Score: " + runs2);
							System.out.println(name2 + " took " + round2 + " rounds!");
							System.out.println(name2 + " LOOSES THE MATCH!!");
							System.out.println("--------------Game Over----------------");
							break;
						}else if(runs2 > runs1) {
							System.out.println(name2 + " WINS THE MATCH!!!!");
							System.out.println(name2 + " Total Score: " + runs2);
							System.out.println(name2 + " took " + round2 + " rounds!");
							System.out.println("--------------Game Over----------------");
							break;
						}else if(runs2 == runs1) {
							if(round2 < round1) {
								System.out.println(name2 + " WINS THE MATCH!!!!");
								System.out.println(name2 + " Total Score: " + runs2);
								System.out.println(name2 + " took " + round2 + " rounds!");
								System.out.println("--------------Game Over----------------");
								break;
							}else if(round2 > round1){
								System.out.println("!!!     OOPS     !!! ---- Player out!");
								System.out.println(name2 + " Total Score: " + runs2);
								System.out.println(name2 + " took " + round2 + " rounds!");
								System.out.println(name2 + " LOOSES THE MATCH!!");
								System.out.println("--------------Game Over----------------");
								break;
							}else {
								System.out.println("--------------Game Draw----------------");
							}
						}
					}else {
						System.out.println("----->Invalid Input!<-----");
					}
				}
			}else {
				System.out.println("----->Invalid Input!<-----");
			}
			System.out.println("\n-----> Play Again?");
				
		}
			
	}

}
