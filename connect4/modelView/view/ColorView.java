package connect4.modelView.view;

import connect4.modelView.model.Coordinate;
import connect4.modelView.model.Game;
import connect4.modelView.type.Color;
import connect4.modelView.utils.Console;

public class ColorView extends GameView {

    public ColorView(Game game) {
        super(game);
    }

    public void write(Coordinate coordinate) {

        Color color = this.game.getColor(coordinate);
        String string = color.name().substring(0, 1);
        if (color.isNull()) {
            string = "*";
        }

        Console.getInstance().write(string);

    }

}
