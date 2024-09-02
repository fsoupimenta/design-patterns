package org.example.behavioural.interpreter;

public class TurnOffLight extends Interpreter {

    public TurnOffLight(String room) {
        super(room, null);
    }

    @Override
    public String interpret() {
        return "Turning off the light in the " + left;
    }
}
