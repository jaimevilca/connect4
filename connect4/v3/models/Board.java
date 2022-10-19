package connect4.v3.models;

import connect4.v3.types.Color;
import connect4.v3.types.Coordinate;

public class Board {

    public static final int DIMENSION_ROW = 7;
    public static final int DIMENSION_COLUMN = 6;
    Color[][] colors;

    Coordinate lastToken;

    Board() {
        this.colors = new Color[DIMENSION_ROW][DIMENSION_COLUMN];
        this.reset();
    }

    public void reset() {

        for (int i = 0; i < DIMENSION_ROW; i++) {
            for (int j = 0; j < DIMENSION_COLUMN; j++) {
                this.colors[i][j] = Color.NULL;
            }
        }
    }


    public Integer getNextRow(int column) {

        for (int row = DIMENSION_ROW - 1; row >= 0; row--) {
            if (this.colors[row][column].isNull())
                return row;
        }
        return null;
    }

    public void putToken(int column, Color color) {
        Coordinate coordinate = new Coordinate(getNextRow(column), column);
        this.colors[coordinate.getRow()][coordinate.getColumn()] = color;
        lastToken = coordinate;
    }

    public Color getColor(Coordinate coordinate) {
        return colors[coordinate.getRow()][coordinate.getColumn()];
    }

    public Color[][] getColors() {
        return colors;
    }

    public boolean isCoordinateValid(Coordinate coordinate) {
        return (coordinate.getRow() >= 0 && coordinate.getRow() < Board.DIMENSION_ROW) && (coordinate.getColumn() >= 0 && coordinate.getColumn() < Board.DIMENSION_COLUMN);
    }

    public Color getCurrentColor() {
        return colors[lastToken.getRow()][lastToken.getColumn()];
    }

    public Coordinate getLastToken() {
        return lastToken;
    }

}
