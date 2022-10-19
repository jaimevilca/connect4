package connect4.v3.types;

public enum Color {
    RED,
    BLUE,
    NULL;

    public boolean isNull() {
        return Color.NULL.equals(this);
    }

}
