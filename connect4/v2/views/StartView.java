package connect4.v2.views;

import connect4.v2.models.Game;
import connect4.v2.utils.Message;

public class StartView extends InteractiveView {

    StartView(Game game) {
        super(game);
    }

    public void interact() {
        Message.TITLE.writeln();
        new BoardView(this.game).interact();
    }

}
