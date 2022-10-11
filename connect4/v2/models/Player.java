package connect4.v2.models;

import connect4.v2.types.Color;
import connect4.v2.utils.Console;
import connect4.v2.utils.Message;

public class Player {

    Color color;
    Board board;
    private int putTokens;

    public Player(Color color, Board board) {
        this.color = color;
        this.board = board;
    }

    public Color getColor() {
        return null;
    }



    void putToken(int column) {
        this.board.putToken(column, this.color);
        this.putTokens++;
    }

    int getCoordinate(Message message) {
        return Console.getInstance().readInt(message.toString());
    }

    public int getPutTokens() {
        return putTokens;
    }
}
