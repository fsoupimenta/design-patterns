package org.example.structural.adapter;

public class Client {

    IMeasurement measurement;
    MeasurementAdapter persistence;

    public Client() {
        measurement = new MeasurementCentimeters();
        persistence = new MeasurementAdapter(measurement);
    }

    public void setMeasurement(float value) {
        measurement.setMeasurement(value);
        persistence.saveMeasurement();
    }

    public float getMeasurement() {
        return persistence.retrieveMeasurement();
    }

    public float getMeasurementInInches() {
        return persistence.getMeasurementInInches();
    }

}