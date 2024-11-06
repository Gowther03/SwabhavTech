package com.aurionpro.model;

public abstract class Subject {
	public Subject(){
		System.out.println("Learning Subject!");
	}
	public abstract void syllabus();
	public void learn() {
		System.out.println("Preparing Right Now!");
	}
}
