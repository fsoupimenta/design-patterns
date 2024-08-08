package org.example.structural.adapter;


public class MeasurementCentimeters implements IMeasurement {

    private float measurement;

    @Override
    public float getMeasurement() {
        return this.measurement;
    }

    @Override
    public void setMeasurement(float measurement) {
        this.measurement = measurement;
    }
}