package TaskAppInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title, String description, String category, LocalDateTime deadline, String priority) {
        Task newTask = new Task(title, description, category, deadline, priority);
        tasks.add(newTask);
        System.out.println("Task added successfully!");
    }

    public void removeTask(String title) {
        tasks.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
        System.out.println("Task removed successfully!");
    }

    public void updateTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter new description: ");
                task.setDescription(scanner.nextLine());

                System.out.print("Enter new deadline (YYYY-MM-DDTHH:MM): ");
                task.setDeadline(LocalDateTime.parse(scanner.nextLine()));

                System.out.print("Enter new priority (High, Medium, Low): ");
                task.setPriority(scanner.nextLine());

                System.out.println("Task updated successfully!");
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void markAsCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setCompleted(true);
                System.out.println("Task marked as completed!");
                return;
            }
        }
        System.out.println("Task not found!");
    }
}