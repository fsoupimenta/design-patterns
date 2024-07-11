package org.example.structural.decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    public double cost() {
        return decoratedPizza.cost();
    }
}
