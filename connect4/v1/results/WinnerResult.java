package connect4.v1.results;

import connect4.v1.Board;
import connect4.v1.Color;

public class WinnerResult implements Result {

    Result winnerResults[];

    public WinnerResult() {
        winnerResults = new Result[2];
        winnerResults[0] = new VerticalResult();
        winnerResults[1] = new HorizontalResult();

    }


    @Override
    public boolean valid(Board board, Color color) {

        for (int i = 0; i < winnerResults.length; i++) {
            if (winnerResults[i].valid(board, color))
                return true;
        }
        return false;
    }
}
