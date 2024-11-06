package com.aurionpro.proxy.model;

public class InternetSite implements Internet{

	@Override
	public void connectTo(String site) {
		// TODO Auto-generated method stub
		System.out.println("Connected to " + site);
	}

}
