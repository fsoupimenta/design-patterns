package org.example.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private final List<List<Integer>> adjacencyList;
    private GraphState state;
    private final List<GraphState> memento = new ArrayList<>();

    public Graph() {
        this.adjacencyList = new ArrayList<>();
        this.state = NullGraph.getInstance();
        this.memento.add(this.state);
    }

    public GraphState getState() {
        return this.state;
    }

    public void setState(GraphState state) {
        this.state = state;
        this.memento.add(this.state);
    }

    public List<GraphState> getMemento() {
        return this.memento;
    }

    public void restoreState(int index) {
        if (this.memento.isEmpty()) {
            return;
        }

        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Invalid index");
        }

        this.state = this.memento.get(index);
        this.adjacencyList.clear();
        this.state.applyChanges(this);
    }

    public void undo() {
        if (this.memento.isEmpty()) {
            return;
        }

        int current = this.memento.indexOf(this.state);

        if (current == 0) {
            return;
        }

        this.state = this.memento.get(current - 1);
        this.adjacencyList.clear();
        this.state.applyChanges(this);
    }

    public void addVertex() {
        adjacencyList.add(new ArrayList<>());
    }

    public void addEdge(int v1, int v2) {
        if (v1 >= adjacencyList.size() || v2 >= adjacencyList.size()) {
            throw new IllegalArgumentException("Invalid vertex index");
        }
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
    }

    public String getGraphDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices: ").append(adjacencyList.size()).append("\n");
        sb.append("Edges:\n");
        for (int i = 0; i < adjacencyList.size(); i++) {
            for (int neighbor : adjacencyList.get(i)) {
                if (i < neighbor) {
                    sb.append(i).append(" -- ").append(neighbor).append("\n");
                }
            }
        }
        return sb.toString();
    }
}
