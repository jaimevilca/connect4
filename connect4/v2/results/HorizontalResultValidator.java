package connect4.v2.results;

import connect4.v2.types.Direction;


public class HorizontalResultValidator extends LineResultValidator implements ResultValidator {

    @Override
    public Direction[] getDirections() {
        return new Direction[]{Direction.LEFT, Direction.RIGHT};
    }
}
