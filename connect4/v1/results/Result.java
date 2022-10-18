package connect4.v1.results;

import connect4.v1.Board;
import connect4.v1.Color;

interface Result {

 boolean valid(Board board, Color color);
}
