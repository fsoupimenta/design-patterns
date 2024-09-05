package org.example.behavioural.mediator;

public class Support implements Department {

    private static Support instance = new Support();

    private Support() {}

    public static Support getInstance() {
        return instance;
    }

    @Override
    public String receiveComplaint(String message) {
        return "Support will work on improving the service as per the complaint: " + message;
    }

    @Override
    public String receiveFeedback(String message) {
        return "Support appreciates the feedback: " + message;
    }

    @Override
    public String receiveSuggestion(String message) {
        return "Support will review the suggestion: " + message;
    }
}