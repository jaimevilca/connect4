package connect4.v2.results;

import connect4.v2.types.Direction;

public class VerticalResultValidator extends LineResultValidator implements ResultValidator {


    @Override
    public Direction[] getDirections() {
        return new Direction[]{Direction.UP, Direction.DOWN};
    }
}

