package com.aurionpro.model;

public class Game {
	private Player currentPlayer;
	private Player[] players;
	private Board board;
	private ResultAnalyzer analyzer;
	private ResultType result;

	public Game(Player[] players) {
		super();
		this.players = players;
		this.currentPlayer = players[0];
		this.analyzer = new ResultAnalyzer();
		this.board = analyzer.getBoard();
		players[0].setMark(MarkType.X);
		players[1].setMark(MarkType.O);
	}

	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}
	
	public Board getBoard() {
		return board;
	}

	public ResultAnalyzer getAnalyzer() {
		return analyzer;
	}

	public Player[] getPlayers() {
		return players;
	}

	public ResultType getResult() {
		return result;
	}
	
	public void play(int loc) {
		board.setCellMark(loc, currentPlayer.getMark());
		result = analyzer.analyzeResult();
		if(result==ResultType.PROGRESS) {
			switchCurrentPlayer();
		}
		if(result==ResultType.WIN) {
			System.out.println(currentPlayer.getName()+" Win");
		}
		if(result==ResultType.DRAW)
			System.out.println("Draw");
	}

	private void switchCurrentPlayer() {
		if (currentPlayer == players[0])
			currentPlayer = players[1];
		else currentPlayer = players[0];
	}


	
}
