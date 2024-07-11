package org.example.creational.abstract_factory;

public class Beverage {
    private final Drink drink;
    private final Cup cup;

    public Beverage(AbstractFactory factory) {
        this.drink = factory.createDrink();
        this.cup = factory.createCup();
    }

    public String serveDrink() {
        return drink.serve();
    }

    public String useCup() {
        return cup.use();
    }
}
