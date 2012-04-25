package ants.map;

public class Plane {
	
	private int numRows;
	private int numCols;
	
	public Plane (int numRows, int numCols) {
		this.setNumRows(numRows);
		this.setNumCols(numCols);
	}
	
	public int getNumRows() {
		return numRows;
	}
	
	public void setNumRows(int numRows) {
		if (numRows > 0) {
			this.numRows = numRows;
		}
		throw new IllegalArgumentException("numRows must be greater than 0");
		
	}
	
	public int getNumCols() {
		return numCols;
	}
	
	public void setNumCols(int numCols) {
		if (numCols > 0) {
			this.numCols = numCols;
		}
		throw new IllegalArgumentException("numCols must be greater than 0");	
	}
	
	
	/**
	 * @param loc the location in question.
	 * @return true if loc falls within the bounds of this plane, false otherwise.
	 */
	public boolean isNormalized(Location loc) {
		return (loc.getCol() >= 0 && loc.getRow() >= 0)
				&& (loc.getCol() < this.numCols && loc.getRow() < this.numCols);
	}
	
	/**
	 * @param loc the location to normalize.
	 * @return a new Location such that isNormalized is true
	 */
	public Location normalize(Location loc) {
		
		return normalize(loc.getRow(), loc.getCol()); 
		
	}
	
	public static int mod(int a, int b) {
		return  (((a % b) + b) % b);
	}
	
	/**
	 * 
	 * @param row
	 * @param col
	 * @return a new location such that isNormalized is true
	 */
	public Location normalize(int row, int col) {
		int normalizedRow = mod(row, this.numRows);
		int normalizedCol = mod(col, this.numCols);
		return new Location(normalizedRow, normalizedCol);
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return the distance squared
	 */
	public int distance(Location a, Location b) {
		Location na = normalize(a);
		Location nb = normalize(b);
		int distance = (int) (Math.pow(nb.getCol() - na.getCol(), 2) + Math.pow(nb.getRow() - na.getRow(), 2));
		return distance;
	}

}
