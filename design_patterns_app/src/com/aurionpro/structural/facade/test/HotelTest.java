package com.aurionpro.structural.facade.test;

import com.aurionpro.structural.facade.model.HotelReception;

public class HotelTest {
	public static void main(String[] args) {
		HotelReception reception1 = new HotelReception();
		reception1.getIndianMenu();
		HotelReception reception2 = new HotelReception();
		reception2.getChineseMenu();
		HotelReception reception3 = new HotelReception();
		reception3.getItalianMenu();
	}
}
