package org.example.behavioural.memento;

public class NullGraph implements GraphState {

    private static NullGraph instance = new NullGraph();

    public static NullGraph getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return GraphLifeCycle.NULL.toString();
    }

    @Override
    public void applyChanges(Graph graph) {
        // Não há alterações para um grafo nulo
    }
}
