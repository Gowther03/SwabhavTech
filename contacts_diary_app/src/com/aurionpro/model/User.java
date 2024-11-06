package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	private int userId;
	private String first_name;
	private String last_name;
	private boolean isActive;
	private ArrayList<Integer> contactIDs;
	private ArrayList<Contact> contacts;
	Scanner scanner;
	
	public User(int userId, String first_name, String last_name, boolean isActive, ArrayList<Integer> contactIDs, ArrayList<Contact> contacts) {
		this.userId = userId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.isActive = isActive;
		this.contactIDs = contactIDs;
		this.contacts = contacts;
	}
	public void removeContact(int contactID) {
		for(Contact contact : contacts) {
			if(contact.getContactID() == contactID) {
				contacts.remove(contacts.indexOf(contact));
				System.out.println("Contact Removed Successfully");
				return;
			}
		}
		System.out.println(ANSI_RED+"----Contact Not Found----"+ANSI_RESET);
	}
	public ArrayList<Integer> getContactIDList(){
		return contactIDs;
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	public void displayContactIDs() {
		System.out.println(contactIDs);
	}
	
	public void removeContactID(int contactID) {
		for(int id: contactIDs) {
			if(id == contactID) {
				contactIDs.remove(contactIDs.indexOf(contactID));
				break;
			}
		}
	}
	
	public void displayDetails() {
		System.out.print("\nActive: ");
		if(isActive == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		System.out.println("First Name: " + first_name);
		System.out.println("Last Name: " + last_name);
		System.out.println("<-----Contacts----->");
		for(Contact contact: contacts) {
			System.out.println("\nContact " + (contacts.indexOf(contact)+1) + " -->");
			contact.displayDetails();
		}
	}

	public int getUserId() {
		return userId;
	}
}
