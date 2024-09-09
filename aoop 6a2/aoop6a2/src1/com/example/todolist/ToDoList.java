package com.example.todolist;
import java.util.ArrayList;
public class ToDoList {
	private ArrayList<Task> tasks;
    public ToDoList() {
        tasks = new ArrayList<>();
    }
  
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getDescription());
    }
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setDescription(newDescription);
            System.out.println("Task updated at index " + index + ": " + newDescription);
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask.getDescription());
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getDescription());
            }
        }
    }
}
