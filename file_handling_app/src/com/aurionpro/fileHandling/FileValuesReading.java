package com.aurionpro.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileValuesReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input = new FileInputStream("demo.txt");
		int ch;
		int charCounter = 0;
		int wordCounter = 0;
		int lineCounter = 0;
		while((ch = input.read()) != -1) {
			
			charCounter++;
			if((char)ch == ' ') {
				charCounter--;
			}
			if((char)ch == ' ' || (char)ch == '\t' || (char)ch == '\n') {
				wordCounter++;
			}
			if((char)ch == '\n') {
				lineCounter++;
			}
		}
		System.out.println("Number of characters: "+(charCounter));
		System.out.println("Number of words: "+(wordCounter+1));
		System.out.println("Number of lines: "+(lineCounter+1));
	}

}
