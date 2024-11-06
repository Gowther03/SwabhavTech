package com.aurionpro.chapter2.model;

public enum Type {
	ACOUSTIC,
	ELECTRIC;
	
	public String toString() {
		switch(this) {
		case ACOUSTIC:
			return "Acoustic";
		case ELECTRIC:
			return "Electric";
		}
		return null;
	}
	
}
