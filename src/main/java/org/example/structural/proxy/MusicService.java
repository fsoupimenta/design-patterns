package org.example.structural.proxy;

public class MusicService implements IMusicService {

    @Override
    public void playMusic(String track, Client client) {
        System.out.println("Playing track: " + track);
    }

    @Override
    public String getTrackInfo(String track, Client client) {
        return "Track: " + track + "\nArtist: Example Artist\nAlbum: Example Album";
    }
}