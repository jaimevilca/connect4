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
        return this.color;
    }

    public void play() {        
        int column;
        Error error;
        do {
            column = this.getColumn(Message.ENTER_COLUMN_TO_PUT);
            error = this.getPutTokenError(column);
        } while (error != Error.NULL);
        this.board.putToken(column, this.color);
        this.putTokens++;
    }

    private Error getPutTokenError(int column) {
        assert column != 0;

        Error error = Error.NULL;
        if(!this.board.isEmpty(column)){
            error = Error.NOT_EMPTY;
        }

        error.writeln();
        return error;
    }

    int getColumn(Message message) {
        return Console.getInstance().readInt(message.toString()) - 1;
    }

    public int getPutTokens() {
        return putTokens;
    }

    public void writeResult() {
    }
}
