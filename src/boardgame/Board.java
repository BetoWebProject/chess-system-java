package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Peace [][] peaces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		peaces = new Peace [rows][columns];
	}
	
	
}
