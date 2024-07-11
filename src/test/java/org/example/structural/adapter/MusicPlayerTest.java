package org.example.structural.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MusicPlayerTest {

    @Test
    void testFormatAdapterPlay() {
        ConcreteMusic avengedSevenfold = new ConcreteMusic("Afterlife", "Avenged Sevenfold");
        MusicPlayer adapter = new FormatAdapter(avengedSevenfold);
        String playbackResult = adapter.play(avengedSevenfold.getTitle(), avengedSevenfold.getArtist(), 0);

        assertEquals("Playing 'Afterlife' by Avenged Sevenfold at position 0", playbackResult);
    }

    @Test
    void testFormatAdapterWithDifferentMusic() {
        ConcreteMusic redHotChiliPeppers = new ConcreteMusic("Californication", "Red Hot Chili Peppers");
        MusicPlayer adapter = new FormatAdapter(redHotChiliPeppers);
        String playbackResult = adapter.play(redHotChiliPeppers.getTitle(), redHotChiliPeppers.getArtist(), 30);

        assertEquals("Playing 'Californication' by Red Hot Chili Peppers at position 30", playbackResult);
    }
}
