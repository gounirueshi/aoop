package com.ridesharing;

public class UserAuthentication {
	 private static UserAuthentication instance;
	    private String username;

	    private UserAuthentication() {
	    }

	    public static UserAuthentication getInstance() {
	        if (instance == null) {
	            instance = new UserAuthentication();
	        }
	        return instance;
	    }

	    public void login(String username) {
	        this.username = username;
	        System.out.println(username + " logged in.");
	    }

	    public String getUsername() {
	        return username;
	    }
}
