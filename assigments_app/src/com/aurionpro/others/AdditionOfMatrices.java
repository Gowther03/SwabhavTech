package com.aurionpro.others;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Matrix 1 elements\n");
		System.out.print("Enter the Matrix rows: ");
		int rows1 = scanner.nextInt();
		System.out.print("Enter the Matrix columns: ");
		int columns1 = scanner.nextInt();

		int matrix1[][] = new int[rows1][columns1];
		for(int i = 0; i<rows1; i++) {
			for(int j = 0; j<columns1; j++) {
				System.out.print("Enter the Matrix[" + i + "][" + j + "] element: ");
				matrix1[i][j] = scanner.nextInt();
			}	
		}
		for(int i = 0; i<rows1; i++) {
			System.out.print(Arrays.toString(matrix1[i]));	
			System.out.println();
		}
		
		System.out.println("Enter the Matrix 2 elements\n");
		System.out.print("Enter the Matrix rows: ");
		int rows2 = scanner.nextInt();
		System.out.print("Enter the Matrix columns: ");
		int columns2 = scanner.nextInt();

		int matrix2[][] = new int[rows2][columns2];
		for(int i = 0; i<rows2; i++) {
			for(int j = 0; j<columns2; j++) {
				System.out.print("Enter the Matrix2[" + i + "][" + j + "] element: ");
				matrix2[i][j] = scanner.nextInt();
			}	
		}
		for(int i = 0; i<rows2; i++) {
			System.out.print(Arrays.toString(matrix2[i]));	
			System.out.println();
		}
	
		if((rows1 == rows2) & (columns1 == columns2)) {
			System.out.println("Addition of the Two Matrices: ");
			int sum[][] = new int[rows1][columns1];
			for(int i = 0; i<rows1; i++) {
				for(int j = 0; j<columns1; j++) {
					sum[i][j] = matrix1[i][j] + matrix2[i][j];
				}	
			}
			for(int i = 0; i<rows2; i++) {
				System.out.print(Arrays.toString(sum[i]));	
				System.out.println();
			}
			
			
		}else {
			System.out.println("Row and Columns are different!");
		}
	}

}
