package connect4.v1;

import connect4.v1.utils.Message;
import connect4.v2.utils.YesNoDialog;

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
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.board.reset();
        }
        return isResumed.isAffirmative();
    }

    private void play() {
        Message.TITLE.writeln();
        this.board.write();
        do {
            this.turn.move();
            this.board.write();
        } while (!this.isConnect4());
        Message.PLAYER_WIN.writeln(this.turn.getCurrentPlayer());
    }


    private boolean isConnect4() {
        return this.board.isConnect4();
    }

    public static void main(String[] args) {
        new Connect4().start();
    }

}