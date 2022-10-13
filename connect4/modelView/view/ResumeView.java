package connect4.modelView.view;

import connect4.modelView.model.Game;

public class ResumeView extends GameView{

    public ResumeView(Game game) {
        super(game);
    }

    public boolean interact() {
        return false;
    }

}
