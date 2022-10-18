package connect4.v2.rules;

import connect4.v2.models.Board;
import connect4.v2.types.Coordinate;
import connect4.v2.types.Direction;

public class LineResultValidator {
    int MIN_LENGTH = 4;

    private Board board;

    public LineResultValidator(Board board) {
        this.board = board;
    }

    public boolean valid(Direction[] directions) {

        int totalTokens = 1;
        for (int i = 0; i < directions.length; i++) {
            totalTokens += countValidTokens(directions[i]);
        }
        return isLineCompleted(totalTokens);
    }

    public boolean isLineCompleted(int length) {
        return length >= MIN_LENGTH;
    }


    public int countValidTokens(Direction direction) {

        int tokens = 0;
        Coordinate nextCoordinate = direction.move(this.board.getLastToken());
        while (this.board.isCoordinateValid(nextCoordinate)
                && this.board.getCurrentColor().equals(this.board.getColor(nextCoordinate))) {
            tokens++;
            nextCoordinate = direction.move(nextCoordinate);
        }

        return tokens;
    }
}
