```mermaid
classDiagram
    TaskManager --|> Task
    TaskManager --|> NotificationService
    User --|> Task
    User --|> TaskManager
    NotificationService --|> Task

    class Task {
    }

    class User {
    }

    class TaskManager {
    }

    class NotificationService {
    }
```
