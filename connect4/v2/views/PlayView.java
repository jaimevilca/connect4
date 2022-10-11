package connect4.v2.views;

import connect4.v2.models.Game;
import connect4.v2.utils.Message;

public class PlayView extends InteractiveView{
    public PlayView(Game game) {
        super(game);
    }

    void interact() {
        do {
            new PlayerView(this.game).interact();
            this.game.next();
            new BoardView().write(this.game.getBoard());
        } while (!this.game.isConnect4());
        Message.PLAYER_WIN.writeln(this.game.getCurrentPlayer());
    }
}
