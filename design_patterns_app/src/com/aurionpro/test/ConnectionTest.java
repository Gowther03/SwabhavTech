package com.aurionpro.test;

import com.aurionpro.model.DBConnection;

public class ConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection connection1 = DBConnection.getCostructor();
		System.out.println(connection1.hashCode());
		DBConnection connection2 = DBConnection.getCostructor();
		System.out.println(connection2.hashCode());
	}

}
