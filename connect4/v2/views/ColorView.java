package connect4.v2.views;

import connect4.v2.types.Color;

public class ColorView extends ConsoleView {

    void write(Color color) {

        if (color.isNull()) {
            this.write("*");
        } else {
            String string = color.name().substring(0, 1);
            this.write(string);
        }

    }

}
