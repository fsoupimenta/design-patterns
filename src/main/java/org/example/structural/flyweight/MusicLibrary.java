package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicLibrary {
    private final Map<String, ConcreteMusic> musicCollection;

    public MusicLibrary() {
        this.musicCollection = new HashMap<>();
    }

    public void addMusic(String title, String artist) {
        String key = title + "-" + artist;
        if (!musicCollection.containsKey(key)) {
            musicCollection.put(key, new ConcreteMusic(title, artist));
        }
    }

    public String playMusic(String title, String artist, int currentPosition) {
        String key = title + "-" + artist;
        if (musicCollection.containsKey(key)) {
            ConcreteMusic music = musicCollection.get(key);
            return music.play(currentPosition);
        } else {
            return "Music not found";
        }
    }
}
