package connect4.v2.models;

import connect4.v2.types.Color;

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

    public void reset() {

        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            this.players[i] = new Player(Color.values()[i], this.board);
        }

        this.currentPlayer = 0;
    }


    public void putToken(int column) {

        if (!isAllTokensAdded()){
            this.players[this.currentPlayer].putToken(column);
        }
    }

    public boolean isAllTokensAdded() {
        int totalTokens = 0;
        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            totalTokens += this.players[i].getPutTokens();
        }
        return totalTokens == Board.DIMENSION_ROW * Board.DIMENSION_COLUMN;

    }

    public void nextPlayer() {
        this.currentPlayer = (this.currentPlayer + 1) % Turn.NUMBER_PLAYERS;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
}
