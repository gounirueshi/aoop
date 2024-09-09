package com.example.playlist;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Playlist playlist = new Playlist();
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nMusic Playlist");
	            System.out.println("1. Add Song");
	            System.out.println("2. Remove Song");
	            System.out.println("3. Move Song");
	            System.out.println("4. Display Playlist");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter song title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter artist name: ");
	                    String artist = scanner.nextLine();
	                    playlist.addSong(new Song(title, artist));
	                    break;
	                case 2:
	                    System.out.print("Enter song title to remove: ");
	                    String removeTitle = scanner.nextLine();
	                    playlist.removeSong(removeTitle);
	                    break;
	                case 3:
	                    System.out.print("Enter song title to move: ");
	                    String moveTitle = scanner.nextLine();
	                    System.out.print("Enter new position: ");
	                    int newPosition = scanner.nextInt();
	                    playlist.moveSong(moveTitle, newPosition);
	                    break;
	                case 4:
	                    playlist.displayPlaylist();
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
