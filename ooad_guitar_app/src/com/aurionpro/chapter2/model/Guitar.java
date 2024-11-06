package com.aurionpro.chapter2.model;

public class Guitar {
	private String serialNumber;
	private GuitarSpec spec;
	private double price;
	

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.spec = spec;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public double getPrice() {
		return price;
	}

	public GuitarSpec getSpec() {
		return spec;
	}
	
}
