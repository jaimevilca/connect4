package connect4.v2.results;

import connect4.v2.models.Board;
import connect4.v2.types.Color;

public class VerticalResult implements Result {
    @Override
    public boolean valid(Board board, Color color) {

        //TODO valid horizontal winner result
        return false;
    }
}
