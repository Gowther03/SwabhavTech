package com.aurionpro.others;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Matrix rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the Matrix columns: ");
		int columns = scanner.nextInt();

		int matrix[][] = new int[rows][columns];
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<columns; j++) {
				System.out.print("Enter the Matrix[" + i + "][" + j + "] element: ");
				matrix[i][j] = scanner.nextInt();
			}	
		}
		for(int i = 0; i<rows; i++) {
			System.out.print(Arrays.toString(matrix[i]));	
			System.out.println();
		}
	}

}
