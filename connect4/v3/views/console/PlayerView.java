package connect4.v3.views.console;

import connect4.v3.controllers.PlayController;
import connect4.v3.utils.Console;
import connect4.v3.utils.Message;

public class PlayerView extends InteractiveView<PlayController> {

    PlayerView(PlayController controller) {
        super(controller);
    }

    public void interact() {
        Message.PLAYER_TURN.writeln(this.controller.getCurrentPlayer());
        int column;
        do {
            column = Console.getInstance().readInt(Message.ENTER_COLUMN_TO_PUT.toString()) - 1;
        } while (this.controller.getNextRow(column) == null);
        this.controller.putToken(column);
    }

}
