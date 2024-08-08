package org.example.structural.facade;

public class LightingSystem extends Inspection {

    private static LightingSystem instance = new LightingSystem();

    public static LightingSystem getInstance() {
        return instance;
    }
}