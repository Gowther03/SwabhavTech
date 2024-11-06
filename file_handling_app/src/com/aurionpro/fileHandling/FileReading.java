package com.aurionpro.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		FileInputStream input = new FileInputStream("demo.txt");
//		
//		if(input.createNewFile()) {
//			 System.out.println("File created");
//		}else {
//			System.out.println("File already exists");
//		}
//		System.out.println(input.getAbsolutePath());
//		System.out.print(input);
		int ch;
		while((ch = input.read()) != -1) {
			System.out.print((char)ch);
			
		}
		
	}
	

}
