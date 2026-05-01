package org.example.sut;

import java.util.ArrayList;
import java.util.Objects;

public class Game {
    private final ArrayList<Player> players;
    boolean isStarted;
    int playerIndex;

    public Game() {
        players = new ArrayList<Player>();
        playerIndex = 0;
    }

    public Player addPlayer(String aPlayerName) {
        Player aPlayer = new Player(aPlayerName);
        players.add(aPlayer);
        return aPlayer;
    }

    public boolean playerIsPlaying(Player aPlayer) {
        return players.contains(aPlayer);
    }

    public Player getPlayerNamed(String aPlayerName) {
        for (Player aPlayer : players) {
            if (aPlayer.getPlayerName().equals(aPlayerName)) {
                return aPlayer;
            }
        }
        return null;
    }
    public void removePlayer(Player aPlayer) {
        if (Objects.isNull(aPlayer))
            return;
        players.remove(aPlayer);
    }
    public String takeTurn(int roll) {
       if (!isStarted)
           isStarted = true;
        return playerTurn();
    }

    public int getNumberOfPlayers() {
        return players.size();
    }

    public boolean gameHasStarted() {
        return isStarted;
    }
    String playerTurn() {
        String name = players.get(this.playerIndex).getPlayerName();
        this.playerIndex = (this.playerIndex + 1) % players.size();
        return name;
    }
}
