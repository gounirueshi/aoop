package com.example.logging;

public class Logger {
	private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialize any resources needed for logging (e.g., file handles)
    }

   
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

   
    public void log(String message) {
        
        System.out.println("Log: " + message);
    }
}
