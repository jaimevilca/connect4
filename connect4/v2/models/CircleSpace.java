package connect4.v2.models;

import connect4.v2.types.Coordinate;
import connect4.v2.utils.Console;

public class CircleSpace {

    public static final String SPACE = "*";

    public Token token;

    Coordinate coordinate;

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




}
