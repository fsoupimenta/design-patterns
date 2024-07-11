package org.example.creational.abstract_factory;

public class CoffeeFactory implements AbstractFactory {
    @Override
    public Drink createDrink() {
        return new Coffee();
    }

    @Override
    public Cup createCup() {
        return new Mug();
    }
}
