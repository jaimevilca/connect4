package connect4.v3.types;

import java.util.ArrayList;
import java.util.List;

public enum Direction {
    RIGHT(0, 1),
    LEFT(0, -1),
    UP(1, 0),
    DOWN(-1, 0),
    UP_RIGHT(-1, 1),
    UP_LEFT(-1, -1),
    DOWN_RIGHT(1, 1),
    DOWN_LEFT(1, -1);

    private Coordinate incremental;


    Direction(int row, int column) {
        incremental = new Coordinate(row, column);
    }

    public static List<Direction[]> getAllDirections() {
        List<Direction[]> directions = new ArrayList<>();
        directions.add(new Direction[]{Direction.LEFT, Direction.RIGHT});
        directions.add(new Direction[]{Direction.UP, Direction.DOWN});
        directions.add(new Direction[]{Direction.UP_RIGHT, Direction.DOWN_LEFT});
        directions.add(new Direction[]{Direction.UP_LEFT, Direction.DOWN_RIGHT});
        return directions;
    }

    public Coordinate increment (Coordinate incrementalCoordinate) {
        return new Coordinate(this.incremental.getRow() + incrementalCoordinate.getRow(), this.incremental.getColumn() + incrementalCoordinate.getColumn());
    }


}
