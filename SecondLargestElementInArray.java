package com.aurionpro.arrays;

import java.util.Scanner;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size --> ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int max = 0;
		int secondMax = 0;
		for(int i = 0;i<size;i++) {
			System.out.print("Enter the element " + (i+1) + " --> ");
			int element = scanner.nextInt();
			array[i] = element;
			if(array[i] >= max) {
				secondMax = max;
				max = array[i];
			}
			if(array[i] >= secondMax && array[i] != max) {
				secondMax = array[i];
			}
		}
		
		if(array.length < 2 || secondMax == max) {
			System.out.print("Second Maximum element is not available");
		}else {
			System.out.print("Second Maximum element is " + secondMax);
		}
	}

}
