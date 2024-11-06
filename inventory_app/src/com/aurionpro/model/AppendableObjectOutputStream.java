package com.aurionpro.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream{

	protected AppendableObjectOutputStream(FileOutputStream fileOutputStream) throws IOException, SecurityException {
		super(fileOutputStream);
		
	}
	@Override
	protected void writeStreamHeader() throws IOException {
	    reset();  
	}

}
