package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TestCalculator {

//	@Test
//	void test() {
//		fail("Not yet implemented");

//	}
	Calculator c = null;
	CalculatorService service = Mockito.mock(CalculatorService.class);

	@BeforeEach
	void before() {
		c = new Calculator(service);
	}

	@Test
	@DisplayName("Add test")
	public void testPerform1() {

		when(service.add(2, 3)).thenReturn(5);
		assertEquals(5, c.perform1(2, 3));
		verify(service).add(2, 3);
	}
	
	@Test
	@DisplayName("sub test")
	public void testPerform2() {

		when(service.sub(5, 2)).thenReturn(3);
		assertEquals(3, c.perform2(5, 2));
		verify(service).sub(5, 2);
	}
	
	@Test
	@DisplayName("Mul test")
	public void testPerform3() {

		when(service.mul(5, 2)).thenReturn(10);
		assertEquals(10, c.perform3(5, 2));
		verify(service).mul(5, 2);
	}
	@Test
	@DisplayName("Div test")
	public void testPerform4() {

		when(service.div(10, 2)).thenReturn(5);
		assertEquals(5, c.perform4(10, 2));
		verify(service).div(10, 2);
	}
}
