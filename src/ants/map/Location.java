package ants.map;

public class Location {

    private int row;
    private int col;

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public static Location loc(int row, int col) {
        return new Location(row, col);
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

}
