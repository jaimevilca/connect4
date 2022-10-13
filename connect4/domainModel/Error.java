package connect4.domainModel;

import connect4.domainModel.utils.Console;

enum Error {

    NOT_EMPTY("The circle is not empty"),
    NULL;

    private String message;

    Error() {
    }

    Error(String message) {
        this.message = message;
    }

    void writeln() {
        if (!this.isNull()) {
            Console.getInstance().writeln(this.message);
        }
    }

    public boolean isNull() {
        return this == Error.NULL;
    }
}
