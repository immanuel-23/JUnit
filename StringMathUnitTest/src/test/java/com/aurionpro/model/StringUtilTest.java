package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
	StringUtil util = new StringUtil();

	@Test
	@DisplayName("Truncate A at first 2 position")
	@Disabled
	void test_checkIfAisAtFirst2Place() {
		String expected = "bc";
		String actual = util.truncateAInFirst2Place("abc");
		//abcd, aabc,abc,bcda
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Chek if first and last 2 char are equal")
	void test_checkIfFirstAndLast2CharAreEquaL() {
		boolean expected = true;
		boolean actual = util.firstAndLast2CharAreEqual("abcdab");
		assertEquals(expected, actual);

	}

}
