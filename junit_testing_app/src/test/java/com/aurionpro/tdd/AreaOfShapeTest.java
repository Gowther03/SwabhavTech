package com.aurionpro.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaOfShapeTest {
	
	AreaOfShape shape;
	@BeforeEach
	void init() {
		shape = new AreaOfShape();
	}
	
	@Test
	void testAreaOfTriangle() {
		assertEquals(3000, shape.calculateAreaOfTriangle(10, 20, 30));
	}
	@Test
	void testAreaOfCircle() {
		assertEquals(314, shape.calculateAreaOfCircle(10));
	}
	@Test
	void testAreaofSquare() {
		assertEquals(100, shape.calculateAreaOfSquare(10));
	}
}
