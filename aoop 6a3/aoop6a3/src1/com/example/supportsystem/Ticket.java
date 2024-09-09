package com.example.supportsystem;

public class Ticket {
	private String issueDescription;
    private int ticketId;
    private static int idCounter = 1;

    public Ticket(String issueDescription) {
        this.issueDescription = issueDescription;
        this.ticketId = idCounter++;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public int getTicketId() {
        return ticketId;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + " - Issue: " + issueDescription;
    }
}
