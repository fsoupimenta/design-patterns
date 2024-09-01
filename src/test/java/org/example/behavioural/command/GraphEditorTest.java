package org.example.behavioural.command;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphEditorTest {

    Graph graph;
    GraphEditor editor;

    @BeforeEach
    void setUp() {
        graph = new Graph();
        editor = new GraphEditor();
    }

    @Test
    public void shouldAddVertex() {
        Action addVertex = new AddVertex(graph);
        editor.executeAction(addVertex);

        assertEquals("Vertex added to graph.", graph.getState());
    }

    @Test
    public void shouldRemoveVertex() {
        Action removeVertex = new RemoveVertex(graph);
        editor.executeAction(removeVertex);

        assertEquals("Vertex removed from graph.", graph.getState());
    }

    @Test
    public void shouldCancelRemoveVertex() {
        Action addVertex = new AddVertex(graph);
        Action removeVertex = new RemoveVertex(graph);

        editor.executeAction(addVertex);
        editor.executeAction(removeVertex);
        editor.cancelLastAction();

        assertEquals("Vertex added to graph.", graph.getState());
    }

}
