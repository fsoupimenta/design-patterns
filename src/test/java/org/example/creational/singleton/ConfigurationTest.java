package org.example.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationTest {
    @Test
    public void shouldReturnAppName() {
        Configuration config = Configuration.getInstance();
        assertEquals("MyApp", config.getAppName());
    }

    @Test
    public void shouldReturnAppVersion() {
        Configuration config = Configuration.getInstance();
        assertEquals("1.0", config.getAppVersion());
    }
}
