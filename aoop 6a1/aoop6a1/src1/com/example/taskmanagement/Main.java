package com.example.taskmanagement;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    taskManager.updateTask(updateId, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task ID to remove: ");
                    int removeId = scanner.nextInt();
                    taskManager.removeTask(removeId);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting Task Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
