package org.example.creational.abstract_factory;

public class TeaFactory implements AbstractFactory {
    @Override
    public Drink createDrink() {
        return new Tea();
    }

    @Override
    public Cup createCup() {
        return new Teacup();
    }
}
