package org.example.structural.flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicLibraryTest {
    private MusicLibrary musicLibrary;

    @BeforeEach
    void setUp() {
        musicLibrary = new MusicLibrary();
        musicLibrary.addMusic("Hail to the King", "Avenged Sevenfold");
        musicLibrary.addMusic("Californication", "Red Hot Chili Peppers");
    }

    @Test
    void shouldPlayMusic() {
        assertEquals("Playing 'Hail to the King' by Avenged Sevenfold at position 0", musicLibrary.playMusic("Hail to the King", "Avenged Sevenfold", 0));
        assertEquals("Playing 'Hail to the King' by Avenged Sevenfold at position 120", musicLibrary.playMusic("Hail to the King", "Avenged Sevenfold", 120));

        assertEquals("Playing 'Californication' by Red Hot Chili Peppers at position 30", musicLibrary.playMusic("Californication", "Red Hot Chili Peppers", 30));
        assertEquals("Playing 'Californication' by Red Hot Chili Peppers at position 200", musicLibrary.playMusic("Californication", "Red Hot Chili Peppers", 200));
    }

    @Test
    void shouldHandleNonExistingMusic() {
        assertEquals("Music not found", musicLibrary.playMusic("Unholy Confessions", "Avenged Sevenfold", 0));
    }
}
