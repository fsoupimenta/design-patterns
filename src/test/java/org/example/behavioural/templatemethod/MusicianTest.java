package org.example.behavioural.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicianTest {

    @Test
    public void shouldIntroduceViolinist() {
        Violinist violinist = new Violinist("NAME");
        assertEquals("Hello, my name is NAME and I am a VIOLINIST. Playing the violin beautifully.", violinist.introduce());
    }

    @Test
    public void shouldIntroducePianist() {
        Pianist pianist = new Pianist("NAME");
        assertEquals("Hello, my name is NAME and I am a PIANIST. Playing a stunning piano solo.", pianist.introduce());
    }

    @Test
    public void shouldIntroduceDrummer() {
        Drummer drummer = new Drummer("NAME");
        assertEquals("Hello, my name is NAME and I am a DRUMMER. Pounding the drums energetically.", drummer.introduce());
    }
}
