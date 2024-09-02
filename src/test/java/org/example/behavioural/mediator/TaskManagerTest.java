package org.example.behavioural.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void shouldAddTask() {
        User user = new User("Alice");
        user.createTask("Finish report");
    }

    @Test
    public void shouldCompleteTask() {
        Task task = new Task("Finish report");
        User user = new User("Alice");
        user.markTaskAsCompleted(task);

        assertTrue(task.isCompleted());
    }
}
