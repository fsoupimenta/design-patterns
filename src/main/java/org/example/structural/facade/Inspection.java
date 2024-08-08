package org.example.structural.facade;


import java.util.ArrayList;
import java.util.List;

public abstract class Inspection {

    private List<Car> cars = new ArrayList<>();

    public void addCarForInspection(Car car) {
        this.cars.add(car);
    }

    public boolean verifySystem(Car car) {
        return cars.contains(car);
    }
}