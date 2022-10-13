package connect4.modelView.view;

import connect4.modelView.model.Game;

public class StartView extends GameView{

    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        Message.TITLE.writeln();
        new BoardView(game).print();
    }

}
