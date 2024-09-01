package org.example.behavioural.templatemethod;

public class Drummer extends Musician {

    public Drummer(String name) {
        super(name, Role.DRUMMER);
    }

    @Override
    public String perform() {
        return "Pounding the drums energetically.";
    }
}
