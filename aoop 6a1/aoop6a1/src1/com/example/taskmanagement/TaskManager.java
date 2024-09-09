package com.example.taskmanagement;
import java.util.ArrayList;
import java.util.List;
public class TaskManager {
	 private List<Task> tasks;
	    private int nextId;

	    public TaskManager() {
	        tasks = new ArrayList<>();
	        nextId = 1;
	    }

	    public void addTask(String description) {
	        Task newTask = new Task(nextId++, description);
	        tasks.add(newTask);
	        System.out.println("Task added: " + newTask);
	    }

	    public void updateTask(int id, String newDescription) {
	        for (Task task : tasks) {
	            if (task.getId() == id) {
	                task.setDescription(newDescription);
	                System.out.println("Task updated: " + task);
	                return;
	            }
	        }
	        System.out.println("Task with ID " + id + " not found.");
	    }

	    public void removeTask(int id) {
	        for (int i = 0; i < tasks.size(); i++) {
	            if (tasks.get(i).getId() == id) {
	                System.out.println("Task removed: " + tasks.get(i));
	                tasks.remove(i);
	                return;
	            }
	        }
	        System.out.println("Task with ID " + id + " not found.");
	    }

	    public void displayTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("No tasks to display.");
	        } else {
	            System.out.println("Task List:");
	            for (Task task : tasks) {
	                System.out.println(task);
	            }
	        }
	    }
}
