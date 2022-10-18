package connect4.v1;

import connect4.v1.utils.Console;

public class CircleSpace {

    public static final String SPACE = "*";

    public Token token;

    public Coordinate coordinate;

    public CircleSpace() {
    }

    public CircleSpace(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
    public CircleSpace(Token token) {
        this.token = token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Token getToken() {
        return token;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void write() {
        if (token == null)
            Console.getInstance().write(SPACE);
        else
            this.token.getColor().write();
    }


}
