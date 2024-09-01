package org.example.behavioural.strategy;

public class Musician {

    private String frequency;

    public String getFrequency() {
        return frequency;
    }

    public void tuneE1() {
        App app = new App();
        this.frequency = app.calculate(new NoteE1());
    }

    public void tuneE2() {
        App app = new App();
        this.frequency = app.calculate(new NoteE2());
    }

    public void tuneE3() {
        App app = new App();
        this.frequency = app.calculate(new NoteE3());
    }
}
