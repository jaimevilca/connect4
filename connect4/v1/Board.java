package connect4.v1;


import connect4.v1.utils.Console;
import connect4.v1.utils.Message;

import java.util.List;

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

    public void write() {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < this.DIMENSION_ROW; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < this.DIMENSION_COLUMN; j++) {
                this.colors[i][j].write();
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();

    }

    public Integer getNextRow(int column) {

        for (int row = DIMENSION_ROW - 1; row >= 0; row--) {
            if (this.colors[row][column].isNull()) {
                return row;
            }
        }
        return null;
    }

    public void putToken(int column, Color color) {
        Coordinate coordinate = new Coordinate(getNextRow(column), column);
        this.colors[coordinate.getRow()][coordinate.getColumn()] = color;
        lastToken = coordinate;
    }

    public boolean isConnect4() {
        List<Direction[]> directions = Direction.getAllDirections();
        for (int i = 0; i < directions.size(); i++) {
            if (this.isDirectionValid(directions.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isDirectionValid(Direction[] directions) {

        int totalTokens = 1;
        for (int i = 0; i < directions.length; i++) {
            totalTokens += countValidTokens(directions[i]);
        }
        return totalTokens >= 4;
    }

    public int countValidTokens(Direction direction) {

        int tokens = 0;
        Coordinate nextCoordinate = direction.increment(this.lastToken);
        while (this.isCoordinateValid(nextCoordinate)
                && this.getCurrentColor().equals(this.getColor(nextCoordinate))) {
            tokens++;
            nextCoordinate = direction.increment(nextCoordinate);
        }
        return tokens;
    }

    private boolean isCoordinateValid(Coordinate coordinate) {
        return (coordinate.getRow() >= 0 && coordinate.getRow() < Board.DIMENSION_ROW) && (coordinate.getColumn() >= 0 && coordinate.getColumn() < Board.DIMENSION_COLUMN);
    }

    public Color getCurrentColor() {
        return colors[lastToken.getRow()][lastToken.getColumn()];
    }

    public Color getColor(Coordinate coordinate) {
        return colors[coordinate.getRow()][coordinate.getColumn()];
    }
}
