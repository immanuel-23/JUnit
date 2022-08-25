package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MathUtilTest {

	MathUtil util;

	@Disabled
	@Test
	void test() {
		// System.out.println("Hello world !"+util.addInt(10, 30));
		fail("This got failed");
	}

	@BeforeAll
	void beforeAll() {
		System.out.println("Printing before all");
	}

	@BeforeEach
	void beforeEach() {
		util = new MathUtil();
		System.out.println("Printing before each");// will run before each test
	}

	@Test
	@DisplayName("Check addition of positive Integer")
	void testAddInt_CheckPositiveInteger() {
		int expected = 10;
		int actual = util.addInt(5, 5);

		assertEquals(expected, actual);

	}

	@Test
	void testAddInt_CheckPositiveIntegerAndZero() {
		int expected = 5;
		int actual = util.addInt(5, 0);

		assertEquals(expected, actual);
	}

	@Test
	void testAddInt_CheckNegativeInteger() {
		int expected = -10;
		int actual = util.addInt(-5, -5);

		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("check Divison by Positive Number")
	void testdivInt_CheckDivisonByPositiveNumber() {
		int expected = 4;
		int actual = util.divNumber(8, 2);

		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("check Divison by Negative Number")
	void testdivInt_CheckDivisonByNegativeeNumber() {
		int expected = -4;
		int actual = util.divNumber(8, -2);

		assertEquals(expected, actual);
	}

//	@Test
//	@Disabled
//	@DisplayName("check Divison by Zero")
//	void testdivInt_CheckDivisonByZero() {
//		int expected = -4;
//		int actual = util.divNumber(8, 0);
//
//		//assertEquals(expected, actual);
//		assertTrue(expected==actual);
//	}

	@Test
	void testdivInt_CheckArithmeticException() {
		assertThrows(ArithmeticException.class, (() -> util.divNumber(8, 0)));
	}

	@Test
	@DisplayName("Checking if 2 array are equals")
	void equalArrays() {
		int a[] = { 10, 20, 30, 40 };
		int b[] = { 10, 20, 30, 40 };
		assertArrayEquals(a, b);
	}
}
