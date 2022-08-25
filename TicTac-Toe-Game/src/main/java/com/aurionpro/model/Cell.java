package com.aurionpro.model;

public class Cell {
	private MarkType mark;

	public Cell() {
		super();
		this.mark = MarkType.EMPTY;
	}
	
	public boolean isCellEmpty() {
		if(this.mark==MarkType.EMPTY)
			return true;
		return false;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		if(this.mark==MarkType.X || this.mark == MarkType.O)
			throw new CellAlreadyMarkException("Cell is already marked");
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Cell [mark=" + mark + "]";
	}

}
