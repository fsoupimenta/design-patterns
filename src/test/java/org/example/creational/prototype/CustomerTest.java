package org.example.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Customer customer = new Customer(1, "Fulano de Tal", "fulano@example.com", "1234567890", "123 Main St");

        Customer customerClone = customer.clone();
        customerClone.setName("Fulana de Tal");
        customerClone.setPhoneNumber("0987654321");

        assertEquals("Customer{customerId=1, name='Fulano de Tal', email='fulano@example.com', phoneNumber='1234567890', address='123 Main St'}", customer.toString());
        assertEquals("Customer{customerId=1, name='Fulana de Tal', email='fulano@example.com', phoneNumber='0987654321', address='123 Main St'}", customerClone.toString());
    }
}
