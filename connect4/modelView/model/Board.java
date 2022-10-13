package connect4.modelView.model;

import connect4.modelView.type.Color;

public class Board {

    public static final Integer DIMENSION_ROW = 7;
    public static final Integer DIMENSION_COLUMN = 6;

    CircleSpace[][] spaces;

    Board() {
        this.spaces = new CircleSpace[DIMENSION_ROW][DIMENSION_COLUMN];
        this.reset();
    }

    void reset() {
        for (int i = 0; i < DIMENSION_ROW; i++) {
            for (int j = 0; j < DIMENSION_COLUMN; j++) {
                this.spaces[i][j] = new CircleSpace(Color.EMPTY);
            }
        }
    }

    public Color getColor(Coordinate coordinate){
        return this.spaces[coordinate.getRow()][coordinate.getColumn()].getColor();
    }

    public Integer getRow() {
        return DIMENSION_ROW;
    }

    public Integer getColumn() {
        return DIMENSION_COLUMN;
    }

}
