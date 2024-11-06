package com.aurionpro.games;

import java.util.Scanner;

public class EmailChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the email ID --> ");
		String email = scanner.next();
		int options = 1;
		switch(options) {
		case 1:
			int flag = 0;
			if(email.contains("@gmail.com") || email.contains("@outlook.com")) {
					flag = 0;
			}else {
				flag = 1;
			}
			if (flag == 0) {
				System.out.print("good");
			}
			else {
				System.out.print("bad");
			}	
		case 2:
			
		case 3:
		case 4:
		case 5:
		}
	}

}
