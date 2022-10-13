package connect4.modelView.model;

import connect4.modelView.type.Color;

public class Game {

    private Board board;
    private Turn turn;

    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    public Integer getDimensionRow() {
        return this.board.getRow();
    }

    public Integer getDimensionColumn() {
        return this.board.getColumn();
    }

    public Color getColor(Coordinate coordinate) {
        return this.board.getColor(coordinate);
    }

}
