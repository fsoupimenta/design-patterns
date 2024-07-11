package org.example.structural.adapter;

public class FormatAdapter implements MusicPlayer {
    private final ConcreteMusic music;

    public FormatAdapter(ConcreteMusic music) {
        this.music = music;
    }

    @Override
    public String play(String title, String artist, int currentPosition) {
        return "Playing '" + music.getTitle() + "' by " + music.getArtist() + " at position " + currentPosition;
    }
}
