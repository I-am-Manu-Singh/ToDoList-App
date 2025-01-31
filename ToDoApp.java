package TaskAppInJava;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- To-Do List App Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Update Task");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Task
                    System.out.print("Enter Task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Task category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter Task deadline (YYYY-MM-DDTHH:MM): ");
                    LocalDateTime deadline = LocalDateTime.parse(scanner.nextLine());
                    System.out.print("Enter Task priority (High, Medium, Low): ");
                    String priority = scanner.nextLine();

                    taskManager.addTask(title, description, category, deadline, priority);
                    break;

                case 2:
                    // Remove Task
                    System.out.print("Enter Task title to remove: ");
                    taskManager.removeTask(scanner.nextLine());
                    break;

                case 3:
                    // View Tasks
                    taskManager.viewTasks();
                    break;

                case 4:
                    // Update Task
                    System.out.print("Enter Task title to update: ");
                    taskManager.updateTask(scanner.nextLine());
                    break;

                case 5:
                    // Mark Task as Completed
                    System.out.print("Enter Task title to mark as completed: ");
                    taskManager.markAsCompleted(scanner.nextLine());
                    break;

                case 6:
                    // Exit
                    running = false;
                    System.out.println("Exiting the To-Do App...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
        scanner.close();
        
    }
}
