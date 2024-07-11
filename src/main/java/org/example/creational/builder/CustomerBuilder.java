package org.example.creational.builder;

import java.util.Date;

public class CustomerBuilder {
    private final Customer customer;

    public CustomerBuilder() {
        customer = new Customer();
    }

    public Customer build() {
        if (customer.getCustomerId() == 0) {
            throw new IllegalArgumentException("Invalid customer ID");
        }
        if (customer.getName().equals("")) {
            throw new IllegalArgumentException("Invalid customer name");
        }
        return customer;
    }

    public CustomerBuilder setCustomerId(int customerId) {
        customer.setCustomerId(customerId);
        return this;
    }

    public CustomerBuilder setName(String name) {
        customer.setName(name);
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        customer.setEmail(email);
        return this;
    }

    public CustomerBuilder setPhoneNumber(String phoneNumber) {
        customer.setPhoneNumber(phoneNumber);
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        customer.setAddress(address);
        return this;
    }
}
