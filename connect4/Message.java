package connect4;

import utils.Console;

public enum Message {
    TITLE("#########CONNECT4#######"),
    PLAYER_WIN("#player player: You win!!! :-)");


    private String message;
    
    Message(String message){
        this.message = message;
    }

    void write() {
		Console.getInstance().write(this.message);
	}

	void writeln() {
		Console.getInstance().writeln(this.message);
	}

    void writeln(String player){
        assert this == Message.PLAYER_WIN;
        Console.getInstance().writeln(this.message.replaceAll("#player", "" + player));
    }

    @Override
    public String toString() {        
        return message;
    }



}
