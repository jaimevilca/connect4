package connect4.model;

import connect4.types.Color;
import connect4.types.Coordinate;

public class Game {

    private Board board;
    private Turn turn;
    
    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    public void reset() {
        this.board.reset();
        this.turn.reset();
    }

    public void next() {
        this.turn.next();
    }

    public Color getCurrentColor() {
        return this.turn.getCurrentColor();
    }

    public boolean isConnect4() {
        return this.board.isConnect4(this.turn.getCurrentColor());
    }

    public Color getColor(Coordinate coordinate) {
        return this.board.getColor(coordinate);
    }

    public boolean areAllTokensOnBoard() {
        return this.turn.areAllTokensOnBoard();
    }

    public void putToken(int column) {
        this.turn.putToken(column);
    }

    public Error getPutTokenError(Coordinate coordinate) {
        
        return this.turn.isEmptyColumn(coordinate);
    }

    public void moveToken(Coordinate origin, Coordinate target) {
        this.turn.moveToken(origin, target);
    }

    public Error getOriginMoveTokenError(Coordinate coordinate) {
        return this.turn.isEmptyColumn(coordinate);
    }

    public Error getTargetMoveTokenError(Coordinate origin, Coordinate target) {
        return this.turn.getTargetMoveTokenError(origin, target);
    }

    


}
