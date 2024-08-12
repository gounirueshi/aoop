package com.example.logging;

public class Main {
	 public static void main(String[] args) {
	       
	        Logger logger = Logger.getInstance();
	        logger.log("Application started");

	       
	        logger.log("User login successful");
	        logger.log("Data processing started");
	        logger.log("Data processing completed");

	        
	        logger.log("Application ended");
	    }
}
