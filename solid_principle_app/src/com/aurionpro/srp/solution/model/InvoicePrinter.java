package com.aurionpro.srp.solution.model;

public class InvoicePrinter {
	
	public void printInvoice(Invoice invoice, TaxCalculator calculate) {
		System.out.println("\nInvoice Details");
		System.out.println("Invoice Id: " + invoice.getInvoiceId());
		System.out.println("Name: " + invoice.getName());
		System.out.println("Tax Amount: " + calculate.calculateTaxAmount(invoice));
		System.out.println("Amount: " + (invoice.getAmount() + calculate.calculateTaxAmount(invoice)));
	}
}
