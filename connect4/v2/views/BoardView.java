package connect4.v2.views;

import connect4.v2.models.Board;
import connect4.v2.models.Game;
import connect4.v2.types.Coordinate;
import connect4.v2.utils.Console;
import connect4.v2.utils.Message;

public class BoardView extends InteractiveView {


    public BoardView(Game game) {
        super(game);
    }

    public void interact() {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < Board.DIMENSION_ROW; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < Board.DIMENSION_COLUMN; j++) {
                new ColorView().interact(this.game.getColor(new Coordinate(i,j)));
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();

    }
}
