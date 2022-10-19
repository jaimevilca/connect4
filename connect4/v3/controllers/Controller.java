package connect4.v3.controllers;

import connect4.v3.models.Game;

public abstract class Controller {

    protected Game game;

    public Controller(Game game) {
        this.game = game;
    }


}
