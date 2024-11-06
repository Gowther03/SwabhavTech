package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Product> products = new ArrayList<Product>();
	private List<Supplier> suppliers = new ArrayList<Supplier>();
	private List<Transaction> transactions = new ArrayList<Transaction>();
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void showProducts() {
		System.out.println("Products Available: ");
		for(Product product : products){
			
			product.showDetails();
			System.out.println("--------------------------");
		}
	}
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	
	public void showSuppliers() {
		System.out.println("Suppliers Available: ");
		for(Supplier supplier : suppliers){
			
			supplier.showDetails();
			System.out.println("--------------------------");
		}
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void showTransactions() {
		System.out.println("Transactions History: ");
		for(Transaction transaction : transactions){
			
			transaction.showDetails();
			System.out.println("--------------------------");
		}
	}
	
	
}
