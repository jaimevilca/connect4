package connect4.v2.views;

import connect4.v2.models.Game;

public abstract class InteractiveView {
    Game game;

    public InteractiveView(Game game) {
        this.game = game;
    }

    public abstract void interact();
}
