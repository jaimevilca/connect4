package connect4.v2.results;

import connect4.v2.models.Board;
import connect4.v2.types.Color;

interface Result {

 boolean valid(Board board, Color color);
}
