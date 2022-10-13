package connect4.v2.models;

import connect4.v2.types.Color;
import connect4.v2.types.Coordinate;

public class Board {

    public static final int DIMENSION_ROW = 7;
    public static final int DIMENSION_COLUMN = 6;
    BoardSpace[][] spaces;

    BoardSpace lastSpace;

    Board() {
        this.spaces = new BoardSpace[DIMENSION_ROW][DIMENSION_COLUMN];
        this.reset();
    }

    public void reset() {
        for (int i = 0; i < DIMENSION_ROW; i++) {
            for (int j = 0; j < DIMENSION_COLUMN; j++) {
                this.spaces[i][j] = new BoardSpace(new Coordinate(i, j));
            }
        }
    }


    public boolean hasRowSpace(int column) {
        return getNextRowCircleSpace(column) != null;
    }

    public BoardSpace getNextRowCircleSpace(int column) {

        for (int j = DIMENSION_ROW - 1; j >= 0; j--) {
            if (this.spaces[j][column].getToken() == null)
                return this.spaces[j][column];
        }
        return null;
    }

    public void putToken(int column, Color color) {
        BoardSpace boardSpace = getNextRowCircleSpace(column);
        Token token = new Token(color);
        boardSpace.setToken(token);
        lastSpace = boardSpace;
    }

    public BoardSpace getCircleSpace(Coordinate coordinate) {
        return spaces[coordinate.getRow()][coordinate.getColumn()];
    }

    public BoardSpace[][] getSpaces() {
        return spaces;
    }

    public BoardSpace getLastSpace() {
        return lastSpace;
    }

    public boolean isCoordinateValid(Coordinate coordinate) {
        return (coordinate.getRow() >= 0 && coordinate.getRow() < Board.DIMENSION_ROW) && (coordinate.getColumn() >= 0 && coordinate.getColumn() < Board.DIMENSION_COLUMN);
    }

    public Color getCurrentColor() {
        return lastSpace.getColor();
    }

    public Coordinate getCurrentCoordinate() {
        return lastSpace.getCoordinate();
    }

}
