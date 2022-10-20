package connect4.v1;

import connect4.v1.utils.Console;
import connect4.v1.utils.Message;

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
        } while (this.board.getNextRow(column) == null);
        this.board.putToken(column, this.color);
        this.putTokens++;
    }

    int getCoordinate(Message message) {
        return Console.getInstance().readInt(message.toString());
    }

}
