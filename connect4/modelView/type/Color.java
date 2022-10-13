package connect4.modelView.type;

public enum Color {
    RED,
    BLUE,
    EMPTY;

    public boolean isNull() {
        return this.equals(EMPTY);
    }
}
