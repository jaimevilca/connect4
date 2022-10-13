package connect4.v2.results;

import connect4.v2.models.Board;

public class WinnerResultValidator implements ResultValidator {

    ResultValidator winnerResultValidators[];

    public WinnerResultValidator() {
        winnerResultValidators = new ResultValidator[4];
        winnerResultValidators[0] = new HorizontalResultValidator();
        winnerResultValidators[1] = new VerticalResultValidator();
        winnerResultValidators[2] = new DiagonalResultValidator();
        winnerResultValidators[3] = new InvertedDiagonalResultValidator();
    }


    @Override
    public boolean valid(Board board) {

        for (int i = 0; i < winnerResultValidators.length; i++) {
            if (winnerResultValidators[i].valid(board))
                return true;
        }
        return false;
    }
}
