package org.example.behavioural.interpreter;

import java.util.Arrays;
import java.util.List;

public class LightControlInterpreter {

    private String command;

    public LightControlInterpreter(String command) {
        this.command = command;
    }

    public String interpret() {
        List<String> elements = Arrays.asList(command.split(" "));
        String room = null;
        Interpreter interpreter = null;

        if (elements.size() != 4) {
            throw new IllegalArgumentException("Invalid command format.");
        }

        room = elements.get(2);

        if (elements.get(0).equals("turn") && elements.get(1).equals("on")) {
            interpreter = new TurnOnLight(room);
        }

        if (elements.get(0).equals("turn") && elements.get(1).equals("off")) {
            interpreter = new TurnOffLight(room);
        }

        if (interpreter == null) {
            throw new IllegalArgumentException("Unknown command.");
        }

        return interpreter.interpret();
    }
}
