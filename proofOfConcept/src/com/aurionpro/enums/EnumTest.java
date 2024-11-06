package com.aurionpro.enums;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeeKDays day = WeeKDays.Saturday;
		
		if(day == WeeKDays.Saturday) {
			System.out.println("Yay! Its Off day");
		}
		System.out.println(day);
		for(WeeKDays myDay : WeeKDays.values()) {
			System.out.println(myDay);
		}
	}

}
