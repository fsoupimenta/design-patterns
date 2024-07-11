package org.example.structural.adapter;

public class MediaPlayer {
    public String playMedia(String media, int currentPosition) {
        return "Playing '" + media + "' at position " + currentPosition;
    }
}
