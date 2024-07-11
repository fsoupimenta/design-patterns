package org.example.structural.adapter;

public class ConcreteMusic {
    private final String title;
    private final String artist;

    public ConcreteMusic(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
