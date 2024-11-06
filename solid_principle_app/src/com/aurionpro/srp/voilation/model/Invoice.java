package com.aurionpro.srp.voilation.model;

public class Invoice {
	public Invoice(int invoiceId, String name, double amount, double taxPercent) {
		super();
		this.invoiceId = invoiceId;
		this.name = name;
		this.amount = amount;
		this.taxPercent = taxPercent;
	}
	private int invoiceId;
	private String name;
	private double amount;
	private double taxPercent;
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}
	
	public double calculateTaxAmount() {
		return ((amount)*taxPercent/100);
	}
	public void printInvoice() {
		System.out.println("Invoice Id: " + invoiceId);
		System.out.println("Name: " + invoiceId);
		System.out.println("Amount: " + amount);
		System.out.println("Tax Added: " + calculateTaxAmount());
		System.out.println("Total: " + (amount+calculateTaxAmount()));
	}
}
