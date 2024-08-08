package org.example.structural.facade;


public class BrakeSystem extends Inspection {

    private static BrakeSystem instance = new BrakeSystem();

    public static BrakeSystem getInstance() {
        return instance;
    }
}