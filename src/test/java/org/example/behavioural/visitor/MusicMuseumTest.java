package org.example.behavioural.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MusicMuseumTest {

    @Test
    public void shouldExhibitSong() {
        Song song = new Song("Imagine", "John Lennon");
        assertEquals("{\n  \"title\": \"Imagine\",\n  \"artist\": \"John Lennon\"\n}", MusicMuseum.getInstance().exhibit(song));
    }

    @Test
    public void shouldExhibitAlbum() {
        Album album = new Album("Abbey Road", "The Beatles");
        assertEquals("{\n  \"title\": \"Abbey Road\",\n  \"artist\": \"The Beatles\"\n}", MusicMuseum.getInstance().exhibit(album));
    }
}
