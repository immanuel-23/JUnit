package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResultAnalyzerTest {
	ResultAnalyzer resultAnalyzer;
	Board board;
	
	@BeforeEach
	void creatingResultAnalyzer() {
		resultAnalyzer = new ResultAnalyzer();
		board = resultAnalyzer.getBoard();
	}
	
	@Test
	@DisplayName("Horizontal win for 1st row")
	void testAnalyzeResult_checkHorizontalWin1Row() {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.X);
		cells[1].setMark(MarkType.X);
		cells[2].setMark(MarkType.X);
		ResultType expected = ResultType.WIN;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Horizontal win for 2nd row")
	void testAnalyzeResult_checkHorizontalWin2Row() {
		Cell[] cells = board.getCells();
		cells[3].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[5].setMark(MarkType.X);
		ResultType expected = ResultType.WIN;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Horizontal win for 3rd row")
	void testAnalyzeResult_checkHorizontalWin3Row() {
		Cell[] cells = board.getCells();
		cells[6].setMark(MarkType.X);
		cells[7].setMark(MarkType.X);
		cells[8].setMark(MarkType.X);
		ResultType expected = ResultType.WIN;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Vertical win for 1st column")
	void testAnalyzeResult_checkVerticalWin1Column() {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.X);
		cells[3].setMark(MarkType.X);
		cells[6].setMark(MarkType.X);
		ResultType expected = ResultType.WIN;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Vertical win for 2nd column")
	void testAnalyzeResult_checkVerticalWin2Column() {
		Cell[] cells = board.getCells();
		cells[1].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[7].setMark(MarkType.X);
		ResultType expected = ResultType.WIN;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Vertical win for 3rd column")
	void testAnalyzeResult_checkHorizontalWin3Column() {
		Cell[] cells = board.getCells();
		cells[2].setMark(MarkType.X);
		cells[5].setMark(MarkType.X);
		cells[8].setMark(MarkType.X);
		ResultType expected = ResultType.WIN;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("1st Diagonal win")
	void testAnalyzeResult_checkDiagonal1Win() {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[8].setMark(MarkType.X);
		ResultType expected = ResultType.WIN;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("2nd Diagonal win")
	void testAnalyzeResult_checkDiagonal2Win() {
		Cell[] cells = board.getCells();
		cells[2].setMark(MarkType.X);
		cells[4].setMark(MarkType.X);
		cells[6].setMark(MarkType.X);
		ResultType expected = ResultType.WIN;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Draw")
	void testAnalyzeResult_checkDraw() {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.O);
		cells[1].setMark(MarkType.X);
		cells[2].setMark(MarkType.O);
		cells[3].setMark(MarkType.O);
		cells[4].setMark(MarkType.X);
		cells[5].setMark(MarkType.X);
		cells[6].setMark(MarkType.X);
		cells[7].setMark(MarkType.O);
		cells[8].setMark(MarkType.X);
		ResultType expected = ResultType.DRAW;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Progress")
	void testAnalyzeResult_checkProgress() {
		Cell[] cells = board.getCells();
		cells[0].setMark(MarkType.O);
		cells[1].setMark(MarkType.X);
		cells[2].setMark(MarkType.O);
		cells[3].setMark(MarkType.O);
		cells[4].setMark(MarkType.X);
		cells[5].setMark(MarkType.X);
		ResultType expected = ResultType.PROGRESS;
		ResultType actual = resultAnalyzer.analyzeResult();
		assertEquals(expected, actual);
	}
}
