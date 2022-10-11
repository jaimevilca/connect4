package connect4.v1;

import connect4.v1.utils.Console;

public enum Color {
    RED,
    BLUE;

    void write() {
        String string = this.name().substring(0,1);
        Console.getInstance().write(string);
    }

}
