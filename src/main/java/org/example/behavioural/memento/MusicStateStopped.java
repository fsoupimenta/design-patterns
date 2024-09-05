package org.example.behavioural.memento;


public class MusicStateStopped implements MusicState {

    private MusicStateStopped() {};
    private static final MusicStateStopped instance = new MusicStateStopped();
    public static MusicStateStopped getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Stopped";
    }
}