package org.example.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    @Test
    void shouldCalculatePriceForCoffeeWithLowExportation() {
        Exportation exportation = new LowExportation();
        Coffee coffee = new Coffee(5.0f, exportation);
        assertEquals(5.25f, coffee.calculatePrice(), 0.01f);
    }

    @Test
    void shouldCalculatePriceForCoffeeWithMediumExportation() {
        Exportation exportation = new MediumExportation();
        Coffee coffee = new Coffee(5.0f, exportation);
        assertEquals(5.50f, coffee.calculatePrice(), 0.01f);
    }

    @Test
    void shouldCalculatePriceForCoffeeWithHighExportation() {
        Exportation exportation = new HighExportation();
        Coffee coffee = new Coffee(5.0f, exportation);
        assertEquals(5.75f, coffee.calculatePrice(), 0.01f);
    }
}
