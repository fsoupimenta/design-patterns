package org.example.behavioural.mediator;

public class NotificationService {

    public void notifyTaskAdded(Task task) {
        System.out.println("Task added: " + task.getTitle());
    }

    public void notifyTaskCompleted(Task task) {
        System.out.println("Task completed: " + task.getTitle());
    }
}
