package com.aurionpro.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Supplier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int supplierId;
	private String name;
	private List<Product> products = new ArrayList<Product>();
	private String contact;
	
	public Supplier(int supplierId, String name, List<Product> products, String contact) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.products = products;
		this.contact = contact;
	}
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void showDetails() {
		System.out.print("\nSupplier ID: " + supplierId
				+ "\nSupplier Name: " +  name
				+ "\nContact: " + contact
				+ "\nProducts: \n");
		if(!products.isEmpty()) {
			for(Product product: products) {
				System.out.println("\t\t" + product.getName());
			}
		}else {
			System.out.println("\t\tNo Products Available!");
		}
		
	}
	

}