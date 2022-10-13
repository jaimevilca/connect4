package connect4.domainModel;

import connect4.domainModel.utils.Console;

public enum Color {
    RED,
    BLUE,
    EMPTY;

    void write() {
        String string = this.name().substring(0,1);
        if(this.equals(EMPTY))
            string = "*";
        Console.getInstance().write(string);
    }

    public boolean isNull() {
        return this.equals(EMPTY);
    }

}
