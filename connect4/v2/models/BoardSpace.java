package connect4.v2.models;

import connect4.v2.types.Color;
import connect4.v2.types.Coordinate;

public class BoardSpace {

    public Token token;

    public Coordinate coordinate;

    public BoardSpace() {
    }

    public BoardSpace(Coordinate coordinate) {
        this.coordinate = coordinate;
    }


    public void setToken(Token token) {
        this.token = token;
    }

    public Token getToken() {
        return token;
    }

    public Color getColor() {
        if (this.getToken() != null)
            return this.getToken().getColor();
        else return null;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }


}
