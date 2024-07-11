package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicFactory {
    private final Map<String, ConcreteMusic> musicMap;

    public MusicFactory() {
        musicMap = new HashMap<>();
    }

    public ConcreteMusic getMusic(String title, String artist) {
        String key = title + "-" + artist;
        if (!musicMap.containsKey(key)) {
            musicMap.put(key, new ConcreteMusic(title, artist));
        }
        return musicMap.get(key);
    }
}
