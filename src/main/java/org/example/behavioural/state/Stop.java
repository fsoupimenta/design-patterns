package org.example.behavioural.state;

public class Stop implements MusicState {

    private static Stop instance = new Stop();

    public static Stop getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "⏹️";
    }

    @Override
    public String play(Music music) {
        return "⚠️ Operation not allowed";
    }

    @Override
    public String pause(Music music) {
        return "⚠️ Operation not allowed";
    }

    @Override
    public String skip(Music music) {
        return "⚠️ Operation not allowed";
    }

    @Override
    public String stop(Music music) {
        return "⚠️ Operation not allowed";
    }

}
