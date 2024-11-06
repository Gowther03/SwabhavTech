package com.aurionpro.loops;

import java.util.Random;
import java.util.Scanner;

public class WordGuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Word Guesser Game");
		System.out.println("Guess the word letters to win (Press 0 to quit any time)");
		
		String[] words = {"suggest","hair","injure","jobless","loss","monkey","melt","guilt","temple","fail"};
		
		int flag = 1;
		int game = 0;
		while(true) {
			game++;
			System.out.println("\nGame " + game + " -->");
			
			int index = random.nextInt(10);
			StringBuilder word = new StringBuilder(words[index]);
			
			System.out.println("-----Word Generated!-----");
			System.out.println("-----creating blanks-----10 Chances");
			
			char[] checkWord = word.toString().toCharArray();
			int[] places = new int[word.length()];
			
			for(int i = 0; i < (word.length()/2); i++) {
				places[i] = random.nextInt(word.length());
			}

			for(int place : places) {
				word.setCharAt(place, '_');
			}
			System.out.println("Word is --> [ " + word + " ] with word length: " + word.length());
			
			int chance = 0;
			while(true) {
				
				chance++;
				if(chance>10) {
					System.out.println("Game over!... Time to revisit school :(");
					break;
				}
				System.out.print("Your letter --> ");
				String letter = scanner.next();
				if(letter.equals("0")) {
					flag=0;
					break;
				}
				for(int place : places) {
					if(letter.charAt(0) == checkWord[place]){
						word.setCharAt(place, letter.charAt(0));
					}
				}
				System.out.println("Word is --> " + word);
				if(word.toString().equals(String.valueOf(checkWord))) {
					System.out.println("\nCongratulations! Word completed in " + chance + " chances!");
					break;
				}
				System.out.println("Chances Left --------> " + (10 - chance));
			}
			if(flag == 0) {
				System.out.println("Game Closed!");
				break;
			}
			System.out.print("Press any key to play again! (n[quit]) --> ");
			String play = scanner.next();
			if(play.equals("n")) {
				System.out.println("Game Closed!");
				break;
			}
		}
	}
}
