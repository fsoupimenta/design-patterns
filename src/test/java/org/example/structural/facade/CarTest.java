package org.example.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void shouldReturnBrakeSystemContingent() {
        Car car = new Car();
        BrakeSystem.getInstance().addCarForInspection(car);
        assertFalse(car.isInspectionPassed());
    }

    @Test
    public void shouldReturnLightingSystemContingent() {
        Car car = new Car();
        LightingSystem.getInstance().addCarForInspection(car);
        assertFalse(car.isInspectionPassed());
    }

    @Test
    public void shouldReturnAllSystemsContingent() {
        Car car = new Car();
        BrakeSystem.getInstance().addCarForInspection(car);
        LightingSystem.getInstance().addCarForInspection(car);
        assertFalse(car.isInspectionPassed());
    }

    @Test
    public void shouldInspectionBePassed() {
        Car car = new Car();
        assertTrue(car.isInspectionPassed());
    }
}