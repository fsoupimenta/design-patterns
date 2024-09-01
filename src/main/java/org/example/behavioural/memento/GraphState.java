package org.example.behavioural.memento;

public interface GraphState {
    String getState();
    void applyChanges(Graph graph);
}
