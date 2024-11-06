package com.aurionpro.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContentFromOneToAnother {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File output = new File("output.txt");
		if(output.createNewFile()) {
			 System.out.println("File created");
			 System.out.println("Copying from demo file to output file");
		}else {
			System.out.println("File already exists");
			System.out.println("Copying from demo file to output file");
		}
		FileInputStream input = new FileInputStream("demo.txt");
		int ch;
		FileOutputStream writing = new FileOutputStream(output);//if file not created then FileOutputStram still refers and a new file on its own with the name given
		while((ch = input.read()) != -1) {
			writing.write(ch);//(char) ch not necessary
		}
		input.close();
		writing.close();
		
	}

}
