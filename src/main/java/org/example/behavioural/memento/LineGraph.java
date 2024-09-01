package org.example.behavioural.memento;

public class LineGraph implements GraphState {

    private static LineGraph instance = new LineGraph();

    public static LineGraph getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return GraphLifeCycle.LINE_GRAPH.toString();
    }

    @Override
    public void applyChanges(Graph graph) {
        graph.addVertex();
        graph.addVertex();
        graph.addEdge(0, 1);
    }
}
