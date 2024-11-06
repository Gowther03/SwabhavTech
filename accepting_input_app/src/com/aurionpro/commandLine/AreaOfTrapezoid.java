package com.aurionpro.commandLine;

public class AreaOfTrapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float base1 = Float.parseFloat(args[0]);
		float base2 = Float.parseFloat(args[1]);
		float height = Float.parseFloat(args[2]);

		float area = ((base1 + base2)/2)*height;
		System.out.println("Area of Trapezoid is " +  area);

	}

}
