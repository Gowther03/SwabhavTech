package com.aurionpro.model;

public class DBConnection {
	private static DBConnection connection; //static--> so that the same DBConnection variable value will be used.. No new will be created
	
	private DBConnection() {//private--> so that no other classes will directly be able to make new objects!
		
	}
	public static DBConnection getCostructor() {//static method so that this method is available to use for other classes.
		//by using the Reference type that is DBConnection
		if(connection == null) {
			connection = new DBConnection();
		}
		return connection;
	}
}
