package org.example.creational.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {

    @Test
    void shouldServeCoffeeInMug() {
        AbstractFactory coffeeFactory = new CoffeeFactory();
        Beverage beverage = new Beverage(coffeeFactory);
        assertEquals("Serving coffee...", beverage.serveDrink());
        assertEquals("Using mug...", beverage.useCup());
    }

    @Test
    void shouldServeTeaInTeacup() {
        AbstractFactory teaFactory = new TeaFactory();
        Beverage beverage = new Beverage(teaFactory);
        assertEquals("Serving tea...", beverage.serveDrink());
        assertEquals("Using teacup...", beverage.useCup());
    }
}
