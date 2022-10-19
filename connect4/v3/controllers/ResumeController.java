package connect4.v3.controllers;

import connect4.v3.models.Game;

public class ResumeController  extends Controller {

    public ResumeController(Game game) {
        super(game);
    }

    public void reset() {
        this.game.reset();
    }
}
