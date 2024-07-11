package org.example.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeaTest {

    @Test
    void shouldCalculatePriceForTeaWithLowExportation() {
        Exportation exportation = new LowExportation();
        Tea tea = new Tea(3.0f, exportation);
        assertEquals(3.15f, tea.calculatePrice(), 0.01f);
    }

    @Test
    void shouldCalculatePriceForTeaWithMediumExportation() {
        Exportation exportation = new MediumExportation();
        Tea tea = new Tea(3.0f, exportation);
        assertEquals(3.30f, tea.calculatePrice(), 0.01f);
    }

    @Test
    void shouldCalculatePriceForTeaWithHighExportation() {
        Exportation exportation = new HighExportation();
        Tea tea = new Tea(3.0f, exportation);
        assertEquals(3.45f, tea.calculatePrice(), 0.01f);
    }
}
