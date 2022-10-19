package connect4.v3.views.console;

import connect4.v3.controllers.Controller;

public abstract class InteractiveView<T extends Controller> {
    protected T controller;

    public InteractiveView(T controller) {
        this.controller = controller;
    }
    
}
