package connect4.v2.views;

import connect4.v2.models.BoardSpace;

public class CircleSpaceView extends ConsoleView {

    public void write(BoardSpace boardSpace) {

            if (boardSpace.getToken() == null)
                this.write("*");
            else
                new ColorView().write(boardSpace.getToken().getColor());


    }
}
