package org.example.behavioural.mediator;

public class Manager extends Customer {

    public String forwardFeedbackToSupport(String message) {
        return CustomerService.getInstance().receiveFeedbackFromCustomer(message);
    }

    public String forwardComplaintToSupport(String message) {
        return CustomerService.getInstance().receiveComplaintFromCustomer(message);
    }

    public String forwardSuggestionToSupport(String message) {
        return CustomerService.getInstance().receiveSuggestionFromCustomer(message);
    }
}
