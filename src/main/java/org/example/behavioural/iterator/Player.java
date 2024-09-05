package org.example.behavioural.iterator;

public class Player {

    private String name;
    private boolean isActive;

    public Player(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
