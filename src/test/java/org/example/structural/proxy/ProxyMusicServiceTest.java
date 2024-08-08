package org.example.structural.proxy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ProxyMusicServiceTest {

    private ProxyMusicService proxyMusicServicePaid;
    private ProxyMusicService proxyMusicServiceFree;
    private Client paidClient;
    private Client freeClient;


    @BeforeEach
    void setUp() {
        paidClient = new Client("paidUser", Role.PAID_USER);
        freeClient = new Client("freeUser", Role.FREE_USER);
        proxyMusicServicePaid = new ProxyMusicService();
        proxyMusicServiceFree = new ProxyMusicService();
    }

    @Test
    public void shouldPlayMusicForPaidUser() {
        try {
            proxyMusicServicePaid.playMusic("Track1", paidClient);
        } catch (Exception e) {
            fail("Paid user should be able to play music.");
        }
    }

    @Test
    public void shouldNotPlayMusicForFreeUser() {
        IllegalAccessError exception = assertThrows(IllegalAccessError.class, () -> {
            proxyMusicServiceFree.playMusic("Track1", freeClient);
        });

        assertEquals("Unauthorized. Upgrade to a premium subscription to access this feature.", exception.getMessage());
    }

    @Test
    public void shouldReturnTrackInfoForPaidUser() {
        String trackInfo = proxyMusicServicePaid.getTrackInfo("Track1", paidClient);
        assertTrue(trackInfo.contains("Track: Track1"));
        assertTrue(trackInfo.contains("Artist: Example Artist"));
        assertTrue(trackInfo.contains("Album: Example Album"));
    }

    @Test
    public void shouldReturnLimitedTrackInfoForFreeUser() {
        String trackInfo = proxyMusicServiceFree.getTrackInfo("Track1", freeClient);
        assertTrue(trackInfo.contains("Track: Track1"));
        assertTrue(trackInfo.contains("Details are available for paid users."));
    }
}