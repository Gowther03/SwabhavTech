package com.aurionpro.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmaticOperationsTest {
	ArithmaticOperations operations;
	
	@BeforeEach
	void init() {
		operations = new ArithmaticOperations();
	}
	
	@AfterEach
	void message() {
		System.out.println("Test is done");
	}
	@AfterAll
	static void finalMessage() {
		System.out.println("All tests done");
	}
;	@Test
	void testAddition() {
		assertEquals(13, operations.addition(10, 3));
		assertTrue(operations.addition(12, 10)>20);
		
	}

	@Test
	void testSubstraction() {
		assertEquals(7, operations.substraction(10, 3));
	}

	@Test
	void testMultiplicationn() {
		assertEquals(30, operations.multiplicationn(10, 3));
	}

	@Test
	void testDivison() {
		assertEquals(5, operations.divison(10, 2));
		assertThrows(ArithmeticException.class,() -> operations.divison(10, 0) );
//		assertThrows(InputMismatchException.class, () -> operation.divison(3, 9));
		
	}

}
