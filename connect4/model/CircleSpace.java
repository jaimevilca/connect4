package connect4.model;

import connect4.types.Color;

public class CircleSpace {

    public Color color;

    public CircleSpace(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void write() {
        this.color.write();
    }


}