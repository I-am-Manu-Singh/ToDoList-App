# 📃To-Do List App in Java

## 🌐Overview

- This is a simple To-Do List App built using Java. The application allows users to manage tasks efficiently by adding, updating, removing, and marking them as completed.

---

## Features

- Add new tasks with details (title, description, category, deadline, priority)

- View all tasks

- Update existing tasks

- Remove tasks

- Mark tasks as completed
---
## 🏗Project Structure
```yaml
TaskAppInJava/
│-- Task.java         # Represents a Task entity
│-- TaskManager.java  # Handles task operations (add, remove, update, mark completed)
│-- ToDoApp.java      # Main application file with user menu
```
---
## 🔹 File Use Cases
1️⃣ Task.java
- Represents a task with properties: title, description, category, deadline, priority, and completion status.
```yaml
- Constructor: Initializes a task with the specified properties.
- Getters: Retrieve task details (e.g., title, description, priority).
- Setters: Modify task properties (e.g., description, deadline, priority).
- toString(): Provides a formatted string of the task details.
```

2️⃣ TaskManager.java
- Manages the list of tasks and handles task operations.
```yaml
- addTask(): Adds a new task.
- removeTask(): Removes a task by title.
- updateTask(): Updates task details (description, deadline, priority).
- viewTasks(): Displays all tasks.
- markAsCompleted(): Marks a task as completed.
```

3️⃣ ToDoApp.java
- User interface for interacting with tasks.
```yaml
- main(): Runs the app, allowing users to choose actions (add, remove, update, view, mark as completed, exit).
```
---
## 🛠How to Run

- Clone this repository:

```shell
git clone https://github.com/your-username/ToDoAppInJava.git
```

- Navigate to the project folder:

```yaml
cd ToDoAppInJava
```

- Compile the Java files:

```yaml
javac Task.java TaskManager.java ToDoApp.java
```

- Run the application:

```yaml
java ToDoApp
```
---

## 🖥Usage

- Adding a Task
```yaml
Enter Task title: Study Java
Enter Task description: Revise OOP concepts
Enter Task category: Education
Enter Task deadline (YYYY-MM-DDTHH:MM): 2025-02-01T18:00
Enter Task priority (High, Medium, Low): High
```
- Viewing Tasks
```yaml
Task: Study Java
Category: Education
Priority: High
Deadline: 2025-02-01T18:00
Completed: No
Description: Revise OOP concepts
```

- Marking Task as Completed
```yaml
Enter Task title to mark as completed: Study Java
Task marked as completed!
```
---

## 📝License

- This project is licensed under the MIT License.
