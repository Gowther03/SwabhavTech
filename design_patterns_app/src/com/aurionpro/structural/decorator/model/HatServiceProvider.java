package com.aurionpro.structural.decorator.model;

public class HatServiceProvider {

	public static IHat getStandardHat() {
		IHat hat = new BasicHat();
		return hat;
	}
	public static IHat geLuxuryHat() {
		IHat hat = new LuxuryHat();
		return hat;
	}
	public static HatDecorators getGoldenDesign(IHat hat) {
		HatDecorators golden = new GoldenHat(hat);
		return golden;
	}
	public static HatDecorators getRibbedDesign(IHat hat) {
		HatDecorators ribbed = new RibbedHat(hat);
		return ribbed;
	}
}
