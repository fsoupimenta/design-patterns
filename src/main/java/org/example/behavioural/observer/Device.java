package org.example.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Device implements Observer {

    private DeviceType deviceType;
    private List<String> log;
    private String currentNotification;

    public Device(DeviceType deviceType) {
        this.deviceType = deviceType;
        this.log = new ArrayList<>();
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getCurrentNotification() {
        return this.currentNotification;
    }

    public void subscribe(MusicApp musicApp) {
        musicApp.addObserver(this);
    }

    @Override
    public void update(Observable observable) {
        MusicApp musicApp = (MusicApp) observable;
        MusicTrack track = musicApp.getCurrentTrack();
        String notification = "Now playing: " + track.getTitle() + " by " + track.getArtist();

        log.add(notification);
        this.currentNotification = notification;
        displayNotification(musicApp);
    }

    public void displayNotification(MusicApp musicApp) {
        System.out.println("NOTIFICATION FOR " + this.deviceType.name() + " " + this.deviceType.toString() + "\n"
                + musicApp.getCurrentTrack().toString() + " is now playing.\n");
    }
}
