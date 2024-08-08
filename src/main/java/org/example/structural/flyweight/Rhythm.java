package org.example.structural.flyweight;

public class Rhythm {

    private String name;

    public Rhythm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}