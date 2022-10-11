package connect4.other;

import connect4.model.Board;
import connect4.types.Color;

public class Player {

    Color color;
    Board board;
    private int putTokens;

    public Player(Color color, Board board) {
        this.color = color;
        this.board = board;
    }

    public Color getColor() {
        return this.color;
    }
    

    public int getPutTokens() {
        return putTokens;
    }

    public void writeResult() {
    }

    public void putToken(int column) {
        this.board.putToken(column, this.color);
        this.putTokens++;
    }
}
