package org.example.creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceCoffeeTest {

    @Test
    void shouldPrepareCoffee() {
        IService service = ServiceFactory.getService("Coffee");
        assertEquals("Preparing coffee...", service.prepare());
    }

    @Test
    void shouldServeCoffee() {
        IService service = ServiceFactory.getService("Coffee");
        assertEquals("Serving coffee...", service.serve());
    }
}
