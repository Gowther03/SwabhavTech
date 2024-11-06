package com.aurionpro.others;

import java.util.Arrays;
import java.util.Scanner;

public class TranspositionOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Matrix elements\n");
		int matrix[][] = readMatrix();
		System.out.println("Given Matrix ----->");
		displayMatrix(matrix);
		transposeMatrix(matrix);
	}
	public static int[][] readMatrix(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Matrix rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the Matrix columns: ");
		int columns = scanner.nextInt();
		System.out.println();
		int matrix[][] = new int[rows][columns];
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<columns; j++) {
				System.out.print("Enter the Matrix[" + i + "][" + j + "] element: ");
				matrix[i][j] = scanner.nextInt();
			}	
		}
		return matrix;
	}
	
	public static void displayMatrix(int[][] matrix) {
		for(int i = 0; i<matrix.length; i++) {
			System.out.print(Arrays.toString(matrix[i]));	
			System.out.println();
		}
	}
	
	public static void transposeMatrix(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		int transposedMatrix[][] = new int[rows][columns];
	
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j<columns; j++) {
				transposedMatrix[j][i] = matrix[i][j];
			}
		}
		System.out.println("\nTransposed Matrix ----->");
		displayMatrix(transposedMatrix);
	}
}
