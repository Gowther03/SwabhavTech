package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test {
	public static void main(String[] args) {
		try {
			Class stringClass = Class.forName("java.lang.String");
			Constructor constructors[] = stringClass.getConstructors();
			System.out.println("String Constructor: ");
			for(Constructor constructor : constructors) {
				System.out.println("\n" + constructor.getName() + " have " + constructor.getParameterCount() + " parameters");
				Parameter parameters[] = constructor.getParameters();
				for(Parameter parameter: parameters) {
					System.out.println("\t\t" + parameter.getName());
				}
			}
			System.out.println("--------------------------------------------");
			System.out.println("String Methods: ");
			Method methods[] = stringClass.getMethods();
			for(Method method: methods) {
				System.out.println("\n" +method.getName() + " have " + method.getParameterCount() + " parameters");
//				Parameter parameters[] = method.getParameters();
//				for(Parameter parameter : parameters) {
//					System.out.println("\t\t" + parameter.getName());
//				}
				System.out.println("--------------------------");
			}
			System.out.println("--------------------------------------------");
			System.out.println("File Methods: ");
			Class collectionsClass = Class.forName("java.util.Collections");
			Class classes[] = collectionsClass.getClasses();
			for(Class eachClass: classes) {
				System.out.println(eachClass.getName());
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
