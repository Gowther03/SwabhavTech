package com.aurionpro.composite.test;



import com.aurionpro.composite.model.CompositeBox;
import com.aurionpro.composite.model.DeliveryService;
import com.aurionpro.composite.model.Game;
import com.aurionpro.composite.model.Book;

public class CompositeBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeliveryService deliveryService = new DeliveryService();
		deliveryService.setUpOrder(
				new CompositeBox(
						new Game("God Of War" , 4999)
				),
				new CompositeBox(
						new CompositeBox(
								new Book("Peace", 299),
								new Game("Ordinal", 1999)
								
								),
						new Book("ikagai", 599),
						new Book("rich dad", 199)
				)
		);
		
		System.out.println(deliveryService.calculateOrderPrice());
	}

}
