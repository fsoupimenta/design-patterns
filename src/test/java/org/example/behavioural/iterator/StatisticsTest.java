package org.example.behavioural.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    @Test
    void shouldCountActivePlayersInTeam() {
        Team team = new Team(
                new Player("John", true),
                new Player("Paul", true),
                new Player("George", false),
                new Player("Ringo", true)
        );
        assertEquals(3, Statistics.countActivePlayers(team));
    }

    @Test
    void shouldCountTotalPlayersInTeam() {
        Team team = new Team(
                new Player("John", true),
                new Player("Paul", true),
                new Player("George", false),
                new Player("Ringo", true)
        );
        assertEquals(4, Statistics.countTotalPlayers(team));
    }
}
