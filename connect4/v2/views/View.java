package connect4.v2.views;

import connect4.v2.models.Game;

public class View {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(Game game) {
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

    public boolean resume() {
        return this.resumeView.interact();
    }
}
