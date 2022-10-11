package connect4.v2.views;

import connect4.v2.models.Board;
import connect4.v2.models.CircleSpace;
import connect4.v2.types.Coordinate;
import connect4.v2.utils.Console;
import connect4.v2.utils.Message;

public class CircleSpaceView extends ConsoleView {

    public void write(CircleSpace circleSpace) {

            if (circleSpace.getToken() == null)
                this.write("*");
            else
                new ColorView().write(circleSpace.getToken().getColor());


    }
}
