package com.aurionpro.others;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationOfMatrices {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int matrix1[][] = readMatrix();
		displayMatrix(matrix1);

		int matrix2[][] = readMatrix();
		displayMatrix(matrix2);
		
		int multiplyMatrix[][] = takeMatrix(matrix1,matrix2);
		displayMatrix(multiplyMatrix);
	}
	
	public static int[][] readMatrix()
	{
		System.out.println("Enter the Matrix elements\n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Matrix rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the Matrix columns: ");
		int columns = scanner.nextInt();
		System.out.println();
		int matrix[][] = new int[rows][columns];
		for(int rowIndex = 0; rowIndex < rows; rowIndex++)
		{
			makeMatrix(matrix, rowIndex,columns);	
		}
		return matrix;
	}
	
	public static void makeMatrix(int matrix[][], int rowIndex, int columns) 
	{
		Scanner scanner = new Scanner(System.in);
		for(int columnIndex = 0; columnIndex < columns; columnIndex++) 
		{
			System.out.print("Enter the Matrix[" + rowIndex + "][" + columnIndex + "] element: ");
			matrix[rowIndex][columnIndex] = scanner.nextInt();
		}
	}
	
	public static void displayMatrix(int[][] matrix) 
	{
		for(int i = 0; i<matrix.length; i++) 
		{
			System.out.print(Arrays.toString(matrix[i]));	
			System.out.println();
		}
	}
	
	public static int[][] takeMatrix(int[][] matrix1, int[][] matrix2)
	{
		if(matrix1[0].length != matrix2.length) 
		{
			System.out.println("Matrix Multiplication not possible since column sizes are different!");
			return null;
		}
		System.out.println("\nMatrix Multiplication is ----->");
		int rows = matrix1.length;
		int columns = matrix2[0].length;
		int multiplyMat[][] = new int[rows][columns];
		for(int rowIndex = 0; rowIndex < rows; rowIndex++) 
		{
			placeValueInMatrix(multiplyMat, matrix1, matrix2, rowIndex, columns);
		}
		return multiplyMat;
	}
	
	public static void placeValueInMatrix(int multiplyMat[][], int[][] matrix1, int[][] matrix2, int rowIndex, int columns)
	{
		for(int columnIndex = 0; columnIndex < columns; columnIndex++) 
		{
			int sum = 0;
			sum = multiplaction(sum,matrix1, matrix2, rowIndex, columns,columnIndex);
			multiplyMat[rowIndex][columnIndex] = sum;
		}		
	}
	
	public static int multiplaction(int sum, int[][] matrix1, int[][] matrix2, int rowIndex, int columns, int columnIndex) 
	{
		for(int place = 0; place < columns; place++) 
		{
			sum += (matrix1[rowIndex][place] * matrix2[place][columnIndex]);	
		}
		return sum;
	}

}
