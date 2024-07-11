package org.example.structural.decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", extra cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.5;
    }
}
