package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;
import com.aurionpro.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which Shape(1.Circle, 2.Rectangle, 3.Triangle, 4.Square): ");
		int shape = scanner.nextInt();
		switch(shape) {
		case 1:
			Circle circle = new Circle(10);
			circle.area();
			break;
		case 2:
			Rectangle rectangle = new Rectangle(10, 20);
			rectangle.area();
			break;
		case 3:
			Triangle triangle = new Triangle(10,20);
			triangle.area();
			break;
		case 4:
			Square square = new Square(10);
			square.area();
			break;
		default:
			System.out.println("Invalid input");
			break;
			
		}
	}

}
