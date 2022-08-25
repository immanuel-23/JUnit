package com.aurionpro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;
	
	public ResultAnalyzer() {
		super();
		this.board = new Board();
		this.result = ResultType.PROGRESS;
	}
	
	public Board getBoard() {
		return board;
	}

	public ResultType getResult() {
		return result;
	}
	
	private void horizontalWinCheck() {
		Cell[] cells = board.getCells();
		for (int i = 0; i < 9; i = i + 3) {
			if (cells[i].getMark() == cells[i + 1].getMark() 
					&& cells[i + 1].getMark() == cells[i + 2].getMark() 
					&& cells[i].getMark()!=MarkType.EMPTY) {
				result=ResultType.WIN;
			}
		}
	}
	
	private void verticalWinCheck() {
		Cell[] cells = board.getCells();
		for (int i = 0; i < 3; i++) {
			if (cells[i].getMark() == cells[i + 3].getMark()
					&& cells[i + 3].getMark() == cells[i + 6].getMark()
					&& cells[i].getMark()!=MarkType.EMPTY) {
				result=ResultType.WIN;
			}
		}
	}
	
	private void diagonalWinCheck() {
		Cell[] cells = board.getCells();
		if ((cells[0].getMark() == cells[4].getMark() 
			    && cells[4].getMark() == cells[8].getMark()
			    && cells[4].getMark()!=MarkType.EMPTY)
			|| (cells[2].getMark() == cells[4].getMark() 
			    && cells[4].getMark() == cells[6].getMark()
			    && cells[4].getMark()!=MarkType.EMPTY)) {
			result=ResultType.WIN;
		}
	}
	
	public ResultType analyzeResult() {
		diagonalWinCheck();
		horizontalWinCheck();
		verticalWinCheck();
		if(result!=ResultType.WIN) {
			if(!board.isBoardFull()) {
				result=ResultType.PROGRESS;
			}
			else {
				result=ResultType.DRAW;
			}
		}
		return result;
	}
	
	
	
	
	
}
