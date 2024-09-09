package com.example.browserhistory;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
	 private Deque<String> backStack;
	    private Deque<String> forwardStack;
	    private String currentPage;

	    public BrowserHistory() {
	        backStack = new ArrayDeque<>();
	        forwardStack = new ArrayDeque<>();
	        currentPage = null;
	    }
	    public void visitPage(String url) {
	        if (currentPage != null) {
	            backStack.push(currentPage);
	        }
	        currentPage = url;
	        forwardStack.clear();
	        System.out.println("Visited page: " + currentPage);
	    }

	    
	    public void goBack() {
	        if (backStack.isEmpty()) {
	            System.out.println("No pages in back history.");
	        } else {
	            forwardStack.push(currentPage);
	            currentPage = backStack.pop();
	            System.out.println("Went back to: " + currentPage);
	        }
	    }

	    
	    public void goForward() {
	        if (forwardStack.isEmpty()) {
	            System.out.println("No pages in forward history.");
	        } else {
	            backStack.push(currentPage);
	            currentPage = forwardStack.pop();
	            System.out.println("Went forward to: " + currentPage);
	        }
	    }

	    
	    public void displayCurrentPage() {
	        if (currentPage == null) {
	            System.out.println("No current page.");
	        } else {
	            System.out.println("Current page: " + currentPage);
	        }
	    }
}
