package connect4;

public class Board {

    CircleSpace[][] spaces;

    Board() {
        this.spaces = new CircleSpace[Coordinate.DIMENSION_ROW][Coordinate.DIMENSION_COLUMN];
        this.reset();
    }

    private void reset() {
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                this.spaces[i][j] = null;
            }
        }
    }

    public void write() {
    }

    public boolean isConnect4(Object currentColor) {
        return false;
    }

}
