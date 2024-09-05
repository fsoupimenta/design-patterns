package org.example.behavioural.mediator;

public class Customer {

    public String giveFeedbackToSupport(String message) {
        return CustomerService.getInstance().receiveFeedbackFromCustomer(message);
    }

    public String raiseComplaintToSupport(String message) {
        return CustomerService.getInstance().receiveComplaintFromCustomer(message);
    }

    public String suggestToSupport(String message) {
        return CustomerService.getInstance().receiveSuggestionFromCustomer(message);
    }
}