package connect4.v3.views.console;

import connect4.v3.controllers.ResumeController;
import connect4.v3.utils.Message;
import connect4.v3.utils.YesNoDialog;

public class ResumeView extends InteractiveView<ResumeController> {

    public ResumeView(ResumeController controller) {
        super(controller);
    }

    public boolean interact() {
        YesNoDialog isResumed = new YesNoDialog();
        isResumed.read(Message.RESUME.toString());
        if (isResumed.isAffirmative()) {
            this.controller.reset();
        }
        return isResumed.isAffirmative();
    }


}
