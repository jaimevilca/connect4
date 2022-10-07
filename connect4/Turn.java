package connect4;

public class Turn {

    static final int NUMBER_PLAYERS = 2;
    private Player[] players;

    private Board board;
    private int currentPlayer;



    Turn(Board board) {
        assert board != null;
        this.board = board;
        this.players = new Player[Turn.NUMBER_PLAYERS];
        this.reset();
    }

    private void reset() {

        for (int i = 0; i < NUMBER_PLAYERS; i++) {
            this.players[i] = new Player(Color.values()[i], this.board);
        }

        this.currentPlayer = 0;
    }

    public Color getCurrentColor() {
        return this.players[this.currentPlayer].getColor();
    }

    public void move() {
        this.players[this.currentPlayer].play();
        if(!this.board.isFinished(getCurrentColor())){
            nextPlayer();
        }
    }

    private void nextPlayer() {
        this.currentPlayer = (this.currentPlayer + 1) % Turn.NUMBER_PLAYERS;
    }

}
