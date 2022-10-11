package connect4.views;

import connect4.model.Game;
import connect4.other.Message;
import connect4.types.Error;

public class PlayView {

    private Game game;

    public PlayView(Game game) {
        this.game = game;
    }

    public void interact() {

        int column;
        Error error;
        do {
            column = this.getColumn(Message.ENTER_COLUMN_TO_PUT);
            error = this.getPutTokenError(column);
        } while (error != Error.NULL);
        this.game.putToken(column);
        
    }

    private Error getPutTokenError(int column) {
        assert column != 0;

        Error error = Error.NULL;
        if(!this.game.board.isEmpty(column)){
            error = Error.NOT_EMPTY;
        }

        error.writeln();
        return error;
    }

    int getColumn(Message message) {
        return Console.getInstance().readInt(message.toString()) - 1;
    }

}
