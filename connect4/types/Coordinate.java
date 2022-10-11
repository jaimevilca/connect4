package connect4.types;

import utils.Direction;

public class Coordinate {

    Integer row;
    Integer column;

    public Coordinate(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public static final int DIMENSION_ROW = 7;
    public static final int DIMENSION_COLUMN = 6;
    public static final int DIMENSION = 4;

    public Direction getDirection(Coordinate coordinate) {

        if (this.inHorizontal(coordinate)) {
            return Direction.HORIZONTAL;
        }
        if (this.inVertical(coordinate)) {
            return Direction.VERTICAL;
        }
        if (this.inMainDiagonal() && coordinate.inMainDiagonal()) {
            return Direction.MAIN_DIAGONAL;
        }
        return Direction.NULL;
    }

    private boolean inHorizontal(Coordinate coordinate) {
        if (coordinate.isNull()) {
            return false;
        }
        return this.row == coordinate.row;
    }

	public boolean inVertical(Coordinate coordinate) {
		if (coordinate.isNull()){
			return false;
		}
		return this.column == coordinate.column;
	}

	public boolean inMainDiagonal() {
		return this.row - this.column == 0;
	}

    public boolean isNull() {
		return this.row == null || this.column == null;
	}

}
