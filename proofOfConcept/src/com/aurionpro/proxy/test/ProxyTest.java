package com.aurionpro.proxy.test;

import com.aurionpro.proxy.model.Internet;
import com.aurionpro.proxy.model.ProxyInternet;

public class ProxyTest {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("google.com");
		internet.connectTo("piratebay.com");
		internet.connectTo("yahoo.com");
		internet.connectTo("google.com");
		internet.connectTo("yahoo.com");
	}

}
