package connect4.v3.views.console;

import connect4.v2.models.Game;
import connect4.v2.utils.Message;
import connect4.v2.utils.YesNoDialog;

public class ResumeView extends InteractiveView {

    public ResumeView(Game game) {
        super(game);
     }

     public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.game.reset();
        }
        return isResumed.isAffirmative();
    }


}
