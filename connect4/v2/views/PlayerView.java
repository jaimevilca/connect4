package connect4.v2.views;

import connect4.v2.models.Game;
import connect4.v2.utils.Console;
import connect4.v2.utils.Message;

public class PlayerView extends InteractiveView {

    PlayerView(Game game) {
        super(game);
    }

    void interact() {
        Message.PLAYER_TURN.writeln(this.game.getCurrentPlayer());
        int column;
        do {
            column = Console.getInstance().readInt(Message.ENTER_COLUMN_TO_PUT.toString()) - 1;
        } while (!this.game.getBoard().hasRowSpace(column));
        this.game.putToken(column);
    }

}
