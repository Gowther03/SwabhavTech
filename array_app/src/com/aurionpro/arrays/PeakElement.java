package com.aurionpro.arrays;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size --> ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i = 0;i<size;i++) {
			System.out.print("Enter the element " + (i+1) + " --> ");
			int element = scanner.nextInt();
			array[i] = element;
		}
		if(array.length == 1) {
			System.out.print("Peak ELement --> " + array[0]);
		}
		for(int i = 1;i<size-1;i++) {
			if(array[i-1] <= array[i] && array[i+1] <= array[i]) {
				System.out.print("Peak ELement --> " + array[i]);
			}
		}
	}

}
