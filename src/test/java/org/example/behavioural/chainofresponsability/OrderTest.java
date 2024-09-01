package org.example.behavioural.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    Waiter waiter;
    KitchenAssistant kitchenAssistant;
    Chef chef;

    @BeforeEach
    void setUp() {
        chef = new Chef(null);
        kitchenAssistant = new KitchenAssistant(chef);
        waiter = new Waiter(kitchenAssistant);
    }

    @Test
    public void shouldReturnMenu() {
        assertEquals("📖", waiter.order(OrderType.MENU));
    }

    @Test
    public void shouldReturnDish() {
        assertEquals("🍽️", waiter.order(OrderType.DISH));
    }

    @Test
    public void shouldReturnMeal() {
        assertEquals("🍲", waiter.order(OrderType.MEAL));
    }
}
