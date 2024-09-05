package org.example.behavioural.memento;

public class MusicStatePlaying implements MusicState {

    private MusicStatePlaying() {};
    private static final MusicStatePlaying instance = new MusicStatePlaying();
    public static MusicStatePlaying getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Playing";
    }
}