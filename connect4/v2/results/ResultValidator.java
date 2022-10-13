package connect4.v2.results;

import connect4.v2.models.Board;

interface ResultValidator {

    boolean valid(Board board);
}
