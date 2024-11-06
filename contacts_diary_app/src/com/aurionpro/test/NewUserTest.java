package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.aurionpro.model.Contact;
import com.aurionpro.model.ContactDetails;
import com.aurionpro.model.ContactType;
import com.aurionpro.model.DiaryService;
import com.aurionpro.model.EmailContact;
import com.aurionpro.model.MobileContact;
import com.aurionpro.model.User;

public class NewUserTest {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	static int flag = 1;
	static Scanner scanner;
	public static void main(String[] args) throws NumberFormatException
	{
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<Integer> userIDs = new ArrayList<Integer>();
		ArrayList<Integer> contactIDs = new ArrayList<Integer>();
		scanner = new Scanner(System.in);
		System.out.println("----Contacts Diary----");
		while(flag == 1) {
			try {
				System.out.print("\n\n1.Add , 2.Display, 3.Remove, 4.Update, 5.Quit: ");
				int input = scanner.nextInt();
				flag = takeInput(input, users, userIDs, contactIDs);
			}
			catch(NumberFormatException exception) {
				System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
			}
		}
	}
	
	public static int takeInput(int input, ArrayList<User> users, ArrayList<Integer> userIDs, ArrayList<Integer> contactIDs) throws NumberFormatException
	{
		scanner = new Scanner(System.in);
		int userId = 0;
		switch(input) {
		case 1 :
			System.out.print("\n1.Add User, 2.Add Contact: ");
			String addInput = scanner.next();
			switch(addInput) {
			case "1":
				System.out.println("\nUser Details-->");
				User user = createUser(userIDs, contactIDs);
				users.add(user);
				System.out.println(ANSI_GREEN+"----User Saved Successfully----" + ANSI_RESET);
				return 1;
			case "2":
				System.out.println("User Ids present-> "+userIDs);
				System.out.print("\nEnter User ID-->");
				userId = scanner.nextInt();
				DiaryService.addContact(userId, users, contactIDs);
				return 1;
			default:
				System.out.println(ANSI_RED+"----Invalid Input----"+ANSI_RESET);
				return 1;
			}
		case 2:
			while(true) {
				try {
					System.out.println("User Ids present-> "+userIDs);
					System.out.print("\nEnter User ID-->");
					userId = scanner.nextInt();
					DiaryService.findUser(userId, users);
					break;
				}
				catch(NumberFormatException exception) {
					System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
				}
			}
			return 1;
		case 3:
			System.out.print("\n1.Remove User, 2.Remove Contact: ");
			String removeInput = scanner.next();
			switch(removeInput) {
			case "1":
				System.out.println("User Ids present-> "+userIDs);
				while(true) {
					try {
						System.out.print("\nEnter User ID-->");
						userId = scanner.nextInt();
						DiaryService.removeUser(userId, users, userIDs);
						break;
					}
					catch(NumberFormatException exception) {
						System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
					}
				}
				System.out.print("\nUsers Present--> ");
				System.out.print(userIDs);
				return 1;
			case "2":
				System.out.println("User Ids present-> "+userIDs);
				while(true) {
					try {
						System.out.print("\nEnter User ID-->");
						userId = scanner.nextInt();
						for(int id: userIDs) {
							if(id == userId) {
								System.out.print("\nContacts Present-> ");
								DiaryService.findContact(userId, users);
								System.out.print("\nEnter Contact ID-->");
								int contactId = scanner.nextInt();
								DiaryService.removeContact(userId, contactId, users);
								System.out.print("\nContacts Present-->");
								DiaryService.findContact(userId, users);
								return 1;
							}
						}
						System.out.println(ANSI_RED+"----User Not Found----" + ANSI_RESET);
						return 1;
						
					}
					catch(NumberFormatException exception) {
						System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
					}
				}
			default:
				System.out.println(ANSI_RED+"----Invalid Input----"+ANSI_RESET);
				return 1;
			}
		case 4:
			System.out.println("User Ids present-> "+userIDs);
			while(true) {
				try {
					System.out.print("\nEnter User ID-->");
					userId = scanner.nextInt();
					for(User temporaryUser: users) {
						if(temporaryUser.getUserId() == userId) {
							HashMap<Integer, Integer> userContactIDs =DiaryService.displayContacts(temporaryUser);
							if(userContactIDs.isEmpty()) {
								return 1;
							}
							DiaryService.updateContact(userContactIDs, temporaryUser);
							return 1;
						}
					}
					System.out.println(ANSI_RED+"----User Not Found----"+ANSI_RESET);
					break;
				}
				catch(NumberFormatException exception) {
					System.out.println(ANSI_RED+"----Only Integers(Numbers) are allowed----"+ANSI_RESET);
				}
			}
			return 1;
		case 5:
			System.out.println("Thank You!");
			return 0;
		default:
			System.out.println(ANSI_RED+"----Invalid Input----"+ANSI_RESET);
			return 1;
		}
	}
	public static User createUser(ArrayList<Integer> userIDs, ArrayList<Integer> contactIDs)
	{
		ArrayList<Contact> contacts = new ArrayList<>();
		scanner = new Scanner(System.in);
		int userID = 0;
		String first_name = null;
		String last_name = null;
		boolean isActive = true;
		userID = DiaryService.codeGenerator();
		userIDs.add(userID);
		System.out.print("First Name: ");
		first_name = scanner.nextLine();
		System.out.print("Last Name: ");
		last_name = scanner.nextLine();
		System.out.print("Active(0 -> No): ");
		String active = scanner.next();
		if(active.equals("0")) {
			isActive = false;
		}
		while(true) {
			contacts.add(createContact(contactIDs));
			System.out.print("-------->Add More Contact Details?(0 -> No): ");
			String extra = scanner.next();
			if(extra.equalsIgnoreCase("0")) {
				break;
			}
		}
		return new User(userID, first_name, last_name, isActive, contactIDs, contacts);	
	}
public static Contact createContact(ArrayList<Integer> contactIDs) {
		
		System.out.println("\nEnter Contact Details: ");
		int contactID = 0;
		contactID = DiaryService.codeGenerator();
		contactIDs.add(contactID);
		Contact contact = contactDetail(contactID);
		return contact;
	}
	
	public static Contact contactDetail(int contactID) throws NumberFormatException 
	{
		scanner = new Scanner(System.in);
		int mobileCounter = 0;
		int emailCounter = 0;
		String first_name = null;
		String last_name = null;
		ContactType contactType = ContactType.Mobile;
		System.out.print("First Name: ");
		first_name = scanner.nextLine();
		System.out.print("Last Name: ");
		last_name = scanner.nextLine();
		ArrayList <ContactDetails> details = new ArrayList<>();
		while(true) {
			System.out.print("\nEnter Contact Type(1. Mobile, 2.Email): ");
			String type = scanner.next();
			ContactDetails contactDetails;
			switch(type) {
			case "1":
				String mobileNo = DiaryService.checkMobile();
				mobileCounter++;
				contactDetails = new MobileContact(mobileNo);
				details.add(contactDetails);
				break;
			case "2":
				String emailId = DiaryService.checkEmail();
				emailCounter++;
				contactDetails = new EmailContact(emailId);
				details.add(contactDetails);
				break;
			default:
				System.out.println(ANSI_RED+"----Invalid Input----"+ANSI_RESET);
				break;
			}
			System.out.print("--------->More Contacts?(2 -> No): ");
			String more = scanner.next();
			if(more.equals("2")) {
				break;
			}
		}
		if(emailCounter > mobileCounter) {
			contactType = ContactType.Email;
		}
		
		return new Contact(contactID, first_name, last_name,contactType, details);
	}

}
