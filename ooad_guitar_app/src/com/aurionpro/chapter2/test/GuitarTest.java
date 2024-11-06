package com.aurionpro.chapter2.test;

import com.aurionpro.chapter2.model.Guitar;
import com.aurionpro.chapter2.model.GuitarSpec;
import com.aurionpro.chapter2.model.Inventory;

import java.util.Iterator;
import java.util.List;

import com.aurionpro.chapter2.model.Builder;
import com.aurionpro.chapter2.model.Type;
import com.aurionpro.chapter2.model.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,  6, Wood.ALDER, Wood.ALDER);
		List matchingGuitars = inventory.searchGuitar(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin you might like this: ");
			
			for(Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have a " + 
						spec.getBuilder() + " " + spec.getModel() + " " 
						+ spec.getType() + " guitar\n  " + 
						spec.getBackWood() + " back and sides, \n" + 
						spec.getTopWood() + " top.\nYou can have it for only $" +
						guitar.getPrice() + "!\n ----");
			}
		}else {
			System.out.println("Sorry! erin we have nothing for you!");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addGuitar("1234", 1400,Builder.FENDER, "Stratocastor", Type.ELECTRIC,6,  Wood.ALDER, Wood.ALDER);
	}
}
