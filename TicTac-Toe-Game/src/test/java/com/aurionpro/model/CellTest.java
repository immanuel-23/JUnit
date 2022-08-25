package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CellTest {
	
	Cell cell;
	
	@BeforeEach
	void creatingObject() {
		cell = new Cell();
	}
	
	@Test
	void testCreatedCellIsEmpty() {
		MarkType expected = MarkType.EMPTY;
		MarkType actual = cell.getMark();
		assertEquals(expected, actual);
	}
	
	@Test
	void testSetMark_checkIfCanMarkX(){
		cell.setMark(MarkType.X);
		MarkType expected = MarkType.X;
		MarkType actual = cell.getMark();
		assertEquals(expected, actual);		
	}
	
	@Test
	void testSetMark_checkIfCanMarkO() {
		cell.setMark(MarkType.O);
		MarkType expected = MarkType.O;
		MarkType actual = cell.getMark();
		assertEquals(expected, actual);
	}
	
	@Test
	void testSetMark_throwsCellAlreadyMarkedExceptionWhenMarkedTwice() {
		cell.setMark(MarkType.X);
		
		assertThrows(CellAlreadyMarkException.class,()->{
			cell.setMark(MarkType.O);
		});
	}
}
