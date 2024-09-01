package org.example.behavioural.memento;

public class PetersenGraph implements GraphState {

    private static final PetersenGraph instance = new PetersenGraph();

    public static PetersenGraph getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return GraphLifeCycle.PETERSEN_GRAPH.toString();
    }

    @Override
    public void applyChanges(Graph graph) {
        for (int i = 0; i < 10; i++) {
            graph.addVertex();
        }
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);
        graph.addEdge(9, 5);
        graph.addEdge(0, 5);
        graph.addEdge(1, 6);
        graph.addEdge(2, 7);
        graph.addEdge(3, 8);
        graph.addEdge(4, 9);
    }
}
