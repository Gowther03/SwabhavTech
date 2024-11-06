package com.aurionpro.test;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.Contact;
import com.aurionpro.model.ContactDetails;
import com.aurionpro.model.ContactType;
import com.aurionpro.model.EmailContact;
import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.MobileNotValidException;
import com.aurionpro.model.MobileContact;
import com.aurionpro.model.User;

public class UserTest 
{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	private static String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
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
				addContact(userId, users, contactIDs);
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
					findUser(userId, users);
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
						removeUser(userId, users, userIDs);
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
								findContact(userId, users);
								System.out.print("\nEnter Contact ID-->");
								int contactId = scanner.nextInt();
								removeContact(userId, contactId, users);
								System.out.print("\nContacts Present-->");
								findContact(userId, users);
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
							HashMap<Integer, Integer> userContactIDs =displayContacts(temporaryUser);
							if(userContactIDs.isEmpty()) {
								return 1;
							}
							updateContact(userContactIDs, temporaryUser);
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
		userID = codeGenerator();
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
		contactID = codeGenerator();
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
				String mobileNo = checkMobile();
				mobileCounter++;
				contactDetails = new MobileContact(mobileNo);
				details.add(contactDetails);
				break;
			case "2":
				String emailId = checkEmail();
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
				user.addContact(createContact(contactIDs));
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
