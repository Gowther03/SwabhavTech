package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.HatDecorators;
import com.aurionpro.structural.decorator.model.HatServiceProvider;
import com.aurionpro.structural.decorator.model.IHat;

public class HatTest {
	public static void main(String[] args) {
		IHat basicHat = HatServiceProvider.getStandardHat();
		System.out.println("Name: " + basicHat.getName() );
		System.out.println("Price: " + basicHat.getPrice());
		HatDecorators goldenHat = HatServiceProvider.getGoldenDesign(basicHat);
		System.out.println("Name: " + goldenHat.getName() );
		System.out.println("Price: " + goldenHat.getPrice());
		HatDecorators ribbedHat = HatServiceProvider.getRibbedDesign(basicHat);
		System.out.println("Name: " + ribbedHat.getName() );
		System.out.println("Price: " + ribbedHat.getPrice());
		HatDecorators goldenRibbedHat = HatServiceProvider.getGoldenDesign(ribbedHat);
		System.out.println("Name: " + goldenRibbedHat.getName() );
		System.out.println("Price: " + goldenRibbedHat.getPrice());
		
		IHat premiumHat = HatServiceProvider.geLuxuryHat();
		System.out.println("Name: " + premiumHat.getName() );
		System.out.println("Price: " + premiumHat.getPrice());
		HatDecorators goldenPremium = HatServiceProvider.getGoldenDesign(premiumHat);
		System.out.println("Name: " + goldenPremium.getName() );
		System.out.println("Price: " + goldenPremium.getPrice());
		HatDecorators ribbedGoldenPremium = HatServiceProvider.getRibbedDesign(goldenPremium);
		System.out.println("Name: " + ribbedGoldenPremium.getName() );
		System.out.println("Price: " + ribbedGoldenPremium.getPrice());
	}
}
