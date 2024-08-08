package org.example.structural.adapter;

public class MeasurementAdapter extends MeasurementInches {

    private final IMeasurement measurementCentimeters;

    public MeasurementAdapter(IMeasurement measurementCentimeters) {
        this.measurementCentimeters = measurementCentimeters;
    }

    public float retrieveMeasurement() {
        this.measurementCentimeters.setMeasurement(this.getMeasurementInInches() * 2.54f);
        return this.measurementCentimeters.getMeasurement();
    }

    public void saveMeasurement() {
        this.setMeasurementInInches(this.measurementCentimeters.getMeasurement() / 2.54f);
    }
}