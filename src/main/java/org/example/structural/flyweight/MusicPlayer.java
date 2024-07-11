package org.example.structural.flyweight;

public class MusicPlayer {
    private final MusicFactory musicFactory;

    public MusicPlayer(MusicFactory musicFactory) {
        this.musicFactory = musicFactory;
    }

    public String playMusic(String title, String artist, int currentPosition) {
        ConcreteMusic music = musicFactory.getMusic(title, artist);
        return music.play(currentPosition);
    }
}
