package com.aurionpro.behavioral.observer.model;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
	private static List<INotifier> notifiers = new ArrayList<INotifier>();

	public static Account makeAccount(int accountNo, String holderName) {
		return new Account(accountNo, holderName, notifiers);
	}
//	public static INotifier notifications() {
//		
//	}
	
	public static void setSMS(Account account) {
		account.getNotifiers().add(new SMSNotifier());
	}
	public static void setWhatsApp(Account account) {
		account.getNotifiers().add(new WhatsAppNotifier());
	}
	public static void setEmail(Account account) {
		account.getNotifiers().add(new EmailNotifier());
	}
}
