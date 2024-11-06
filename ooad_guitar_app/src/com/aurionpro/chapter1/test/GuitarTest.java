package com.aurionpro.chapter1.test;

import com.aurionpro.chapter1.model.Guitar;
import com.aurionpro.chapter1.model.Inventory;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("", "fender", "Stratocastor", "electric", "Alder", "Alder", 0);
		Guitar guitar = inventory.searchGuitar(whatErinLikes);
		if(guitar != null) {
			System.out.println("Erin you might like this " + 
		guitar.getBuilder() + " " + guitar.getModel() + " " 
		+ guitar.getType() + " guitar\n  " + 
		guitar.getBackWood() + " back and sides, \n" + 
		guitar.getTopWood() + " top.\nYou can have it for only $" +
		guitar.getPrice() + "!");
		}else {
			System.out.println("Sorry! erin we have nothing for you!");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addGuitar("1234", "fender", "Stratocastor", "electric", "Alder", "Alder", 1400);
	}
}
