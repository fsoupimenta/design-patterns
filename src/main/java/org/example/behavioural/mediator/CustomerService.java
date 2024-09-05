package org.example.behavioural.mediator;

public class CustomerService {

    private static CustomerService instance = new CustomerService();

    private CustomerService() {}

    public static CustomerService getInstance() {
        return instance;
    }

    public String receiveFeedbackFromCustomer(String message) {
        return "Customer Service appreciates your contact.\n" +
                "Support has responded to your feedback as follows.\n" +
                ">>" + Support.getInstance().receiveFeedback(message);
    }

    public String receiveComplaintFromCustomer(String message) {
        return "Customer Service appreciates your contact.\n" +
                "Support has responded to your complaint as follows.\n" +
                ">>" + Support.getInstance().receiveComplaint(message);
    }

    public String receiveSuggestionFromCustomer(String message) {
        return "Customer Service appreciates your contact.\n" +
                "Support has responded to your suggestion as follows.\n" +
                ">>" + Support.getInstance().receiveSuggestion(message);
    }
}
