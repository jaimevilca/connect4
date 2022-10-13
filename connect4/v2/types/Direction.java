package connect4.v2.types;

public enum Direction {
    RIGHT(1, 0),
    LEFT(-1, 0),
    UP(0, 1),
    DOWN(0, -1),
    UP_RIGHT(1, 1),
    UP_LEFT(-1, 1),
    DOWN_RIGHT(1, -1),
    DOWN_LEFT(-1, -1);

    private Coordinate incremental;

    Direction(int x, int y) {
        incremental = new Coordinate(y, x);
    }

    public Coordinate move(Coordinate incrementalCoordinate) {
        return new Coordinate(this.incremental.getRow() + incrementalCoordinate.getRow(), this.incremental.getColumn() + incrementalCoordinate.getColumn());
    }
}
