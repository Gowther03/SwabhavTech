package com.aurionpro.structural.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.structural.adapter.model.Biscuit;
import com.aurionpro.structural.adapter.model.Chocolate;
import com.aurionpro.structural.adapter.model.Hat;
import com.aurionpro.structural.adapter.model.IItem;

public class ItemTest {
	
	public static void main(String[] args) {
		
		List<IItem> items = new ArrayList<IItem>();
		items.add(new Biscuit());
		items.add(new Chocolate());
		items.add(new Hat());
		System.out.println("Item Name\tPrice");
		System.out.println("------------------------------");
		double total = 0;
		for(IItem item : items) {
			System.out.println(item.getName() + "\t\t" +  item.getPrice());
			total+=item.getPrice();
		}
		System.out.println("------------------------------");
		System.out.println("Total:\t\t" + total);
	}
	
	
}
