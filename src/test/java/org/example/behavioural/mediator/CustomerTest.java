package org.example.behavioural.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void shouldGiveFeedbackToSupport() {
        Customer customer = new Customer();
        assertEquals("Customer Service appreciates your contact.\n" +
                        "Support has responded to your feedback as follows.\n" +
                        ">>Support appreciates the feedback: Great service",
                customer.giveFeedbackToSupport("Great service"));
    }

    @Test
    void shouldRaiseComplaintToSupport() {
        Customer customer = new Customer();
        assertEquals("Customer Service appreciates your contact.\n" +
                        "Support has responded to your complaint as follows.\n" +
                        ">>Support will work on improving the service as per the complaint: Slow response",
                customer.raiseComplaintToSupport("Slow response"));
    }

    @Test
    void shouldSuggestToSupport() {
        Customer customer = new Customer();
        assertEquals("Customer Service appreciates your contact.\n" +
                        "Support has responded to your suggestion as follows.\n" +
                        ">>Support will review the suggestion: Extend operating hours",
                customer.suggestToSupport("Extend operating hours"));
    }
}
