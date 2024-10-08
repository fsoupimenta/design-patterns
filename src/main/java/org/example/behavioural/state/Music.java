package org.example.behavioural.state;

public class Music {
    private String title;
    private String artist;
    private MusicState state;

    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.state = Play.getInstance();
    }

    public String play() {
        return state.play(this);
    }

    public String pause() {
        return state.pause(this);
    }

    public String skip() {
        return state.skip(this);
    }

    public String stop() {
        return state.stop(this);
    }

    public void setState(MusicState state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public MusicState getState() {
        return state;
    }

    public void setArtist(MusicState state) {
        this.state = state;
    }

}
