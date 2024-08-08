package org.example.structural.flyweight;

public class Music {

    private String title;
    private Rhythm rhythm;

    public Music(String title, String rhythmName) {
        this.title = title;
        this.rhythm = RhythmFlyweight.getRhythm(rhythmName);
    }

    public String getTitle() {
        return title;
    }

    public Rhythm getRhythm() {
        return rhythm;
    }

    @Override
    public String toString() {
        return "Music: \n" + "  Title: " + this.title + "\n  Rhythm: " + this.rhythm;
    }
}