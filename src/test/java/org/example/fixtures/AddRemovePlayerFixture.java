package org.example.fixtures;

import fit.ColumnFixture;
import org.example.sut.Game;
import org.example.sut.Player;
import org.example.sut.StaticGame;

public class AddRemovePlayerFixture extends ColumnFixture{
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
}
