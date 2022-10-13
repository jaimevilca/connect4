package connect4.modelView.view;

import connect4.domainModel.utils.Console;

public enum Message {
    TITLE("#########CONNECT4#######"),
    HORIZONTAL_LINE("---------------"),
    VERTICAL_LINE(" | "),
    PLAYER_WIN("#player player: You win!!! :-)"),
    ENTER_COLUMN_TO_PUT("Put token column position: "), 
    RESUME("Try again? (Y/N):");


    private String message;

    Message(String message) {
        this.message = message;
    }

    void write() {
        Console.getInstance().write(this.message);
    }

    void writeln() {
        Console.getInstance().writeln(this.message);
    }

    void writeln(String player) {
        assert this == Message.PLAYER_WIN;
        Console.getInstance().writeln(this.message.replaceAll("#player", "" + player));
    }

    @Override
    public String toString() {
        return message;
    }


}
