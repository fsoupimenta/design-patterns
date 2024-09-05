package org.example.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class Music {

    private MusicState state;
    private List<MusicState> memento = new ArrayList<MusicState>();

    public MusicState getState() {
        return this.state;
    }

    public void setState(MusicState state) {
        this.state = state;
        this.memento.add(this.state);
    }

    public void restoreState(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Invalid index");
        }
        this.state = this.memento.get(index);
    }

    public List<MusicState> getStates() {
        return this.memento;
    }
}