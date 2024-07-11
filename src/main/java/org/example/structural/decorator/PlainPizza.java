package org.example.structural.decorator;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
