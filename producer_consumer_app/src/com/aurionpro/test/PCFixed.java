package com.aurionpro.test;

import com.aurionpro.model.Consumer;
import com.aurionpro.model.Producer;

public class PCFixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press control c to stop");
	}

}
