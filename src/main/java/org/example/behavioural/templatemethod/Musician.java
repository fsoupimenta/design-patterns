package org.example.behavioural.templatemethod;

public abstract class Musician {

    private final String name;
    private final Role role;

    public Musician(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public abstract String perform();

    public String introduce() {
        return "Hello, my name is " + this.name + " and I am a " + this.role.toString() + ". " + this.perform();
    }
}
