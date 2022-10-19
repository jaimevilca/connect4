package connect4.v3.views.console;
import connect4.v3.controllers.StartController;
import connect4.v3.utils.Message;

public class StartView extends InteractiveView<StartController> {
    
    public StartView(StartController startController) {
        super(startController);
    }

    public void interact() {
        Message.TITLE.writeln();        
        new BoardView(this.controller).interact();
    }

}
