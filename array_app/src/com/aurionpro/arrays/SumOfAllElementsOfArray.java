package com.aurionpro.arrays;

import java.util.Scanner;

public class SumOfAllElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size --> ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int sum = 0;
		for(int i = 0;i<size;i++) {
			System.out.print("Enter the element " + (i+1) + " --> ");
			int element = scanner.nextInt();
			array[i] = element;
			sum += array[i];
		}
		for(int i = 0;i<size;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\nThere sum is " + sum);
	}

}
