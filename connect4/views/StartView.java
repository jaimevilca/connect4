package connect4.views;



import connect4.model.Game;
import connect4.other.Message;
import connect4.types.Coordinate;
import utils.Console;

public class StartView {

    private Game game;

    public StartView(Game game) {
        this.game = game;
    }

    public void interact() {
        Message.TITLE.writeln();

        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                this.game.getColor(new Coordinate(i,j));
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();

    }

}
