package com.example.supportsystem;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        SupportQueue supportQueue = new SupportQueue();
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nCustomer Support Ticket System");
	            System.out.println("1. Add New Ticket");
	            System.out.println("2. Process Next Ticket");
	            System.out.println("3. Display All Pending Tickets");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter issue description: ");
	                    String issueDescription = scanner.nextLine();
	                    supportQueue.addTicket(new Ticket(issueDescription));
	                    break;
	                case 2:
	                    supportQueue.processNextTicket();
	                    break;
	                case 3:
	                    supportQueue.displayAllTickets();
	                    break;
	                case 4:
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
