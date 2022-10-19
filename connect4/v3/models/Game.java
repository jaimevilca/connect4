package connect4.v3.models;

import connect4.v3.types.Color;
import connect4.v3.types.Coordinate;
import connect4.v3.types.Direction;

import java.util.List;

public class Game {

    private Board board;
    private Turn turn;

    int MIN_RESULT_SIZE = 4;

    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    public void reset() {
        this.board.reset();
        this.turn.reset();
    }

    public void next() {
        this.turn.nextPlayer();
    }

    public int getCurrentPlayer() {
        return this.turn.getCurrentPlayer();
    }

    public void putToken(int column) {
        this.turn.putToken(column);
    }

    public boolean isFinished() {
        return this.turn.isAllTokensAdded();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isConnect4() {
        List<Direction[]> directions = Direction.getAllDirections();
        for (Direction[] direction : directions) {
            if (this.isDirectionValid(direction)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDirectionValid(Direction[] directions) {
        int totalTokens = 1;
        for (Direction direction : directions) {
            totalTokens += countValidTokens(direction);
        }
        return totalTokens >= MIN_RESULT_SIZE;
    }

    public int countValidTokens(Direction direction) {

        int tokens = 0;
        Coordinate nextCoordinate = direction.increment(this.board.getLastToken());
        while (this.board.isCoordinateValid(nextCoordinate)
                && this.board.getCurrentColor().equals(this.board.getColor(nextCoordinate))) {
            tokens++;
            nextCoordinate = direction.increment(nextCoordinate);
        }
        return tokens;
    }

    public Color getColor(Coordinate coordinate) {
        return this.board.getColor(coordinate);
    }

    public Integer getNextRow(int column) {
        return this.board.getNextRow(column);
    }

    public Integer getDimensionRow() {
        return Board.DIMENSION_ROW;
    }

    public Integer getDimensionColumn() {
        return Board.DIMENSION_COLUMN;
    }



}
