package TaskAppInJava;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private String category;
    private LocalDateTime deadline;
    private String priority; // High, Medium, Low
    private boolean isCompleted;

    public Task(String title, String description, String category, LocalDateTime deadline, String priority) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.deadline = deadline;
        this.priority = priority;
        this.isCompleted = false;
    }

    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public LocalDateTime getDeadline() { return deadline; }
    public String getPriority() { return priority; }
    public boolean isCompleted() { return isCompleted; }

    // Setters (Added Missing Ones)
    public void setDescription(String description) { this.description = description; }
    public void setDeadline(LocalDateTime deadline) { this.deadline = deadline; }
    public void setPriority(String priority) { this.priority = priority; }
    public void setCompleted(boolean isCompleted) { this.isCompleted = isCompleted; }

    @Override
    public String toString() {
        return "Task: " + title + "\n" +
                "Category: " + category + "\n" +
                "Priority: " + priority + "\n" +
                "Deadline: " + deadline + "\n" +
                "Completed: " + (isCompleted ? "Yes" : "No") + "\n" +
                "Description: " + description + "\n";
    }
}