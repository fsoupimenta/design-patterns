package org.example.behavioural.command;

public class Graph {

    private GraphState state;

    public Graph() {
        this.state = GraphState.EMPTY;
    }

    public String getState() {
        return this.state.toString();
    }

    public void addVertex() {
        this.state = GraphState.VERTEX_ADDED;
    }

    public void removeVertex() {
        this.state = GraphState.VERTEX_REMOVED;
    }

}
