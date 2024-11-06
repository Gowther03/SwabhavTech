package com.aurionpro.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.MobileNotValidException;
import com.aurionpro.test.NewUserTest;


public class DiaryService {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	private static String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	static Scanner scanner = new Scanner(System.in);

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
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
			}
		}
	}
	
	public static String checkEmail() 
	{
		while(true) {
			try {
				System.out.print("Enter Email: ");
				String emailId = scanner.next();
				if(!emailId.matches(emailRegex)) {
					throw new EmailNotValidException();
				}
				return emailId;
			}catch(EmailNotValidException exception) {
				System.out.println(exception.getMessage());
			}
		}
	}
	
	public static int codeGenerator() 
	{
		Random random = new Random();
		return (random.nextInt(500)+100);
	}
	
	public static void addContact(int userId, ArrayList<User> users, ArrayList<Integer> contactIDs) {
		for(User user: users) {
			if(user.getUserId() == userId) {
				user.addContact(NewUserTest.createContact(contactIDs));
				System.out.println(ANSI_GREEN+"----Contact Added Successfully----" + ANSI_RESET);
				return;
			}
		}
		System.out.println(ANSI_RED+"----User Not Found----" + ANSI_RESET);	
	}
	
	public static void findUser(int userId, ArrayList<User> users) 
	{
		for(User user: users) {
			if(user.getUserId() == userId) {
				user.displayDetails();
				System.out.println(ANSI_GREEN+"----User Fetched Successfully----" + ANSI_RESET);
				return;
			}
		}
		System.out.println(ANSI_RED+"----User Not Found----" + ANSI_RESET);
	}
	
	public static void findContact(int userId, ArrayList<User> users) 
	{
		for(User user: users) {
			if(user.getUserId() == userId) {
				user.displayContactIDs();
				return;
			}
		}
		System.out.println(ANSI_RED+"----User Not Found----" + ANSI_RESET);
	}
		
	public static void removeUser(int userId, ArrayList<User> users, ArrayList<Integer> userIDs) 
	{
		for(User user: users) {
			if(user.getUserId() == userId) {
				users.remove(users.indexOf(user));
				userIDs.remove(userIDs.indexOf(userId));
				System.out.println(ANSI_GREEN+"----User Removed Successfully----" + ANSI_RESET);				
				return;
			}
		}
		System.out.println(ANSI_RED+"----User Not Found----"+ANSI_RESET);
	}
	
	public static void removeContact(int userId,int contactId, ArrayList<User> users) 
	{
		for(User user: users) {
			if(user.getUserId() == userId) {
				user.removeContact(contactId);
				user.removeContactID(contactId);
				return;
			}
		}
		System.out.println(ANSI_RED+"----Not Present----"+ANSI_RESET);
	}
	
	public static HashMap<Integer, Integer> displayContacts(User temporaryUser) 
	{
		System.out.print("Contacts(IDs) Present for this ID are ---> ");
		HashMap<Integer, Integer> userContacts = new HashMap<>();
		int index =0;
		if(temporaryUser.getContactIDList().isEmpty()) {
			System.out.println("None");
			return userContacts;
		}
		for(Integer contactId : temporaryUser.getContactIDList()) {
			System.out.print((++index) + "." + contactId+" ");
			userContacts.put(index, contactId);
		}
		return userContacts;
	}
	
	public static void updateContact(HashMap<Integer, Integer> userContactIDs, User user)
	{
		scanner = new Scanner(System.in);
		String index;
		while(true) {
			try {
				System.out.print("\nEnter the Index No. of ContactId: ");
				index = scanner.next();
				if(Integer.parseInt(index)>userContactIDs.size()) {
					throw new IndexOutOfBoundsException();
				}
				break;
			}
			catch(NumberFormatException exception) {
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
			}
			catch (IndexOutOfBoundsException exception) {
				System.out.println(ANSI_RED+"----Incorrect Index Number----"+ANSI_RESET);
			}
		}
		System.out.print("\nEnter -> 1. Mobile, 2. Email to Update ---> ");
		String selection = scanner.next();
		switch(selection) {
		case "1":
			switch(askForThreeOptions()) {
			case "1":
				updateMobile("1", userContactIDs.get(Integer.parseInt(index)), user);
				break;
			case "2":
				updateMobile("2", userContactIDs.get(Integer.parseInt(index)), user);
				break;
			case "3":
				updateMobile("3", userContactIDs.get(Integer.parseInt(index)), user);
			default:
				System.out.println(ANSI_RED+"----Invalid Input----"+ANSI_RESET);
			}
			break;
		case "2":
			switch(askForThreeOptions()) {
			case "1":
				updateEmail("1", userContactIDs.get(Integer.parseInt(index)), user);
				break;
			case "2":
				updateEmail("2",userContactIDs.get(Integer.parseInt(index)), user);
				break;
			case "3":
				updateEmail("3", userContactIDs.get(Integer.parseInt(index)), user);
				break;
			default:
				System.out.println(ANSI_RED+"----Invalid Input----"+ANSI_RESET);
			}
			break;
		default:
			System.out.println(ANSI_RED+"----Invalid Input----"+ANSI_RESET);
			break;
		}		
	}
	
	public static String askForThreeOptions()
	{
		System.out.print("\nEnter -> 1. Remove, 2. Change, 3. Add---> ");
		String option = scanner.next();
		return option;
	}
	
	public static void updateMobile(String flag, int contactID, User user) 
	{
		HashMap<Integer, String> mobileMap = new HashMap<Integer, String>();
		for(Contact contact : user.getContacts()) {
			if(contact.getContactID() == contactID) {
				System.out.println("\nAvailable Numbers-->");
				int index = 0;
				for(ContactDetails contactDetails: contact.getContactDetails()) {
					if(contactDetails instanceof MobileContact) {
						System.out.println("\t"+(++index)+". "+contactDetails.getInfo());
						mobileMap.put(index, contactDetails.getInfo());
					}
				}
				String mobileIndex;
				while(true) {
					try {
						if(flag.equals("3")) {
							String newMobile = checkMobile();
							ContactDetails newContactDetails = new MobileContact(newMobile);
							contact.addContactDetail(newContactDetails);
							System.out.println("------------------------>Number Added Successfully!");
							break;
						}
						System.out.print("\nEnter Index No. to Update: ");
						mobileIndex = scanner.next();
						if(Integer.parseInt(mobileIndex) > 3) {
							throw new IndexOutOfBoundsException();
						}
						if(flag.equals("1")) {
							removeMobile(Integer.parseInt(mobileIndex), mobileMap, contact);
							System.out.println("------------------------>Number Removed Successfully!");
							break;
						}
						setMobile(Integer.parseInt(mobileIndex), mobileMap, contact);
						break;
					}
					catch(NumberFormatException exception) {
						System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
					}
					catch (IndexOutOfBoundsException exception) {
						System.out.println(ANSI_RED+"----Incorrect Index Number----"+ANSI_RESET);
					}
				}
				break;
			}
		}
	}
	
	public static void removeMobile(int index, HashMap<Integer, String> mobileMap, Contact contact) 
	{
		for(ContactDetails contactDetails: contact.getContactDetails()){
			if(contactDetails.getInfo() == mobileMap.get(index)) {
				if(contactDetails instanceof MobileContact) {
					contact.removeContactDetail(contactDetails);;
					return;
				}
			}
		}
	}
	
	public static void setMobile(int index, HashMap<Integer, String> mobileMap, Contact contact) 
	{
		for(ContactDetails contactDetails: contact.getContactDetails()) {
			if(contactDetails.getInfo() == mobileMap.get(index)) {
				
				while(true) {
					try {
						System.out.print("\n\tEnter the New Number: ");
						String number = scanner.next();
						if(number.length() != 10) {
							throw new MobileNotValidException("Mobile Number Should be of 10 Digits");
						}
						Long.parseLong(number);
						contactDetails.setInfo(number);
						System.out.println("------------------------>Number Changed Successfully!");
						break;
					}
					catch(MobileNotValidException exception) {
						System.out.println(exception.getMessage());
					}
					catch(NumberFormatException exception) {
						System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
					}
				}
				break;
			}
		}
	}
	
	public static void updateEmail(String flag,int contactID, User user) 
	{
		HashMap<Integer, String> emailMap = new HashMap<Integer, String>();
		for(Contact contact : user.getContacts()) {
			if(contact.getContactID() == contactID) {
				System.out.println("\nAvailable Email IDs-->");
				int index = 0;
				for(ContactDetails contactDetails: contact.getContactDetails() ){
					if(contactDetails instanceof EmailContact) {
						System.out.println("\t"+(++index)+". "+contactDetails.getInfo());
						emailMap.put(index, contactDetails.getInfo());
					}
				}
				String emailIndex;
				while(true) {
					try {
						if(flag.equals("3")) {
							String newEmail = checkEmail();
							ContactDetails newContactDetails = new EmailContact(newEmail);
							contact.addContactDetail(newContactDetails);
							System.out.println("------------------------>Email Added Successfully!");
							break;
						}
						System.out.print("\nEnter Index No. to Update: ");
						emailIndex = scanner.next();
						if(Integer.parseInt(emailIndex) > 3) {
							throw new IndexOutOfBoundsException();
						}
						if(flag.equals("1")) {
							removeEmail(Integer.parseInt(emailIndex), emailMap, contact);
							System.out.println("------------------------>Email Removed Successfully!");
							break;
						}
						setEmail(Integer.parseInt(emailIndex), emailMap, contact);
						break;
					}
					catch(NumberFormatException exception) {
						System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
					}
					catch (IndexOutOfBoundsException exception) {
						System.out.println(ANSI_RED+"----Incorrect Index Number----"+ANSI_RESET);
					}
					
				}
				break;
			}
		}
	}
	
	public static void removeEmail(int index, HashMap<Integer, String> mobileMap, Contact contact) 
	{
		for(ContactDetails contactDetails: contact.getContactDetails()){
			if(contactDetails.getInfo() == mobileMap.get(index)) {
				if(contactDetails instanceof EmailContact) {
					contact.removeContactDetail(contactDetails);;
					return;
				}
			}
		}
	}
	
	public static void setEmail(int index, HashMap<Integer, String> emailMap, Contact contact) 
	{
		for(ContactDetails contactDetails: contact.getContactDetails()) {
			if(contactDetails.getInfo() == emailMap.get(index)) {
				
				while(true) {
					try {
						System.out.print("\n\tEnter the New Email: ");
						String email = scanner.next();
						if(!email.matches(emailRegex)) {
							throw new EmailNotValidException();
						}
						contactDetails.setInfo(email);
						System.out.println("------------------------>Email Changed Successfully!");
						break;
					}catch(EmailNotValidException exception) {
						System.out.println(exception.getMessage());
					}
				}
				break;
			}
		}
	}
}
