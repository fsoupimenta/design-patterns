package org.example.behavioural.command;

import java.util.Stack;

public class GraphEditor {

    private final Stack<Action> actions = new Stack<>();

    public void executeAction(Action action) {
        this.actions.add(action);
        action.execute();
    }

    public void cancelLastAction() {
        Action lastAction = actions.pop();
        lastAction.cancel();
    }

}
