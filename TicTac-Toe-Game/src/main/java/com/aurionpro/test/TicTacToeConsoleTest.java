package com.aurionpro.test;

import com.aurionpro.model.*;

import java.util.Scanner;

import com.aurionpro.model.Board;
import com.aurionpro.model.Cell;
import com.aurionpro.model.Game;
import com.aurionpro.model.MarkType;
import com.aurionpro.model.Player;
import com.aurionpro.model.ResultAnalyzer;
import com.aurionpro.model.ResultType;

public class TicTacToeConsoleTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe Game");
		System.out.println("Enter name of Player 1 :");
		String playerOneName = sc.nextLine();
		System.out.println("Enter name of Player 2 :");
		String playerTwoName = sc.nextLine();
		Player[] players = { new Player(playerOneName), new Player(playerTwoName) };

		Game game = new Game(players);
		ResultAnalyzer analyzer = game.getAnalyzer();
		Board board = analyzer.getBoard();

		printBoard(board);

		while (true) {
			System.out.println("Player :" + " (" + game.getCurrentPlayer().getName() + ")");
			System.out.println("Enter location number between 0-8 :");
			int loc = sc.nextInt();
			game.play(loc);
			printBoard(board);
			if (analyzer.getResult() != ResultType.PROGRESS) {
				break;
			}
		}
	}

	private static void printBoard(Board board) {
		Cell[] cells = board.getCells();
		for (int i = 0; i < 9; i++) {
			String temp = cells[i].getMark() == MarkType.EMPTY ? (i + "") : cells[i].getMark().toString();
			System.out.print(temp + "  | ");
			if ((i + 1) % 3 == 0) {
				System.out.println("\n--------------");
			}
		}

	}

}
