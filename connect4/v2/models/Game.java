package connect4.v2.models;

import connect4.v2.results.WinnerResultValidator;
import connect4.v2.types.Color;

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


    public int getCurrentPlayer() {
        return this.turn.getCurrentPlayer();
    }

    public void putToken(int column) {
        this.turn.putToken(column);
    }

    public boolean isConnect4() {
        return new WinnerResultValidator().valid(this.board);
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


}
