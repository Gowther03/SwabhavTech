package com.aurionpro.commandLine;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int principal = Integer.parseInt(args[0]);
		float roi = Float.parseFloat(args[1]);
		int time = Integer.parseInt(args[2]);
		
		double rate = Math.pow((1 + roi/100), time);
		double ci = principal*rate;
		System.out.println("Compound Interest is: " +  ci);
	}

}
