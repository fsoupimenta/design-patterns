package org.example.structural.proxy;

public interface IMusicService {
    void playMusic(String track, Client client);
    String getTrackInfo(String track, Client client);
}