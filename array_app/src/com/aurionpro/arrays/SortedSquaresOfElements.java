package com.aurionpro.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSquaresOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size --> ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i = 0;i<size;i++) {
			System.out.print("Enter the element " + (i+1) + " --> ");
			array[i] = scanner.nextInt();//4
		}
		squares(array);
		Arrays.sort(array);
		for(int i = 0;i<size;i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void squares(int[] array) {
		for(int i = 0;i<array.length;i++) {
			array[i] = array[i]*array[i];//7
		}
	}

}
