package com.aurionpro.games;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Treasure Island");
		
		System.out.println("Choose the options to reach to the treasure!");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("left or right? --> ");
		String direction = scanner.nextLine();
		
		if(direction.equals("left")) {
			
			System.out.print("swim or wait? --> ");
			String activity = scanner.nextLine();
			
			if(activity.equals("wait")){
				
				System.out.print("red or blue or yellow? --> ");
				String doorColour = scanner.nextLine();
				
				if(doorColour.equals("yellow")) {
					
					System.out.println("Yay! You win the treasure!");
				}
				else if(doorColour.equals("red")){
					
					System.out.println("You're burned by fire!");
					System.out.println("Game Over");
				}
				else if(doorColour.equals("blue")){
					
					System.out.println("You're eaten by beasts!");
					System.out.println("Game Over");
				}
				else{
					
					System.out.println("Wrong option");
					System.out.println("Game Over");
				}
			}
			else if(activity.equals("swim")){
				
				System.out.println("You're attacked by trouts!");
				System.out.println("Game Over");
			}
			else{
				
				System.out.println("Wrong option");
				System.out.println("Game Over");
			}
		}
		else if(direction.equals("right")){
			
			System.out.println("You fell into hole!");
			System.out.println("Game Over");
		}
		else{
			
			System.out.println("Wrong option");
			System.out.println("Game Over");
		}
	}

}
