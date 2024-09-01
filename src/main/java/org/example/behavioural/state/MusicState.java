package org.example.behavioural.state;

public interface MusicState {

    String getState();

    String play(Music music);

    String pause(Music music);

    String skip(Music music);

    String stop(Music music);
}
