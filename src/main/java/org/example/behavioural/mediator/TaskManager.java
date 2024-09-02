package org.example.behavioural.mediator;

public class TaskManager {

    private static final TaskManager instance = new TaskManager();
    private final NotificationService notificationService;

    private TaskManager() {
        this.notificationService = new NotificationService();
    }

    public static TaskManager getInstance() {
        return instance;
    }

    public void addTask(Task task) {
        notificationService.notifyTaskAdded(task);
    }

    public void completeTask(Task task) {
        notificationService.notifyTaskCompleted(task);
    }
}
