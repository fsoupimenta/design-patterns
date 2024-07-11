package org.example.structural.composite;

public class Rectangle implements Shape {

    @Override
    public String draw(String fillColor) {
        return "Drawing Rectangle with color " + fillColor;
    }
}
