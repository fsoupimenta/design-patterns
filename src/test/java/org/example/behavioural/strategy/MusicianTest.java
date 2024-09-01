package org.example.behavioural.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicianTest {

    Musician musician;

    @BeforeEach
    public void setUp() {
        musician = new Musician();
    }

    @Test
    public void shouldReturnE1Frequency() {
        musician.tuneE1();
        assertEquals("Frequency for E1: 41.20 Hz", musician.getFrequency());
    }

    @Test
    public void shouldReturnE2Frequency() {
        musician.tuneE2();
        assertEquals("Frequency for E2: 82.41 Hz", musician.getFrequency());
    }

    @Test
    public void shouldReturnE3Frequency() {
        musician.tuneE3();
        assertEquals("Frequency for E3: 164.81 Hz", musician.getFrequency());
    }
}
