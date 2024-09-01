package org.example.behavioural.observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeviceTest {

    @Test
    public void shouldSendOneDeviceNotification() {
        MusicApp musicApp = new MusicApp();
        Device device = new Device(DeviceType.SMARTPHONE);

        device.subscribe(musicApp);

        MusicTrack newTrack = new MusicTrack("Song Title", "Artist Name");
        musicApp.changeTrack(newTrack);

        assertEquals("Now playing: Song Title by Artist Name", device.getCurrentNotification());
    }

    @Test
    public void shouldSendAllDeviceNotification() {
        MusicApp musicApp = new MusicApp();

        Device device1 = new Device(DeviceType.DESKTOP);
        Device device2 = new Device(DeviceType.SMARTPHONE);
        Device device3 = new Device(DeviceType.TABLET);

        device1.subscribe(musicApp);
        device2.subscribe(musicApp);
        device3.subscribe(musicApp);

        MusicTrack newTrack = new MusicTrack("Song Title", "Artist Name");
        musicApp.changeTrack(newTrack);

        assertAll("Logs", () -> Assertions.assertEquals("Now playing: Song Title by Artist Name", device1.getCurrentNotification()),
                () -> Assertions.assertEquals("Now playing: Song Title by Artist Name", device2.getCurrentNotification()),
                () -> Assertions.assertEquals("Now playing: Song Title by Artist Name", device3.getCurrentNotification()));
    }

    @Test
    public void shouldNotNotifyDeviceIfNotSubscribed() {
        MusicApp musicApp = new MusicApp();

        Device device = new Device(DeviceType.DESKTOP);

        MusicTrack newTrack = new MusicTrack("Song Title", "Artist Name");
        musicApp.changeTrack(newTrack);

        assertNull(device.getCurrentNotification());
    }
}
