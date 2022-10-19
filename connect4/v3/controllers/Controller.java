package connect4.v3.controllers;


import connect4.v3.models.Board;
import connect4.v3.models.Game;
import connect4.v3.types.Color;
import connect4.v3.types.Coordinate;

public abstract class Controller {

    protected Game game;

    public Controller(Game game) {
        this.game = game;
    }

    public Color getColor(Coordinate coordinate) {
        return this.game.getColor(coordinate);
    }

    public Integer getDimensionRow() {
        return this.game.getDimensionRow();
    }

    public Integer getDimensionColumn() {
        return this.game.getDimensionColumn();
    }
}
