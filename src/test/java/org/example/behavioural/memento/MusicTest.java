package org.example.behavioural.memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MusicTest {

    @Test
    void shouldStoreStates() {
        Music music = new Music();
        music.setState(MusicStatePlaying.getInstance());
        music.setState(MusicStatePaused.getInstance());
        assertEquals(2, music.getStates().size());
    }

    @Test
    void shouldReturnInitialState() {
        Music music = new Music();
        music.setState(MusicStatePlaying.getInstance());
        music.setState(MusicStatePaused.getInstance());
        music.restoreState(0);
        assertEquals(MusicStatePlaying.getInstance(), music.getState());
    }

    @Test
    void shouldReturnPreviousState() {
        Music music = new Music();
        music.setState(MusicStatePlaying.getInstance());
        music.setState(MusicStatePaused.getInstance());
        music.setState(MusicStateStopped.getInstance());
        music.restoreState(1);
        assertEquals(MusicStatePaused.getInstance(), music.getState());
    }

    @Test
    void shouldThrowExceptionForInvalidIndex() {
        try {
            Music music = new Music();
            music.restoreState(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }
}