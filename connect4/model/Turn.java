package connect4.model;

import connect4.other.Player;
import connect4.types.Color;
import connect4.types.Coordinate;

public class Turn {

    static final int NUMBER_PLAYERS = 2;
    private Player[] players;

    private Board board;
    private int currentPlayer;

    Turn(Board board) {
        assert board != null;
        this.board = board;
        this.players = new Player[Turn.NUMBER_PLAYERS];
        this.reset();
    }

    void reset() {

        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            this.players[i] = new Player(Color.values()[i], this.board);
        }

        this.currentPlayer = 0;
    }

    public Color getCurrentColor() {
        return this.players[this.currentPlayer].getColor();
    }

    public void move() {        
        if (!this.board.isFinished(getCurrentColor())) {
            nextPlayer();
        }
    }

    private void nextPlayer() {
        this.currentPlayer = (this.currentPlayer + 1) % Turn.NUMBER_PLAYERS;
    }

    void writeResult(){
        this.players[this.currentPlayer].writeResult();
    }

    public void next() {
    }

    public boolean areAllTokensOnBoard() {
        return false;
    }

    public void putToken(int column) {
        this.getCurrentPlayer().putToken(column);
    }

	private Player getCurrentPlayer() {
        return this.players[this.currentPlayer];
    }

    public boolean isEmptyColumn(int column) {
		return this.board.isEmpty(column);
	}

	public void moveToken(Coordinate origin, Coordinate target) {
	}

	public Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
		return null;
	}

}
