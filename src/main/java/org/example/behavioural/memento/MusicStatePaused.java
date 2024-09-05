package org.example.behavioural.memento;

public class MusicStatePaused implements MusicState {

    private MusicStatePaused() {};
    private static final MusicStatePaused instance = new MusicStatePaused();
    public static MusicStatePaused getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Paused";
    }
}