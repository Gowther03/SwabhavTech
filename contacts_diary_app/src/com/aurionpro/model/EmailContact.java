package com.aurionpro.model;

public class EmailContact implements ContactDetails{
	private String email;
	
	public EmailContact(String email) {
		this.email = email;
	}
	@Override
	public String getInfo() {
		return email;
	}
	@Override
	public void setInfo(String email) {
		this.email = email;
	}
}
