package connect4.v3.views.console;

import connect4.v3.types.Color;
import connect4.v3.utils.Console;

public class ColorView {

    public void interact(Color color) {
        String colorName = "*";
        if (!color.isNull()) {
            colorName = color.name().substring(0, 1);
        }
        Console.getInstance().write(colorName);
    }

}
