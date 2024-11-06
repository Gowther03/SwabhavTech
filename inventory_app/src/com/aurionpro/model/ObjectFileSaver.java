package com.aurionpro.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ObjectFileSaver {
	
	public static void saveObjectToFile(Serializable object, String filename) {
        
		boolean append = Files.exists(Paths.get(filename));
		
		try (FileOutputStream fileOutstream = new FileOutputStream(filename, true);
             ObjectOutputStream objectOutputStream = append? new AppendableObjectOutputStream(fileOutstream) : new ObjectOutputStream(fileOutstream)) 
        {
        	objectOutputStream.writeObject(object);
        } 
        catch (IOException exception) 
        {
            System.err.println("Error writing object to file: " + exception.getMessage());
        }
    }
	
	
	public static void readObjectsFromFile(String filename) {
        try (FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            while (true) {
                try {
                    Object object = objectInputStream.readObject();
                    
                    if (object instanceof Product) {
                       ((Product) object).showDetails();
                    } 
                    else if (object instanceof Supplier) {
                    	((Supplier) object).showDetails();
                    } 
                    else if (object instanceof Transaction) {
                    	((Transaction) object).showDetails();
                    }
                } 
                catch (EOFException exception) 
                {
                    break;
                }
            }
        } 
        catch (IOException | ClassNotFoundException exception) {
            System.err.println("Error reading from file: " + exception.getMessage());
        }
    }
}
