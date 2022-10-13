package connect4.modelView.view;

import connect4.modelView.model.Coordinate;
import connect4.modelView.model.Game;
import connect4.modelView.utils.Console;

public class BoardView extends GameView{

    public BoardView(Game game) {
        super(game);
    }

    public void print() {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < this.game.getDimensionRow(); i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < this.game.getDimensionColumn(); j++) {
                new ColorView(game).write(new Coordinate(i, j));                
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();
    }

}
