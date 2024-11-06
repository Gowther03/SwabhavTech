package com.aurionpro.test;

import com.aurionpro.model.Box;

public class Box1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		
		box1.setWidth(10);
		box1.setDepth(20);
		box1.setHeight(30);
		
		System.out.println("Height is: " + box1.getHeight());
		System.out.println("Width is: " + box1.getWidth());
		System.out.println("Depth is: " + box1.getDepth());
	}

}
