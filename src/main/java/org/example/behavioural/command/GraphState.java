package org.example.behavioural.command;

public enum GraphState {
    EMPTY("Graph is empty."), VERTEX_ADDED("Vertex added to graph."),
    VERTEX_REMOVED("Vertex removed from graph.");

    private final String description;

    private GraphState(String description) {
        this.description = description;
    }

    public String toString() {
        return this.description;
    }
}
