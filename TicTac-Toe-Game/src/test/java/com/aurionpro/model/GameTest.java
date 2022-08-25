package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {
	Game game;
	Player[] players = {new Player("immanuel"),new Player("rahul")};
	Board board;
	ResultAnalyzer analyzer;
	ResultType result;
	
	@BeforeEach
	void createGame() {
		board = new Board();
		analyzer = new ResultAnalyzer();
		game = new Game(players);
	}
	
	@Test
	void testplay_checkPlayerChangeIfProgress() {
		game.play(1);
		if(analyzer.analyzeResult()==ResultType.PROGRESS) {
			assertEquals("rahul",game.getCurrentPlayer().getName());
		}
	}
	
	@Test
	@DisplayName("Horizontal win for 1st row")
	void testplay_checkHorizontal1Win() {
		game.play(0);
		game.play(3);
		game.play(1);
		game.play(4);
		game.play(2);
		assertEquals(ResultType.WIN, game.getResult());
	}
	
	@Test
	@DisplayName("Horizontal win for 2nd row")
	void testplay_checkHorizontal2Win() {
		game.play(0);
		game.play(3);
		game.play(1);
		game.play(4);
		game.play(7);
		game.play(5);
		assertEquals(ResultType.WIN, game.getResult());
	}

	@Test
	@DisplayName("Horizontal win for 3rd row")
	void testplay_checkHorizontal3Win() {
		game.play(6);
		game.play(3);
		game.play(7);
		game.play(4);
		game.play(8);
		assertEquals(ResultType.WIN, game.getResult());
	}
	
	@Test
	@DisplayName("Vertical win for 1st column")
	void testplay_checkVertical1Win() {
		game.play(0);
		game.play(2);
		game.play(3);
		game.play(1);
		game.play(6);
		assertEquals(ResultType.WIN, game.getResult());
	}
	
	@Test
	@DisplayName("Vertical win for 2nd column")
	void testplay_checkVertical2Win() {
		game.play(1);
		game.play(2);
		game.play(4);
		game.play(0);
		game.play(7);
		assertEquals(ResultType.WIN, game.getResult());
	}
	
	@Test
	@DisplayName("Vertical win for 3rd column")
	void testplay_checkVertical3Win() {
		game.play(2);
		game.play(0);
		game.play(5);
		game.play(1);
		game.play(8);
		assertEquals(ResultType.WIN, game.getResult());
	}
	
	@Test
	@DisplayName("1st Diagonal win")
	void testplay_checkDiagonal1Win() {
		game.play(0);
		game.play(1);
		game.play(4);
		game.play(7);
		game.play(8);
		assertEquals(ResultType.WIN, game.getResult());
	}
	
	@Test
	@DisplayName("2nd Diagonal win")
	void testplay_checkDiagonal2Win() {
		game.play(2);
		game.play(1);
		game.play(4);
		game.play(7);
		game.play(6);
		assertEquals(ResultType.WIN, game.getResult());
	}
	
	@Test
	@DisplayName("Draw")
	void testplay_checkDraw() {
		game.play(4);
		game.play(2);
		game.play(1);
		game.play(7);
		game.play(0);
		game.play(8);
		game.play(5);
		game.play(3);
		game.play(6);
		assertEquals(ResultType.DRAW, game.getResult());
	}
}
