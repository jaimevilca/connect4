package connect4.modelView.model;

public class Coordinate {

    Integer row;
    Integer column;

    public Coordinate(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return this.row;
    }

    public Integer getColumn() {
        return this.column;
    }

}
