package connect4.domainModel;

import java.util.ArrayList;
import java.util.List;

import connect4.domainModel.utils.Console;
import connect4.domainModel.utils.Direction;

public class Board {

    CircleSpace[][] spaces;

    public static final int DIMENSION_ROW = 7;
    public static final int DIMENSION_COLUMN = 6;

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

    public void write() {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < DIMENSION_ROW; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < DIMENSION_COLUMN; j++) {
                this.spaces[i][j].write();
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();

    }

    public boolean hasRowSpace(int column) {
        return getNextRowCircleSpace(column) != null;
    }

    public CircleSpace getNextRowCircleSpace(int column) {

        for (int j = DIMENSION_ROW - 1; j >= 0; j--) {
            if (this.spaces[j][column].getColor() == Color.EMPTY)
                return this.spaces[j][column];
        }
        return null;
    }



    public void putToken(int column, Color color) {
        CircleSpace circleSpace = getNextRowCircleSpace(column);
        circleSpace.setColor(color);
    }

    public boolean isConnect4(Color color) {
        assert !color.isNull();

        List<Direction> directions = this.getDirections(color);
        if (directions.size() < Coordinate.DIMENSION - 1) {
            return false;
        }
        for (int i = 0; i < directions.size() - 1; i++) {
            if (directions.get(i) != directions.get(i + 1)) {
                return false;
            }
        }
        return !directions.get(0).isNull();
    }

    private List<Direction> getDirections(Color color) {
        assert !color.isNull();
        List<Direction> directions = new ArrayList<>();
        List<Coordinate> coordinates = this.getCoordinates(color);
        if (!coordinates.isEmpty()) {
            for (int i = 0; i < coordinates.size() - 1; i++) {
                directions.add(coordinates.get(i).getDirection(coordinates.get(i + 1)));
            }
        }
        return directions;
    }

    private List<Coordinate> getCoordinates(Color color) {
        assert !color.isNull();

		List<Coordinate> coordinates = new ArrayList<>();
		for (int i = 0; i < DIMENSION_ROW; i++) {
			for (int j = 0; j < DIMENSION_COLUMN; j++) {
				if (this.spaces[i][j].getColor() == color) {
					coordinates.add(new Coordinate(i, j));
				}
			}
		}
		return coordinates;
    }

    public boolean isFinished(Color color) {

        return false;
    }

    public boolean isEmpty(int column) {
        return this.hasRowSpace(column);
    }
}
