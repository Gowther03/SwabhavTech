package com.aurionpro.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Matrix elements\n");
		int matrix[][] = readMatrix();
		System.out.println("Given Matrix ----->");
		displayMatrix(matrix);
		ArrayList<Integer> spiral = spiralMatrix(matrix);
		System.out.print("Spiral Form is ---> ");
		for(int i = 0;i<spiral.size();i++){
            System.out.print(spiral.get(i) + " ");
        }
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
	
	public static ArrayList<Integer> spiralMatrix(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		ArrayList<Integer> spiral = new ArrayList<>();
		
		int top =0;
		int right = columns -1;
		int left = 0;
		int bottom = rows - 1;
		
		
		
		while(top <= bottom & left <= right){
			
			for(int i = left; i<=right; i++) {
				spiral.add(matrix[top][i]);
			}
			top++;
			
			for(int i = top; i<=bottom; i++) {
				spiral.add(matrix[i][right]);
			}
			right--;
			
			if(top<=bottom) {
				for(int i = right; i>= left; i--) {
					spiral.add(matrix[bottom][i]);
				}
				left++;
			}
			
			if(left<= right) {
				for(int i = bottom; i >= top; i--) {
					spiral.add(matrix[i][left]);
				}
			}
		}
		return spiral;
	}

}
