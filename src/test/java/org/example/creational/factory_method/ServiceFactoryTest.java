package org.example.creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {
    @Test
    void shouldThrowExceptionForNonExistentService() {
        try {
            IService service = ServiceFactory.getService("Milk");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Non-existent service", e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionForInvalidService() {
        try {
            IService service = ServiceFactory.getService("Juice");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid service", e.getMessage());
        }
    }
}
