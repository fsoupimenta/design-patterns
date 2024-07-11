package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private final List<Shape> shapes = new ArrayList<>();

    @Override
    public String draw(String fillColor) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(shape.draw(fillColor)).append("\n");
        }
        return sb.toString();
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    public void clear() {
        shapes.clear();
    }
}
