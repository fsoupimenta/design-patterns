package org.example.structural.flyweight;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class MusicFlyweightTest {

    static Music music1;
    static Music music2;
    static Music music3;
    static Music music4;

    @BeforeAll
    public static void setUp() {
        music1 = new Music("Track1", "Rock");
        music2 = new Music("Track2", "Pop");
        music3 = new Music("Track3", "Jazz");
        music4 = new Music("Track4", "Rock"); // Shared rhythm with music1
    }

    @Test
    public void shouldReturnMusicDetails() {
        assertAll("MusicList",
                () -> assertEquals("Music: \n  Title: Track1\n  Rhythm: Rock", music1.toString()),
                () -> assertEquals("Music: \n  Title: Track2\n  Rhythm: Pop", music2.toString()),
                () -> assertEquals("Music: \n  Title: Track3\n  Rhythm: Jazz", music3.toString()),
                () -> assertEquals("Music: \n  Title: Track4\n  Rhythm: Rock", music4.toString())
        );
    }

    @Test
    public void shouldReturnNumberOfUniqueRhythms() {
        assertEquals(3, RhythmFlyweight.getTotalRhythms());
    }
}