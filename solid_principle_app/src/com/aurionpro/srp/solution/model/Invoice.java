package com.aurionpro.srp.solution.model;

public class Invoice {
	private int invoiceId;
	private String name;
	private double amount;
	private double taxPercent;
	
	public Invoice(int invoiceId, String name, double amount, double taxPercent){
		this.invoiceId = invoiceId;
		this.name = name;
		this.amount = amount;
		this.taxPercent = taxPercent;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public double getTaxPercent() {
		return taxPercent;
	}
	
}
