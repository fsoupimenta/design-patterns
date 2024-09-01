package org.example.behavioural.command;

public class AddVertex implements Action {

    private final Graph graph;

    public AddVertex(Graph graph) {
        this.graph = graph;
    }

    @Override
    public void execute() {
        this.graph.addVertex();
    }

    @Override
    public void cancel() {
        this.graph.removeVertex();
    }

}
