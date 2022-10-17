package connect4.v2.types;

import connect4.v2.utils.Console;

public enum Color {
    RED,
    BLUE,
    NULL;

    public boolean isNull(){
        return Color.NULL.equals(this);
    }


}