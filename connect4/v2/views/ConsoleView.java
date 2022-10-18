package connect4.v2.views;

import connect4.v2.utils.Console;

public class ConsoleView {

    void write(String message) {
        Console.getInstance().write(message);
    }
}
