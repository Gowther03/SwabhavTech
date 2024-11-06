package com.aurionpro.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.exception.MinimumStockException;
import com.aurionpro.exception.MobileNotValidException;
import com.aurionpro.exception.NegativeValueException;

public class InventoryService {
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();
	private Inventory inventory;
	private  String ANSI_RESET = "\u001B[0m";
	private  String ANSI_RED = "\u001B[31m";
	private List<Integer> supplierIDs = new ArrayList<Integer>();
	private List<Integer> productIDs = new ArrayList<Integer>();
	private List<INotifier> notifiers = new ArrayList<INotifier>();
	
	public InventoryService(Inventory inventory) {
		this.inventory = inventory;
		this.notifiers.add(new Email());
		this.notifiers.add(new SMS());
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public Product createProduct(Supplier supplier) {
		int productId = idGenerator();
		productIDs.add(productId);
		System.out.print("Product Name: ");
		String name = scanner.nextLine();
		int quantity = checkQuantity();
		double price = checkPrice();
		scanner.nextLine();
		System.out.print("Description: ");
		String desc = scanner.nextLine();
		Product product = new Product(productId, name, desc, quantity, price);
		
		if(supplier == null) {
			System.out.print("Have a Supplier?(y/n): ");
			String choice = scanner.next();
			scanner.nextLine();
			if(choice.equals("y")) {
				showSupplierIDs();
				if(inventory.getSuppliers().isEmpty()) {
					System.out.print("Want to Add a new Supplier?(y/n) ");
					String addNew = scanner.next();
					scanner.nextLine();
					if(addNew.equals("y")) {
						Supplier newSupplier = createSupplier();
						newSupplier.getProducts().add(product);
						product.setSupplier(newSupplier);
						System.out.println("------>Supplier Added Succesfully<------\n");
					}else {
						System.out.println("------>Supplier Set as Admin<------\n");
					}
				}else {
					int supplierId = supplierIdCheck();			
					for(Supplier existingSupplier : inventory.getSuppliers()) {
						if(existingSupplier.getSupplierId() == supplierId) {
							product.setSupplier(existingSupplier);
							break;
						}
					}
				}	
			}
		}else {
			product.setSupplier(supplier);
		}
		return product;
	}
	
	public Supplier createSupplier() {
		int supplierId = idGenerator();
		supplierIDs.add(supplierId);
		System.out.print("Supplier Name: ");
		String name = scanner.nextLine();
		String contact = contactCheck();
		Supplier supplier = new Supplier(supplierId, name, new ArrayList<Product>(), contact);
		
		System.out.print("Want to Add Products Now?(y/n): ");
		String choice = scanner.next();
		scanner.nextLine(); 
		if(choice.equals("y")) {
			while(true) {
				System.out.println();
				Product product = createProduct(supplier);
				supplier.getProducts().add(product);
				inventory.getProducts().add(product);
				System.out.print("More Products?(y/n): ");
				String more = scanner.next();
				scanner.nextLine(); 
				if(more.equals("n")) {
					System.out.println("------>All Products Added Succesfully<------\n");
					break;
				}
			}
		}
		inventory.getSuppliers().add(supplier);
		return supplier;	
	}
	
	public void addProduct() {
		Product product = createProduct(null);
		inventory.getProducts().add(product);
		System.out.println("------>Product Added Succesfully<------\n");
	}
	
	public void removeProduct() {
		System.out.print("Admin/Supplier(1/2): ");
		String choice = scanner.next();
		switch(choice) {
		case "1": 
			boolean checkProductsEmpty = showProductIDs();
			if(!checkProductsEmpty) {
				int productId = productIdCheck();
				for(Product product : inventory.getProducts()){
					if(product.getProductId() == productId) {
						inventory.getProducts().remove(inventory.getProducts().indexOf(product));
						break;
					}
				}
			}
			break;
		case "2":
			boolean checkSuppliersEmpty = showSupplierIDs();
			if(!checkSuppliersEmpty) {
				int supplierId = supplierIdCheck();
				for(Supplier supplier : inventory.getSuppliers()) {
					if(supplier.getSupplierId() == supplierId) {
						System.out.println("Products Available: ");
						for(Product product : supplier.getProducts()){
							System.out.println("\t\t" + product.getName() + " [" + product.getProductId() + "]");
						}
						
						int supplierProductId = productIdCheck();
						for(Product product : supplier.getProducts()){
							if(product.getProductId() == supplierProductId) {
								supplier.getProducts().remove(supplier.getProducts().indexOf(product));
								break;
							}
						}
						for(Product product : inventory.getProducts()){
							if(product.getProductId() == supplierProductId) {
								inventory.getProducts().remove(inventory.getProducts().indexOf(product));
								break;
							}
						}
					}
				}
			}
			break;
		default:
			System.out.println("------>Invalid Choice!<------\n");
			break;
		}
		System.out.println("------>Product Removed Succesfully<------\n");
	}
	
	public void showProduct() {
		boolean checkProductsEmpty = showProductIDs();
		if(!checkProductsEmpty) {
			int productId = productIdCheck();
			for(Product product : inventory.getProducts()){
				if(product.getProductId() == productId) {
					product.showDetails();
					System.out.println("------>Product Fetched Succesfully<------\n");
					return;
				}
			}
		}
	}
	
	public void updateProduct() {
		int productId = productIdCheck();
		for(Product product : inventory.getProducts()){
			if(product.getProductId() == productId) {
				System.out.print("1. Name\r\n"
						+ "2. Description\r\n"
						+ "3. Quantity\r\n"
						+ "4. Price\r\n"
						+ "5. Supplier\r\n"
						+ "Enter your choice: ");
				String choice = scanner.next();
				scanner.nextLine();
				switch(choice) {
				case "1":
					System.out.println("Existing Name: " + product.getName());
					System.out.print("New Name: ");
					String newName = scanner.nextLine();
					product.setName(newName);
					break;
				case "2":
					System.out.println("Existing Description: " + product.getDescription());
					System.out.print("New Description: ");
					String newDescription = scanner.nextLine();
					product.setDescription(newDescription);
					break;
				case "3":
					System.out.println("Existing Quantity: " + product.getQuantity());
					int newQuantity = checkQuantity();
					product.setQuantity(newQuantity);
					break;
				case "4":
					System.out.println("Existing Price: " + product.getPrice());
					double newPrice = checkPrice();
					product.setPrice(newPrice);
					break;
				case "5":
					System.out.print("Existing Supplier: ");
					if(product.getSupplier()==null){
						System.out.println("Admin");
					}else {
						System.out.println(product.getSupplier().getName());
						inventory.getSuppliers().remove(inventory.getSuppliers().indexOf(product.getSupplier()));
					}
					System.out.println("Enter New Supplier Details: ");
					Supplier newSupplier = createSupplier();
					product.setSupplier(newSupplier);
					newSupplier.getProducts().add(product);
					break;
				default:
					System.out.println("------>Invalid Choice!<------\n");
				}
				System.out.println("------>Changes Saved Succesfully!<------\n");
				break;
			}
		}
	}
	
	public void addSupplier() {
		createSupplier();
		System.out.println("------>Supplier Added Succesfully<------\n");
	}
	
	public void removeSupplier() {
		boolean checkEmpty = showSupplierIDs();
		if(!checkEmpty) {
			int supplierId = supplierIdCheck();
			for(Supplier supplier : inventory.getSuppliers()) {
				if(supplier.getSupplierId() == supplierId) {
					inventory.getSuppliers().remove(inventory.getSuppliers().indexOf(supplier));
					return;
				}
			}
			System.out.println("------>Supplier Removed Succesfully<------\n");
		}
	}
	
	public void updateSupplier() {
		boolean checkEmpty = showSupplierIDs();
		if(!checkEmpty) {
			int supplierId = supplierIdCheck();
			for(Supplier supplier : inventory.getSuppliers()){
				if(supplier.getSupplierId() == supplierId) {
					System.out.print("1. Name\r\n"
							+ "2. Contact\r\n"
							+ "3. Product\r\n"
							+ "Enter your choice: ");
					String choice = scanner.next();
					scanner.nextLine();
					switch(choice) {
					case "1":
						System.out.println("Existing Name: " + supplier.getName());
						System.out.print("New Name: ");
						String newName = scanner.nextLine();
						supplier.setName(newName);
						break;
					case "2":
						System.out.println("Existing Contact: " + supplier.getContact());
						System.out.println("------>Enter New Contact");
						String newContact = contactCheck();
						supplier.setContact(newContact);
						break;
					case "3":
						System.out.print("1. Delete\r\n"
								+ "2. Update\r\n"
								+ "3. Add New\r\n"
								+ "Enter your choice: ");
						String productChoice = scanner.next();
						scanner.nextLine();
						System.out.print("Existing Products: ");
						if(supplier.getProducts().isEmpty()){
							System.out.println("None");
							return;
						}else {
							for(Product product: supplier.getProducts()) {
								System.out.println("\t\t" + product.getName() + " [" + product.getProductId() + "]");
							}
							switch(productChoice) {
							case "1":
								int supplierProductId = productIdCheck();
								for(Product product : supplier.getProducts()){
									if(product.getProductId() == supplierProductId) {
										supplier.getProducts().remove(supplier.getProducts().indexOf(product));
										break;
									}
								}
								for(Product product : inventory.getProducts()){
									if(product.getProductId() == supplierProductId) {
										inventory.getProducts().remove(inventory.getProducts().indexOf(product));
										break;
									}
								}
								break;
							case "2":
								updateProduct();
								break;
							case "3":
								Product newProduct = createProduct(supplier); 
								inventory.getProducts().add(newProduct);
							default:
								System.out.println("------>Invalid Choice!<------\n");
								break;
							}
						}
						break;
					default:
						System.out.println("------>Invalid Choice!<------\n");
						break;
					}
					System.out.println("------>Changes Saved Succesfully!<------\n");
					break;
				}
			}
		}
	}
	
	public void showSupplier() {
		boolean checkEmpty = showSupplierIDs();
		if(!checkEmpty) {
			int supplierId = supplierIdCheck();
			
			for(Supplier supplier : inventory.getSuppliers()) {
				if(supplier.getSupplierId() == supplierId) {
					supplier.showDetails();
					System.out.println("------>Supplier Fetched Succesfully<------\n");
					return;
				}
			}
		}	
	}
	
	public void addStock(){
		boolean checkEmpty = showProductIDs();
		if(!checkEmpty) {
			int productId = productIdCheck();
			int transactionId = idGenerator();
			for(Product product : inventory.getProducts()){
				if(product.getProductId() == productId) {
					int quantity = stockCheck(product);
					product.addQuantity(quantity);
					Date date;
					while(true) {
						System.out.print("Enter transaction Date(yyyy-mm-dd): ");
						String dateString = scanner.next();
						SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
						try {
							date = formatter.parse(dateString);
							break;
						} catch (ParseException exception) {
							System.out.println(ANSI_RED+"----Date Format Not Valid----"+ANSI_RESET);
						}	
					}
					Transaction transaction = new Transaction(transactionId, date, quantity, "Stock Added", product);
					inventory.getTransactions().add(transaction);
					notifications(transaction, false, "none");
					return;
				}
			}
		}
	}
	
	public void removeStock(){
		boolean checkEmpty = showProductIDs();
		if(!checkEmpty) {
			int productId = productIdCheck();
			int transactionId = idGenerator();
			for(Product product : inventory.getProducts()){
				if(product.getProductId() == productId) {
					int quantity = stockCheck(product);
					product.removeQuantity(quantity);
					Date date;
					while(true) {
						System.out.print("Enter transaction Date(yyyy-mm-dd): ");
						String dateString = scanner.next();
						SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
						try {
							date = formatter.parse(dateString);
							break;
						} catch (ParseException exception) {
							System.out.println(ANSI_RED+"----Date Format Not Valid----"+ANSI_RESET);
						}	
					}
					Transaction transaction = new Transaction(transactionId, date, quantity, "Stock Removed", product);
					inventory.getTransactions().add(transaction);
					notifications(transaction, false, "none");
					return;
				}
			}
		}
	}
	
	public void saveData(Serializable object) {
		ObjectFileSaver.saveObjectToFile(object, "new_inventory_data.txt");
		System.out.println("------>Saved to File Succesfully<------\n");
	}
	
	public void loadData() {
		ObjectFileSaver.readObjectsFromFile("new_inventory_data.txt");
		System.out.println("------>Loaded Succesfully<------\n");
	}
	
	public void generateReport() {
		System.out.println("----------->Report<----------");
		System.out.println("\nSuppliers: ");
		if(inventory.getSuppliers().isEmpty()) {
			System.out.println("None!");
		}
		for(Supplier supplier: inventory.getSuppliers()) {
			System.out.println("\t\t"+supplier.getName()+ " [" + supplier.getSupplierId() + "]");
		}
		System.out.println("Sr.\tID\tName\tPrice\tQuantity");
		int index = 0;
		int totalQuantity = 0;
		double totalPrice = 0;
		for(Product product: inventory.getProducts()) {
			System.out.println((++index) + "\t" + product.getProductId() + "\t" + product.getName() + "\t" + product.getPrice() + "\t" + product.getQuantity());
			totalQuantity+=product.getQuantity();
			totalPrice+=(product.getPrice()*product.getQuantity());
		}
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("Total Products: " + index );
		System.out.println("Total Stock Quantity: " + totalQuantity);
		System.out.println("Total Stock Value: " + totalPrice +"\n");
	}
	
	public boolean showSupplierIDs() {
		System.out.println("Suppliers Available: ");
		if(!inventory.getSuppliers().isEmpty()) {
			for(Supplier supplier : inventory.getSuppliers()) {
				System.out.println("\t\t" + supplier.getName() + " [" + supplier.getSupplierId() + "]");
			}
		}else {
			System.out.println("\t\tNone");
			return true;
		}
		return false;
	}
	
	public boolean showProductIDs() {
		System.out.println("Products Available: ");
		if(!inventory.getProducts().isEmpty()) {
			for(Product product : inventory.getProducts()){
				System.out.println("\t\t" + product.getName() + " [" + product.getProductId() + "]");
			}
		}else {
			System.out.println("\t\tNone");
			return true;
		}
		return false;
	}
	
	public String contactCheck() {
		String contact;
		while(true) {
			try {
				System.out.print("Contact: ");
				contact = scanner.next();
				if(contact.length()<10) {
					throw new MobileNotValidException("Number Should Be Of 10 Digits");
				}
				Long.parseLong(contact);
				break;
			}
			catch(MobileNotValidException exception) {
				System.out.println(exception.getMessage());
			}
			catch(NumberFormatException exception) {
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
			}
		}
		return contact;
	}
	
	public int checkQuantity() {
		while(true) {
			try {
				System.out.print("Quantity: ");
				int quantity = scanner.nextInt();
				if(quantity<0) {
					throw new NegativeValueException();
				}
				return quantity;
			}
			catch(NegativeValueException exception) {
				System.out.println(exception.getMessage());
			}
			catch(InputMismatchException exception) {
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
				scanner.nextLine();
			}
		}
	}
	
	public double checkPrice() {
		while(true) {
			try {
				System.out.print("Price: ");
				double price = scanner.nextDouble();
				
				if(price<0) {
					throw new NegativeValueException();
				}
				return price;
			}catch(NegativeValueException exception) {
				System.out.println(exception.getMessage());
			}catch(InputMismatchException exception) {
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
				scanner.nextLine();
			}
		}
	}
	
	public int stockCheck(Product product) {
		while(true) {
			try {
				System.out.print("Enter Stock Quantity: ");
				int quantity = scanner.nextInt();
				if(quantity <0) {
					throw new NegativeValueException();
				}
				if((product.getQuantity() - quantity) < 0) {
					throw new MinimumStockException(product, quantity);
				}
				return quantity;
			}catch(MinimumStockException exception) {
				notifications(null,true,exception.getMessage());
			}catch(InputMismatchException exception) {
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
				scanner.nextLine();
			}catch(NegativeValueException exception) {
				System.out.println(exception.getMessage());
			}
		}
	}
	
	public void notifications(Transaction transaction, boolean isException, String message) {
		System.out.println();
		for(INotifier notifier: notifiers) {
			notifier.showMessage(transaction, isException, message);
		}
	}
	
	public int supplierIdCheck() {
		while(true) {
			try {
				System.out.print("Enter Id: ");
				int id = scanner.nextInt();
				if(supplierIDs.contains(id)) {
					return id;
				}else {
					System.out.println(ANSI_RED+"------ID Not valid!------"+ANSI_RESET);
				}
			}catch(InputMismatchException exception) {
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
				scanner.nextLine();
			}
		}
	}
	
	public int productIdCheck() {
		while(true) {
			try {
				System.out.print("Enter Id: ");
				int id = scanner.nextInt();
				if(productIDs.contains(id)) {
					return id;
				}else {
					System.out.println(ANSI_RED+"------ID Not valid!------"+ANSI_RESET);
				}
			}catch(InputMismatchException exception) {
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
				scanner.nextLine();
			}
		}
	}
	
	public int idGenerator() {
		int id = random.nextInt(500) + 100;
		return id;
	}
}