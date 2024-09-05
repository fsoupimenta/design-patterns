package org.example.behavioural.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Team implements Iterable<Player> {

    private List<Player> players = new ArrayList<Player>();

    public Team(Player... players) {
        this.players = Arrays.asList(players);
    }

    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }
}
