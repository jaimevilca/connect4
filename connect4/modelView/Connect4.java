package connect4.modelView;

import connect4.modelView.model.Game;
import connect4.modelView.view.View;

public class Connect4 {

    private Game game;
    private View view;


    Connect4() {
        this.game = new Game();
        this.view = new View(this.game);
    }

    private void start() {
        this.view.start();
        do {
            this.view.play();
        } while (this.view.isResumeGame());
    }


    public static void main(String[] args) {
        new Connect4().start();
    }
    
}