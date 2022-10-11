package connect4.v1;

import connect4.v1.utils.Message;

public class Connect4 {

    private Board board;
    private Turn turn;


    Connect4() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    private void start() {
        do {
            this.play();
        } while (this.isResumeGame());
    }

    private boolean isResumeGame() {
        return false;
    }

    private void play() {
        Message.TITLE.writeln();
        this.board.write();
        do {
            this.turn.move();
            this.board.write();
        } while (!this.isConnect4());
    }


    private boolean isConnect4() {
        return this.board.isConnect4(this.turn.getCurrentColor());
    }

    public static void main(String[] args) {
        new Connect4().start();
    }
    
}