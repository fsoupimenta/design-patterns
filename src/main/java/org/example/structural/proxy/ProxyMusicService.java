package org.example.structural.proxy;

public class ProxyMusicService implements IMusicService {

    private MusicService realMusicService;


    @Override
    public void playMusic(String track, Client client) {
        if (!checkAccess(client)) {
            throw new IllegalAccessError("Unauthorized. Upgrade to a premium subscription to access this feature.");
        }

        if (this.realMusicService == null) {
            this.realMusicService = new MusicService();
        }

        this.realMusicService.playMusic(track, client);
    }

    @Override
    public String getTrackInfo(String track, Client client) {
        if (this.realMusicService == null) {
            this.realMusicService = new MusicService();
        }

        if (client.getRole().equals(Role.FREE_USER)) {
            return "Track: " + track + "\nDetails are available for paid users.";
        }

        return this.realMusicService.getTrackInfo(track, client);
    }

    private boolean checkAccess(Client client) {
        return client.getRole().equals(Role.PAID_USER);
    }
}