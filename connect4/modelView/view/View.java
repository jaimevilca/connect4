package connect4.modelView.view;

import connect4.modelView.model.Game;

public class View extends GameView {

    StartView startView;
    PlayView playView;
    ResumeView resumeView;
    
    public View(Game game) {
        super(game);
        this.startView = new StartView(game);
        this.playView = new PlayView(game);
        this.resumeView = new ResumeView(game);
    }

    public void start() {
        this.startView.interact();
    }

    public void play() {
        this.playView.interact();
    }

    public boolean isResumeGame() {
        return this.resumeView.interact();
    }

}
