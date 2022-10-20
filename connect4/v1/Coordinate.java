package connect4.v1;

public class Coordinate {

    private int column;

    private int row;

    public Coordinate(int row, int column) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

}
