# To-Do List App in Java

## Overview

- This is a simple To-Do List App built using Java. The application allows users to manage tasks efficiently by adding, updating, removing, and marking them as completed.

---

## Features

- Add new tasks with details (title, description, category, deadline, priority)

- View all tasks

- Update existing tasks

- Remove tasks

- Mark tasks as completed
---
## Project Structure
```yaml
TaskAppInJava/
│-- Task.java         # Represents a Task entity
│-- TaskManager.java  # Handles task operations (add, remove, update, mark completed)
│-- ToDoApp.java      # Main application file with user menu
```
---
## How to Run

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

## Usage

- Once the application starts, a menu will be displayed with options to:

```yaml
Add Task

Remove Task

View Tasks

Update Task

Mark Task as Completed

Exit

Enter the corresponding number to perform the desired action.
```

---
## Usage

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

## License

- This project is licensed under the MIT License.
