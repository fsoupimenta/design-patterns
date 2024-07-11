package org.example.structural.flyweight;

public class ConcreteMusic {
    private final String title;
    private final String artist;

    public ConcreteMusic(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String play(int currentPosition) {
        return "Playing '" + title + "' by " + artist + " at position " + currentPosition;
    }
}
