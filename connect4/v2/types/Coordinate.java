package connect4.v2.types;

public class Coordinate {

    public static final int DIMENSION_ROW = 7;
    public static final int DIMENSION_COLUMN = 6;

    private int x,y ;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
