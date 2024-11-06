package com.aurionpro.chapter2.model;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;
	
	public GuitarSpec(Builder builder, String model, Type type, int numStrings,
			Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public boolean matches(GuitarSpec searchSpec) {
		// TODO Auto-generated method stub
		if(builder!= searchSpec.builder) {
			return false;
		}
		if((model != null) & (!model.equals("")) & (!model.equals(searchSpec.model))) {
			return false;
		}
		if(type!= searchSpec.type) {
			return false;
		}
		if(numStrings!= searchSpec.numStrings) {
			return false;
		}
		if(topWood!= searchSpec.topWood) {
			return false;
		}
		if(backWood!= searchSpec.backWood) {
			return false;
		}
		
		return true;
	}
}
