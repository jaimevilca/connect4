package connect4;

import utils.Console;

public class Board {

    CircleSpace[][] spaces;

    Board() {
        this.spaces = new CircleSpace[Coordinate.DIMENSION_ROW][Coordinate.DIMENSION_COLUMN];
        this.reset();
    }

    private void reset() {
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                this.spaces[i][j] = new CircleSpace(Color.EMPTY) ;
            }
        }
    }

    public void write() {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                this.spaces[i][j].write();
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();

    }

    public boolean isConnect4(Color currentColor) {
        return false;
    }

    public boolean isFinished(Color color) {


        return false;
    }

    public boolean hasRowSpace(int column) {
        return getNextRowCircleSpace(column) != null;
    }

    public CircleSpace getNextRowCircleSpace(int column) {

        for (int j = Coordinate.DIMENSION_ROW-1; j >= 0; j--) {
            if (this.spaces[j][column].getColor() == Color.EMPTY)
                return this.spaces[j][column];
        }
        return null;
    }

    public void putToken(int column, Color color) {
        CircleSpace circleSpace = getNextRowCircleSpace(column);
        circleSpace.setColor(color);
    }
}
