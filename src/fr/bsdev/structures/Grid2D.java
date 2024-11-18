package fr.bsdev.structures;

public class Grid2D {
	
	private int columns = 0;
	private int rows = 0;
	private Object[][] grid;
	
	/**
	 * 
	 * @param rows
	 * @param columns
	 */
	public Grid2D( int rows,int columns) {
		super();
		this.columns = columns;
		this.rows = rows;
		grid = new Object[rows][columns];
	}
	
	/**
	 * 
	 * @param row
	 * @param column
	 * @param obj
	 * @return
	 */
	public int writeData(int row,int column,Object obj) {
		if(isValid(row, column)) {
			grid[row][column] = obj;
			return 1;
		}
		return -1;
	}
	
	/**
	 * 
	 * @param pos
	 * @param obj
	 * @return
	 */
	public int writeData(Tuple pos,Object obj) {
		int row = (int)pos.get(0);
		int column = (int)pos.get(1);
		return this.writeData(row, column, obj);
	}
	
	/**
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	public Object readData(int row, int column) {
		if(isValid(row, column)) {
			return grid[row][column];
		}
		return null;
	}
	
	/**
	 * 
	 * @param pos
	 * @return
	 */
	public Object readData(Tuple pos) {
		int row = (int)pos.get(0);
		int column = (int)pos.get(1);
		return this.readData(row, column);
	}
	
	/**
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	private boolean isValid(int row,int column) {
		return  row<rows && column < columns && row>=0 && column >=0;
	}
	
	
	/**
	 * Fill the array with a character
	 */
	public void fillCharacter(Character c) {
		for(int row = 0;row<rows;row++) {
			for(int column = 0;column<columns;column++) {
				grid[row][column] = c;
			}
		}
	}
	
	/**
	 * Fill the table with the value 0
	 */
	public void fillZero() {
		for(int row = 0;row<rows;row++) {
			for(int column = 0;column<columns;column++) {
				grid[row][column] = (Integer)0;
			}
		}
	}
	
	
	public Tuple getSize() {
		return new Tuple(this.rows,this.columns);
	}
	
	
	public void showInteger() {
		
		for(int row = 0;row<rows;row++) {
			for(int column = 0;column<columns;column++) {
				System.out.printf("%3d",grid[row][column]);
			}
			System.out.println();
		}
	}
	
public void showString() {
		StringBuilder sb = new StringBuilder();
		for(int row = 0;row<rows;row++) {
			for(int column = 0;column<columns;column++) {
				sb.append(grid[row][column]);
			}
			sb.append("\n");
		}
		
		System.err.println(sb);
	}

}
