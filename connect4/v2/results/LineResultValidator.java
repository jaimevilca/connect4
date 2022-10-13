package connect4.v2.results;

import connect4.v2.models.Board;
import connect4.v2.types.Coordinate;
import connect4.v2.types.Direction;

public abstract class LineResultValidator implements ResultValidator{
    int WINNER_LINE_LENGTH = 4;


    public boolean valid(Board board) {

        int totalTokens = 1;
        for (int i = 0; i < getDirections().length; i++) {
            totalTokens += countValidTokens(board, getDirections()[i]);
        }
        return isLineCompleted(totalTokens );
    }

    public boolean isLineCompleted(int length) {
        return length >= WINNER_LINE_LENGTH;
    }

    public abstract Direction[] getDirections();

    public int countValidTokens(Board board, Direction direction) {

        int tokens = 0;
        Coordinate nextCoordinate = direction.move(board.getCurrentCoordinate());
        while (board.isCoordinateValid(nextCoordinate)
                && board.getCurrentColor().equals(board.getCircleSpace(nextCoordinate).getColor())) {
            tokens++;
            nextCoordinate = direction.move(nextCoordinate);
        }

        return tokens;
    }
}
