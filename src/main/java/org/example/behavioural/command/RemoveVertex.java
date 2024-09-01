package org.example.behavioural.command;

public class RemoveVertex implements Action {

    private final Graph graph;

    public RemoveVertex(Graph graph) {
        this.graph = graph;
    }

    @Override
    public void execute() {
        this.graph.removeVertex();
    }

    @Override
    public void cancel() {
        this.graph.addVertex();
    }

}
