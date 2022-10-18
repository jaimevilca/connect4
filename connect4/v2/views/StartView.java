package connect4.v2.views;

import connect4.v2.models.Game;
import connect4.v2.utils.Message;

public class StartView extends InteractiveView {

    StartView(Game game) {
        super(game);
    }

    void interact() {
        Message.TITLE.writeln();
        new BoardView().write(this.game.getBoard());
    }

}
