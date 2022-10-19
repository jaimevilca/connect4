package connect4.v3;

import connect4.v3.views.View;
import connect4.v3.views.console.ConsoleView;

public class ConsoleConnect4 extends Connect4 {

    protected View createView() {
        return new ConsoleView(this.startController, this.playController, this.resumeController);
    }

    public static void main(String[] args) {
        new ConsoleConnect4().play();
    }


 

}