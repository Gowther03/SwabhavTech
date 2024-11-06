package com.aurionpro.enums;

public enum WeeKDays {
	Monday(8),
	Tuesday(6),
	Wednesday(6),
	Thursday(7), 		//Predefined Objects//other class using this enum cannot create new objects 
	Friday(7),
	Saturday(5),
	Sunday(0);
	
	final int totalWorkingHours; //final --> so the value cannot be changed
	WeeKDays(int totalWorkingHours){
		this.totalWorkingHours = totalWorkingHours;		//when object is used they will have this field
	}
	
}
