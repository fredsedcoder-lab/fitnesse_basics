package org.example.sut;

import java.util.ArrayList;

public class Game {
    private final ArrayList<Player> players;

    public Game() {
        players = new ArrayList<Player>();
    }

    public Player addPlayer(String aPlayerName) {
        Player aPlayer = new Player(aPlayerName);
        players.add(aPlayer);
        return aPlayer;
    }

    public boolean playerIsPlaying(Player aPlayer) {
        return players.contains(aPlayer);
    }

    public int getNumberOfPlayers() {
        return players.size();
    }
}
