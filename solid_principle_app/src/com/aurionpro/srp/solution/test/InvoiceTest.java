package com.aurionpro.srp.solution.test;

import java.util.Scanner;

import com.aurionpro.srp.solution.model.InvoicePrinter;
import com.aurionpro.srp.solution.model.TaxCalculator;
import com.aurionpro.srp.solution.model.Invoice;

public class InvoiceTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Id: ");
		int invoiceId = scanner.nextInt();
		System.out.print("Enter Name: ");
		String name = scanner.next();
		System.out.print("Enter Amount: ");
		double amount = scanner.nextDouble();
		System.out.print("Tax Percent: ");
		double taxPercent = scanner.nextInt();
		Invoice invoice = new Invoice(invoiceId, name, amount, taxPercent);
		TaxCalculator calculate = new TaxCalculator();
		InvoicePrinter printer = new InvoicePrinter();
		printer.printInvoice(invoice, calculate);
	}

}
