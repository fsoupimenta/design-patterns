package org.example.behavioural.iterator;

import java.util.Iterator;

public class Statistics {

    public static Integer countActivePlayers(Team team) {
        int count = 0;
        for (Player player : team) {
            if (player.isActive()) {
                count++;
            }
        }
        return count;
    }

    public static Integer countTotalPlayers(Team team) {
        int count = 0;
        for (Player player : team) {
            count++;
        }
        return count;
    }
}