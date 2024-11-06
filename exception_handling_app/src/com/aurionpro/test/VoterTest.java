package com.aurionpro.test;

import com.aurionpro.model.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		
		try {
			Voter voter = new Voter("Aashish", 10);
			System.out.println(voter);
		}
		catch(AgeNotValidException exception){
			System.out.println(exception.getMessage());
		}

	}

}
