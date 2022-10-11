package connect4;

import connect4.model.Game;
import connect4.views.View;

public class Connect4 {

    private Game game;
    private View view;

    Connect4() {
        this.game = new Game();
        this.view = new View(this.game);
    }

    private void play() {

        this.view.start();
        do {
            this.view.play();
        } while (this.view.resume());
    }

    public static void main(String[] args) {
        new Connect4().play();
    }

}