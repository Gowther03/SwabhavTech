package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.InventoryService;
import com.aurionpro.model.Product;
import com.aurionpro.model.Supplier;
import com.aurionpro.model.Transaction;

public class InventoryTest {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		Inventory inventory = new Inventory();
		InventoryService service = new InventoryService(inventory);

		while(true) {
			System.out.print("Welcome to the Inventory Management System\r\n"
					+ "1. Product Management\r\n"
					+ "2. Supplier Management\r\n"
					+ "3. Transaction Management\r\n"
					+ "4. Save File Data\r\n"
					+ "5. Load File Data\r\n"
					+ "6. Generate Reports\r\n"
					+ "7. Exit\r\n"
					+ "Enter your choice: ");
			String choice = scanner.next();
			System.out.println();
			switch(choice) {
			case "1":
				productManagement(service);
				break;
			case "2":
				supplierManagement(service);
				break;
			case "3":
				transactionManagement(service);
				break;
			case "4":
				saveData(service);
				break;
			case "5":
				loadData(service);
				break;
			case "6":
				generateReport(service);
				break;
			case "7":
				System.out.println("Thank You!");
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}
			if(choice.equals("7")) {
				break;
			}
		}
	}
	
	public static void productManagement(InventoryService service) {
		System.out.print("1. Add Product\r\n"
				+ "2. Update Product\r\n"
				+ "3. Delete Product\r\n"
				+ "4. View Product Details\r\n"
				+ "5. View All Products\r\n"
				+ "Enter your choice: ");
		String choice = scanner.next();
		scanner.nextLine();
		System.out.println();
		switch(choice) {
		case "1":
			service.addProduct();
			break;
		case "2":
			boolean checkEmpty = service.showProductIDs();
			if(!checkEmpty) {
				service.updateProduct();
			}
			break;
		case "3":
			service.removeProduct();
			break;
		case "4":
			service.showProduct();
			break;
		case "5":
			if(!service.getInventory().getProducts().isEmpty()) {
				service.getInventory().showProducts();
			}else {
				System.out.println("None!");
			}
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
		
	}
	
	public static void supplierManagement(InventoryService service) {
		System.out.print("1. Add Supplier\r\n"
				+ "2. Update Supplier\r\n"
				+ "3. Delete Supplier\r\n"
				+ "4. View Supplier Details\r\n"
				+ "5. View All Suppliers\r\n"
				+ "Enter your choice: ");
		String choice = scanner.next();
		scanner.nextLine(); 
		System.out.println();
		switch(choice) {
		case "1":
			service.addSupplier();
			break;
		case "2":
			service.updateSupplier();
			break;
		case "3":
			service.removeSupplier();
			break;
		case "4":
			service.showSupplier();
			break;
		case "5":
			if(!service.getInventory().getSuppliers().isEmpty()) {
				service.getInventory().showSuppliers();
			}else {
				System.out.println("None!");
			}
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
	}
	
	public static void transactionManagement(InventoryService service){
		System.out.print("1. Add Stock\r\n"
				+ "2. Remove Stock\r\n"
				+ "3. View Transaction History\r\n"
				+ "Enter your choice: ");
		String choice = scanner.next();
		System.out.println();
		switch(choice) {
		case "1":
			service.addStock();
			break;
		case "2":
			service.removeStock();
			break;
		case "3":
			if(!service.getInventory().getTransactions().isEmpty()) {
				service.getInventory().showTransactions();
			}else {
				System.out.println("None!");
			}
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
	}
	
	public static void saveData(InventoryService service) {
		System.out.print("1. Products\r\n"
				+ "2. Suppliers\r\n"
				+ "3. Transactions\r\n"
				+ "Enter your choice: ");
		String choice = scanner.next();
		System.out.println();
		switch(choice) {
		case "1":
			for(Product product: service.getInventory().getProducts()) {
				service.saveData(product);
			}
			break;
		case "2":
			for(Supplier supplier: service.getInventory().getSuppliers()) {
				service.saveData(supplier);
			}
			break;
		case "3":
			for(Transaction transaction: service.getInventory().getTransactions()) {
				service.saveData(transaction);
			}
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
	}
	
	public static void loadData(InventoryService service) {
		service.loadData();
	}
	
	public static void generateReport(InventoryService service) {
		service.generateReport();
	}
}