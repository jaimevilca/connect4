package connect4.views;

import connect4.model.Game;

public class View {

    private Game game;

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(Game game) {
        this.game = game;
        this.startView = new StartView(this.game);
        this.playView = new PlayView(this.game);
        this.resumeView = new ResumeView(this.game);
    }

    public void start() {
        this.startView.interact();
    }

    public void play() {
        this.playView.interact();
    }

    public boolean resume() {
        return this.resumeView.interact();
    }

}
