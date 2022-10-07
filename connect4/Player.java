package connect4;

import utils.Console;

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

    public void play() {
        int column;
        do {
            column = this.getCoordinate(Message.ENTER_COLUMN_TO_PUT)-1;
        } while (!this.board.hasRowSpace(column));
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
