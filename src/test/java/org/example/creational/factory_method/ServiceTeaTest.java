package org.example.creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTeaTest {
    @Test
    void shouldPrepareTea() {
        IService service = ServiceFactory.getService("Tea");
        assertEquals("Preparing tea...", service.prepare());
    }

    @Test
    void shouldServeTea() {
        IService service = ServiceFactory.getService("Tea");
        assertEquals("Serving tea...", service.serve());
    }
}
