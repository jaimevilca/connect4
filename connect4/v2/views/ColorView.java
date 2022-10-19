package connect4.v2.views;

import connect4.v2.types.Color;
import connect4.v2.utils.Console;

public class ColorView {

    public void interact(Color color) {
        String colorName = "*";
        if (!color.isNull()) {
            colorName = color.name().substring(0, 1);
        }
        Console.getInstance().write(colorName);
    }

}
