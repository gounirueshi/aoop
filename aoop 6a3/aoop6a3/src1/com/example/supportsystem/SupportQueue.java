package com.example.supportsystem;
import java.util.LinkedList;
import java.util.Queue;
public class SupportQueue {
	private Queue<Ticket> ticketQueue;

    public SupportQueue() {
        ticketQueue = new LinkedList<>();
    }

    // Add a new ticket to the queue
    public void addTicket(Ticket ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    // Process (remove) the next ticket in line
    public void processNextTicket() {
        Ticket nextTicket = ticketQueue.poll();
        if (nextTicket != null) {
            System.out.println("Processing ticket: " + nextTicket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    // Display all pending tickets
    public void displayAllTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending Tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }
}
