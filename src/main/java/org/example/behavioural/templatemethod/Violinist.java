package org.example.behavioural.templatemethod;

public class Violinist extends Musician {

    public Violinist(String name) {
        super(name, Role.VIOLINIST);
    }

    @Override
    public String perform() {
        return "Playing the violin beautifully.";
    }
}
