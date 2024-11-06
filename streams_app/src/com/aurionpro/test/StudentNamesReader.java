package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StudentNamesReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("student_name.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line  = bufferedReader.readLine();
		System.out.println("Reading using FileReader-->");
		while(line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		bufferedReader.close();
		
		System.out.println("\nReading using Streams -->");
		Files.lines(Paths.get("student_name.txt"))
		.forEach((ch) -> System.out.println(ch));
	}

}
