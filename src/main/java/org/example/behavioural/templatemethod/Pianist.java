package org.example.behavioural.templatemethod;

public class Pianist extends Musician {

    public Pianist(String name) {
        super(name, Role.PIANIST);
    }

    @Override
    public String perform() {
        return "Playing a stunning piano solo.";
    }
}
