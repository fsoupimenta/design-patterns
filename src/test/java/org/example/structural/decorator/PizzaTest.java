package org.example.structural.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void shouldReturnDescriptionOfPlainPizza() {
        Pizza pizza = new PlainPizza();
        assertEquals("Plain pizza", pizza.getDescription());
        assertEquals(5.0, pizza.cost());
    }

    @Test
    void shouldReturnDescriptionAndCostOfMargheritaPizza() {
        Pizza margheritaPizza = new MargheritaPizza();
        assertEquals("Margherita pizza", margheritaPizza.getDescription());
        assertEquals(6.0, margheritaPizza.cost());
    }

    @Test
    void shouldReturnDescriptionAndCostOfPizzaWithCheese() {
        Pizza pizzaWithCheese = new CheeseDecorator(new PlainPizza());
        assertEquals("Plain pizza, extra cheese", pizzaWithCheese.getDescription());
        assertEquals(6.5, pizzaWithCheese.cost());
    }

    @Test
    void shouldReturnDescriptionAndCostOfPizzaWithMushrooms() {
        Pizza pizzaWithMushrooms = new MushroomDecorator(new MargheritaPizza());
        assertEquals("Margherita pizza, mushrooms", pizzaWithMushrooms.getDescription());
        assertEquals(8.0, pizzaWithMushrooms.cost());
    }

    @Test
    void shouldReturnDescriptionAndCostOfPizzaWithCheeseAndMushrooms() {
        Pizza pizzaWithCheeseAndMushrooms = new MushroomDecorator(new CheeseDecorator(new PlainPizza()));
        assertEquals("Plain pizza, extra cheese, mushrooms", pizzaWithCheeseAndMushrooms.getDescription());
        assertEquals(8.5, pizzaWithCheeseAndMushrooms.cost());
    }

    @Test
    void shouldReturnDescriptionAndCostOfPizzaWithDoubleCheese() {
        Pizza pizzaWithDoubleCheese = new CheeseDecorator(new CheeseDecorator(new PlainPizza()));
        assertEquals("Plain pizza, extra cheese, extra cheese", pizzaWithDoubleCheese.getDescription());
        assertEquals(8.0, pizzaWithDoubleCheese.cost());
    }

    @Test
    void shouldReturnDescriptionAndCostOfPizzaWithCheeseAndDoubleMushrooms() {
        Pizza pizzaWithCheeseAndDoubleMushrooms = new MushroomDecorator(new MushroomDecorator(new CheeseDecorator(new PlainPizza())));
        assertEquals("Plain pizza, extra cheese, mushrooms, mushrooms", pizzaWithCheeseAndDoubleMushrooms.getDescription());
        assertEquals(10.5, pizzaWithCheeseAndDoubleMushrooms.cost());
    }

}
