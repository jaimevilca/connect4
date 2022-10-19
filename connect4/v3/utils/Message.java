package connect4.v3.utils;

public enum Message {
    TITLE("#########CONNECT4#######"),
    HORIZONTAL_LINE("---------------"),
    VERTICAL_LINE(" | "),

    ENTER_COLUMN_TO_PUT("Put token column position "),

    PLAYER_WIN("#player player: You win!!! :-)"),

    GAME_FINISHED("Game finished - Draw"),

    RESUME("Reset game? y / n "),

    PLAYER_TURN("player #player turn ");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public void write() {
        Console.getInstance().write(this.message);
    }

    public void writeln() {
        Console.getInstance().writeln(this.message);
    }

   public void writeln(int player) {
        Console.getInstance().writeln(this.message.replaceAll("#player", "" + player));
    }

    @Override
    public String toString() {
        return message;
    }


}
