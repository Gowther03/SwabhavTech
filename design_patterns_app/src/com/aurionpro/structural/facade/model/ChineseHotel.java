package com.aurionpro.structural.facade.model;

public class ChineseHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		// TODO Auto-generated method stub
		return new ChineseMenu();
	}

}
