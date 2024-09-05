package org.example.behavioural.mediator;


public interface Department {
    String receiveComplaint(String message);
    String receiveFeedback(String message);
    String receiveSuggestion(String message);
}
