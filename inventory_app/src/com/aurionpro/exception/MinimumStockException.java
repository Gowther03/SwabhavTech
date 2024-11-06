package com.aurionpro.exception;

import com.aurionpro.model.Product;

public class MinimumStockException extends RuntimeException {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	private Product product;
	private int quantity;
	public MinimumStockException(Product product, int quantity){
		this.product = product;
		this.quantity = quantity;
	}
	public String getMessage() {
		return ANSI_RED+"----"+"Insufficient Stocks!----\n---->Your Requested Transaction Quantity: "+quantity+"\nAvailable "+product.getName()+" stock: "+product.getQuantity()+"<----"+ANSI_RESET;
	}
	
}
