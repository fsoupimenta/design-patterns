package org.example.behavioural.interpreter;

public abstract class Interpreter {

    protected String left;
    protected String right;

    public Interpreter(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public abstract String interpret();
}
