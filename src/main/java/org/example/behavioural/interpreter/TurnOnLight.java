package org.example.behavioural.interpreter;

public class TurnOnLight extends Interpreter {

    public TurnOnLight(String room) {
        super(room, null);
    }

    @Override
    public String interpret() {
        return "Turning on the light in the " + left;
    }
}
