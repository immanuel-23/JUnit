package com.aurionpro.model;

public class Board {
	Cell[] cells = new Cell[9];

	public Board() {
		super();
		for (int i = 0; i < 9; i++)
			cells[i] = new Cell();
	}

	public boolean isBoardFull() {
		for (int i = 0; i < 9; i++) {
			if (cells[i].getMark() == MarkType.EMPTY) {
				return false;
			}
		}
		return true;
	}

	public Cell[] getCells() {
		return cells;
	}

	public void setCellMark(int loc, MarkType mark) {
		if (loc < 0 || loc > 8)
			throw new InvalidCellLocation("No such location is present in board");
		if (cells[loc].getMark() == MarkType.X || cells[loc].getMark() == MarkType.O)
			throw new CellAlreadyMarkException("Cell is already marked");

		cells[loc].setMark(mark);
	}

}
