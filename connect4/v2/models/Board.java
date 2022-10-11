package connect4.v2.models;

import connect4.v2.types.Color;
import connect4.v2.types.Coordinate;
import connect4.v2.results.WinnerResult;
import connect4.v2.utils.Console;
import connect4.v2.utils.Message;

public class Board {

    CircleSpace[][] spaces;

    Board() {
        this.spaces = new CircleSpace[Coordinate.DIMENSION_ROW][Coordinate.DIMENSION_COLUMN];
        this.reset();
    }

    public void reset() {
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                this.spaces[i][j] = new CircleSpace(new Coordinate(i, j));
            }
        }
    }



    public boolean isConnect4(Color currentColor) {
        //TODO valid draw
        WinnerResult winnerResult = new WinnerResult();
        return winnerResult.valid(this, currentColor);
    }


    public boolean hasRowSpace(int column) {
        return getNextRowCircleSpace(column) != null;
    }

    public CircleSpace getNextRowCircleSpace(int column) {

        for (int j = Coordinate.DIMENSION_ROW - 1; j >= 0; j--) {
            if (this.spaces[j][column].getToken() == null)
                return this.spaces[j][column];
        }
        return null;
    }

    public void putToken(int column, Color color) {
        CircleSpace circleSpace = getNextRowCircleSpace(column);
        Token token = new Token(color);
        circleSpace.setToken(token);
    }

    public CircleSpace getCircleSpace(Coordinate coordinate) {
        return spaces[coordinate.getX()][coordinate.getY()];
    }
    public CircleSpace[][] getSpaces() {
        return spaces;
    }

    public void setSpaces(CircleSpace[][] spaces) {
        this.spaces = spaces;
    }
}
