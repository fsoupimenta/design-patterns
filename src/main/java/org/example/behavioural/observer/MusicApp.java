package org.example.behavioural.observer;


public class MusicApp extends Observable {

    private MusicTrack currentTrack;

    public MusicApp() {
        this.setCurrentTrack(new MusicTrack("Default Track", "Default Artist"));
    }

    public MusicTrack getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(MusicTrack currentTrack) {
        this.currentTrack = currentTrack;
    }

    public void changeTrack(MusicTrack newTrack) {
        setCurrentTrack(newTrack);
        notifyObservers();
    }

    @Override
    public String toString() {
        return currentTrack.toString();
    }
}
