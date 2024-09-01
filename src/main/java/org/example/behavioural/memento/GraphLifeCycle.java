package org.example.behavioural.memento;

public enum GraphLifeCycle {
    NULL("Null Graph"), LINE_GRAPH("Line Graph"), PETERSEN_GRAPH("Petersen Graph");

    private final String name;

    GraphLifeCycle(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
