package org.example.structural.composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrawingTest {

    @Test
    void shouldReturnDrawingForSingleShape() {
        Shape circle = new Circle();
        Drawing drawing = new Drawing();
        drawing.add(circle);

        String result = drawing.draw("red");

        assertEquals("Drawing Circle with color red\n", result);
    }

    @Test
    void shouldReturnDrawingForMultipleShapes() {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Drawing drawing = new Drawing();
        drawing.add(circle);
        drawing.add(rectangle);

        String result = drawing.draw("blue");

        assertEquals("Drawing Circle with color blue\nDrawing Rectangle with color blue\n", result);
    }

    @Test
    void shouldReturnEmptyDrawing() {
        Drawing drawing = new Drawing();

        String result = drawing.draw("green");

        assertEquals("", result);
    }

    @Test
    void shouldClearShapesFromDrawing() {
        Shape circle = new Circle();
        Drawing drawing = new Drawing();
        drawing.add(circle);

        drawing.clear();
        String result = drawing.draw("yellow");

        assertEquals("", result);
    }
}
