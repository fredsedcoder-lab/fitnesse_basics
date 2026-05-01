package org.example.fitnesse.fixtures;

import org.example.sut.Game;
import org.example.sut.Player;

import java.util.Objects;

public class AddRemovePlayerFixture {
    private String playerName;
    private Game theGame;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean addPlayer() {
        theGame = StaticGame.theGame;
        Player thePlayer = theGame.addPlayer(playerName);
        return theGame.playerIsPlaying(thePlayer);
    }

    public int countPlayers() {
        return theGame.getNumberOfPlayers();
    }

    public boolean removePlayer() {
        theGame = StaticGame.getInstance();
        Player thePlayer = theGame.getPlayerNamed(playerName);
        theGame.removePlayer(thePlayer);
        return (playerWasRemoved(thePlayer));
    }

    public boolean playerWasRemoved(Player aPlayer) {
        return (Objects.nonNull(aPlayer) && !theGame.playerIsPlaying(aPlayer));
    }
}
