package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

import com.aurionpro.exceptions.MobileNotValidException;
import com.aurionpro.model.Cart;
import com.aurionpro.model.ListItem;
import com.aurionpro.model.Product;
import com.aurionpro.model.User;

public class UserTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		System.out.println("Cart App");
		int flag = 1;
		while(flag == 1) {
			flag = takeInput(users, flag);
		}
	}
	
	public static int takeInput(ArrayList<User> users, int flag) {
		System.out.print("\n1. Add User, 2. Show Bill, 3.Quit--->");
		String input = scanner.next();
		switch(input) {
		case "1": 
			users.add(addUser());
			
			return 1;
		case "2":
			System.out.println("Enter User ID: ");
			int userId = scanner.nextInt();
			showBill(userId, users);
			return 1;
		case "3":
			System.out.println("Thank you");
			return 0;
		default: 
			System.out.println("Invalid Input!");
			return 1;
		}
	}
	
	public static User addUser() {
		int userId = randomNumberSupplier.get();
		System.out.print("User name: ");
		String name = scanner.next();
		System.out.print("Phone No.: ");
		String phone = checkMobile();
		ArrayList<Cart> carts = new ArrayList<Cart>();
		while(true) {
			carts.add(createCart());
			System.out.print("More Cart?(0. No): ");
			String more = scanner.next();
			if(more.equals("0")) {
				break;
			}
		}
		System.out.println("Order Completed Successfully for " + name + "[" + userId + "]");
		User user = new User(userId, name, phone, carts);
		
		return user;
	}
	public static String checkMobile() {
		String mobileNo;
		while(true) {
			try {
				System.out.print("Enter Mobile No.: ");
				mobileNo = scanner.next();
				if(mobileNo.length() != 10) {
					throw new MobileNotValidException("Mobile Number Should be of 10 Digits");
				}
				Long.parseLong(mobileNo);
				return mobileNo;
			}
			catch(MobileNotValidException exception) {
				System.out.println(exception.getMessage());
			}
			catch(NumberFormatException exception) {
				System.out.println("----Only Integers(Numbers) are allowed----");
			}
		}
	}
	
	public static Supplier<Integer> randomNumberSupplier = ()->{
		return (new Random()).nextInt(500) + 100;
	};
	
	public static Cart createCart() {
		ArrayList<ListItem> lines = new ArrayList<ListItem>();
		Date date = new Date();
		int cartId = randomNumberSupplier.get();
		int productCount = 0;
		while(true) {
			productCount++;
			lines.add(putProduct(productCount));
			System.out.print("More product?(0. No): ");
			String more = scanner.next();
			if(more.equals("0")) {
				break;
			}
		}
		System.out.println("\nCart Filled Successfully!");
		return new Cart(cartId, lines, date, productCount);
	}
	
	public static ListItem putProduct(int productCount) {
		System.out.println("\nProduct No. " + productCount + ": ");
		int lineId = randomNumberSupplier.get();
		int productId = randomNumberSupplier.get();
		System.out.print("Product Name: ");
		String productName = scanner.next();
		System.out.print("Product Price: ");
		double price = scanner.nextDouble();
		System.out.print("Quantity: ");
		int quantity = scanner.nextInt();
		System.out.println("\nProduct Added Succesfully!");
		return new ListItem(lineId, new Product(productId,productName,price), quantity);
	}
	
	public static void showBill(int userId, ArrayList<User> users) {
		for(User user: users) {
			if(user.getUserId() == userId) {
				System.out.println("\nBill Details: ");
				user.displayUserBill();
				return;
			}
		}
		System.out.println("User Not Found!");
	}
}
