package connect4.v3.controllers;

import connect4.v3.models.Game;

public class PlayController extends Controller {

    public PlayController(Game game) {
        super(game);
    }

    public int getCurrentPlayer() {
        return this.game.getCurrentPlayer();
    }


    public Integer getNextRow(int column) {
        return this.game.getNextRow(column);
    }

    public void putToken(int column) {
        this.game.putToken(column);
    }

    public void nextPlayer() {
        this.game.next();
    }

    public boolean isConnect4() {
        return this.game.isConnect4();
    }

    public boolean isFinished() {
        return this.game.isFinished();
    }
}
