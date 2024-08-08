package org.example.structural.facade;

public class Car {

    public boolean isInspectionPassed() {
        return CarFacade.verifyInspection(this);
    }
}