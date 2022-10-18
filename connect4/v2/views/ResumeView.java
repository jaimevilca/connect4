package connect4.v2.views;

import connect4.v2.models.Game;
import connect4.v2.utils.Message;
import connect4.v2.utils.YesNoDialog;

public class ResumeView extends InteractiveView {

    ResumeView(Game game) {
        super(game);
     }

    boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.game.reset();
        }
        return isResumed.isAffirmative();
    }


}
