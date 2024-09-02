package org.example.behavioural.mediator;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createTask(String title) {
        Task task = new Task(title);
        TaskManager.getInstance().addTask(task);
    }

    public void markTaskAsCompleted(Task task) {
        task.complete();
        TaskManager.getInstance().completeTask(task);
    }
}
