package com.aurionpro.fileHandling;

import java.io.File;
import java.io.IOException;

public class PropertiesOfAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File output = new File("src");
		System.out.println("Name: " + output.getName());
		System.out.println("Location: " + output.getAbsolutePath());
		System.out.println("Size: " + output.length() + " kb");
		System.out.print("Permissions: ");
		if(output.canRead() & output.canWrite()) {
			System.out.println("Read and Write");
		}else if(output.canRead()) {
			System.out.println("Read");
		}else {
			System.out.println("Write");

		}
		
		if(output.isDirectory()) {
			System.out.println("Its a directory");
			System.out.println("Files in it: ");
			File[] file = output.listFiles();
			
			for(File f : file) {
				System.out.println(f);
			}
		}else {
			System.out.println("Its not a directory");
		}

		
		
	}

}
