package org.example.structural.facade;

public class CarFacade {

    public static boolean verifyInspection(Car car) {
        if (BrakeSystem.getInstance().verifySystem(car)) {
            return false;
        }

        if (LightingSystem.getInstance().verifySystem(car)) {
            return false;
        }

        return true;
    }
}