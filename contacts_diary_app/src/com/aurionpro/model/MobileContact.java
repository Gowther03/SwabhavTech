package com.aurionpro.model;

public class MobileContact implements ContactDetails{
	private String mobileNo;

	public MobileContact(String mobileNo){
		this.mobileNo = mobileNo;
	}
	@Override
	public String getInfo() {
		return mobileNo;
	}
	@Override
	public void setInfo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
