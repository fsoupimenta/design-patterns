package org.example.structural.decorator;

public class MargheritaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Margherita pizza";
    }

    @Override
    public double cost() {
        return 6.0;
    }
}
