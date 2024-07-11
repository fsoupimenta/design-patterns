package org.example.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuiceTest {

    @Test
    void shouldCalculatePriceForJuiceWithLowExportation() {
        Exportation exportation = new LowExportation();
        Juice juice = new Juice(4.0f, exportation);
        assertEquals(4.20f, juice.calculatePrice(), 0.01f);
    }

    @Test
    void shouldCalculatePriceForJuiceWithMediumExportation() {
        Exportation exportation = new MediumExportation();
        Juice juice = new Juice(4.0f, exportation);
        assertEquals(4.40f, juice.calculatePrice(), 0.01f);
    }

    @Test
    void shouldCalculatePriceForJuiceWithHighExportation() {
        Exportation exportation = new HighExportation();
        Juice juice = new Juice(4.0f, exportation);
        assertEquals(4.60f, juice.calculatePrice(), 0.01f);
    }
}
