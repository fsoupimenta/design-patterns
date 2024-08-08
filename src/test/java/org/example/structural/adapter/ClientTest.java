package org.example.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void shouldReturnMeasurementInCentimeters() {
        Client client = new Client();
        client.setMeasurement(10.0f);

        assertEquals(10.0f, client.getMeasurement());
    }

    @Test
    void shouldReturnMeasurementInInches() {
        Client client = new Client();
        client.setMeasurement(25.4f);

        assertEquals(10.0f, client.getMeasurementInInches(), 0.01f);
    }
}