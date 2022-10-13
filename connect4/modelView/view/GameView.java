package connect4.modelView.view;

import connect4.modelView.model.Game;

public abstract class GameView {
    protected Game game;

    public GameView(Game game) {
        this.game = game;
    }



}
