package connect4.v2.views;

import connect4.v2.models.Board;
import connect4.v2.models.CircleSpace;
import connect4.v2.types.Coordinate;
import connect4.v2.utils.Console;
import connect4.v2.utils.Message;

public class BoardView extends ConsoleView {

    public void write(Board board) {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < Coordinate.DIMENSION_ROW; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < Coordinate.DIMENSION_COLUMN; j++) {
                new CircleSpaceView().write(board.getCircleSpace(new Coordinate(i,j)));
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();

    }
}
