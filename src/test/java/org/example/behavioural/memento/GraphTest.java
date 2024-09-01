package org.example.behavioural.memento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GraphTest {

    private Graph graph;

    @BeforeEach
    public void setUp() {
        this.graph = new Graph();
    }

    @Test
    public void shouldKeepState() {
        graph.setState(LineGraph.getInstance());
        graph.getState().applyChanges(graph);
        graph.setState(PetersenGraph.getInstance());
        graph.getState().applyChanges(graph);

        assertEquals(3, graph.getMemento().size());
    }

    @Test
    public void shouldRestoreInitialState() {
        graph.setState(LineGraph.getInstance());
        graph.getState().applyChanges(graph);
        graph.setState(PetersenGraph.getInstance());
        graph.getState().applyChanges(graph);
        graph.restoreState(0);

        assertEquals(LineGraph.getInstance(), graph.getState());
        assertEquals("Vertices: 2\nEdges:\n0 -- 1\n", graph.getGraphDetails());
    }

    @Test
    public void shouldUndoState() {
        graph.setState(LineGraph.getInstance());
        graph.getState().applyChanges(graph);
        graph.setState(PetersenGraph.getInstance());
        graph.getState().applyChanges(graph);

        graph.undo();
        graph.undo();

        // Check that the graph is back to its initial state
        assertEquals(NullGraph.getInstance(), graph.getState());
        assertEquals("Vertices: 0\nEdges:\n", graph.getGraphDetails());
    }

    @Test
    public void shouldNotFailUndoStateWithoutChanges() {
        graph.undo(); // No changes to undo
        assertEquals(NullGraph.getInstance(), graph.getState());
    }

    @Test
    public void shouldFailRestoreStateWrongIndex() {
        graph.setState(LineGraph.getInstance());
        graph.getState().applyChanges(graph);

        assertThrows(IllegalArgumentException.class, () -> {
            graph.restoreState(2); // Index out of bounds
        });
    }

    @Test
    public void shouldApplyLineGraphChanges() {
        graph.setState(LineGraph.getInstance());
        graph.getState().applyChanges(graph);

        assertEquals("Vertices: 2\nEdges:\n0 -- 1\n", graph.getGraphDetails());
    }

    @Test
    public void shouldApplyPetersenGraphChanges() {
        graph.setState(PetersenGraph.getInstance());
        graph.getState().applyChanges(graph);

        assertEquals("Vertices: 10\nEdges:\n0 -- 1\n1 -- 2\n2 -- 3\n3 -- 4\n4 -- 0\n" +
                "5 -- 6\n6 -- 7\n7 -- 8\n8 -- 9\n9 -- 5\n" +
                "0 -- 5\n1 -- 6\n2 -- 7\n3 -- 8\n4 -- 9\n", graph.getGraphDetails());
    }
}
