package com.aurionpro.model;

import java.util.ArrayList;


public class Contact {
	private int contactId;
	private String first_name;
	private String last_name;
	private ContactType contactType;
	private ArrayList<ContactDetails> details;

	public Contact(int contactId, String first_name, String last_name,ContactType contactType,ArrayList<ContactDetails> details) {
		this.contactId = contactId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.details = details;
		this.contactType = contactType;
	}
	
	public int getContactID() {
		return contactId;
	}
	
	public ArrayList<ContactDetails> getContactDetails() {
		return details;
	}
	
	public void addContactDetail(ContactDetails contactDetail) {
		details.add(contactDetail);
	}
	
	public void removeContactDetail(ContactDetails contactDetail) {
		details.remove(details.indexOf(contactDetail));
	}
	
	public void displayDetails() {
		System.out.println("\tID: " + contactId);
		System.out.println("\tContact Type: " + contactType);
		System.out.println("\tFirst Name: " + first_name);
		System.out.println("\tLast Name: " + last_name);
		System.out.println("\tMobile: ");
		for(ContactDetails contact: details) {
			if(contact instanceof MobileContact) {
				System.out.println("\t\t" + contact.getInfo());
			}
		}
		System.out.println("\tEmail: ");
		for(ContactDetails contact: details) {
			if(contact instanceof EmailContact) {
				System.out.println("\t\t"+contact.getInfo());
			}
		}
		System.out.println("--------------------------------------");
	}
}
