package com.example.playlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
	private LinkedList<Song> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    // Add a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added: " + song);
    }

    // Remove a song by name
    public void removeSong(String title) {
        ListIterator<Song> iterator = songs.listIterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Song removed: " + song);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Song not found: " + title);
        }
    }

    // Move a song to a different position
    public void moveSong(String title, int newPosition) {
        ListIterator<Song> iterator = songs.listIterator();
        Song songToMove = null;
        int currentIndex = 0;

        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getTitle().equalsIgnoreCase(title)) {
                songToMove = song;
                iterator.remove();
                break;
            }
            currentIndex++;
        }

        if (songToMove != null) {
            songs.add(newPosition - 1, songToMove);
            System.out.println("Moved " + title + " to position " + newPosition);
        } else {
            System.out.println("Song not found: " + title);
        }
    }

    // Display the playlist
    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            int index = 1;
            for (Song song : songs) {
                System.out.println(index + ". " + song);
                index++;
            }
        }
    }
}
