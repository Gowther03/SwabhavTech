package com.aurionpro.proxy.model;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

	private static List<String> bannedSites;
	private static List<String> videoCache = new ArrayList<String>();
	private Internet internet = new InternetSite();
 	static {
 		bannedSites = new ArrayList<String>();
 		bannedSites.add("piratebay.com");
 	}
	@Override
	public void connectTo(String site) {
		if(bannedSites.contains(site)) {
			System.out.println("Access denied");
			return;
		}
		if(!videoCache.contains(site)) {
			videoCache.add(site);
			internet.connectTo(site);
			return;
		}
		
	}

}
