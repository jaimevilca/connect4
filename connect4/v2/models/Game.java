package connect4.v2.models;

import connect4.v2.types.Color;
import connect4.v2.types.Coordinate;
import connect4.v2.utils.Message;

public class Game {

    private Board board;
    private Turn turn;


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

    public Color getCurrentColor() {
        return this.turn.getCurrentColor();
    }

    public int getCurrentPlayer() {
        return this.turn.getCurrentPlayer();
    }

    public void putToken(int column) {
        this.turn.putToken(column);
    }

    public boolean isConnect4() {
        return isFinished() || this.board.isConnect4(this.turn.getCurrentColor());
    }
    public boolean isFinished() {
        return this.turn.isTokensCompleted();
    }



    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }
}
