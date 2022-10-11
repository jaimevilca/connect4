package connect4.v2.models;

import connect4.v2.types.Color;

public class Token {
    Color color;


    public Token(Color color) {
        this.color = color;

    }

    public Color getColor() {
        return color;
    }


}
