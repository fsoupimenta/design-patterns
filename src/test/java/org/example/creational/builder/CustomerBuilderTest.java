package org.example.creational.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerBuilderTest {
    @Test
    void shouldBuildCustomerCorrectly() {
        Customer customer = new CustomerBuilder()
                .setCustomerId(1)
                .setName("John Doe")
                .setEmail("john.doe@example.com")
                .setPhoneNumber("1234567890")
                .setAddress("123 Main St")
                .build();

        assertNotNull(customer);
        assertEquals(1, customer.getCustomerId());
        assertEquals("John Doe", customer.getName());
        assertEquals("john.doe@example.com", customer.getEmail());
        assertEquals("1234567890", customer.getPhoneNumber());
        assertEquals("123 Main St", customer.getAddress());
    }

    @Test
    void shouldThrowExceptionForInvalidCustomerId() {
        assertThrows(IllegalArgumentException.class, () -> {
            Customer customer = new CustomerBuilder()
                    .setName("Jane Doe")
                    .build();
        });
    }

    @Test
    void shouldThrowExceptionForInvalidCustomerName() {
        assertThrows(IllegalArgumentException.class, () -> {
            Customer customer = new CustomerBuilder()
                    .setCustomerId(2)
                    .build();
        });
    }
}
