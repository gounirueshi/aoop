package com.example.todolist;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    toDoList.addTask(new Task(taskDescription));
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new task description: ");
                    String newTaskDescription = scanner.nextLine();
                    toDoList.updateTask(updateIndex - 1, newTaskDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    toDoList.removeTask(removeIndex - 1);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
