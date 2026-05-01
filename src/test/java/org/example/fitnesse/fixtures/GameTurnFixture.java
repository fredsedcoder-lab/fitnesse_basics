package org.example.fitnesse.fixtures;

import fit.ColumnFixture;
import org.example.sut.Game;

public class GameTurnFixture extends ColumnFixture {
    private int roll;
    private Game theGame;

    public String player() {
        theGame = StaticGame.getInstance();
        return theGame.takeTurn(roll);
    }


//    public void execute() {
//        theGame = StaticGame.getInstance();
//        theGame.takeTurn(roll);
//    }

    public boolean gameHasStarted() {
        return theGame.gameHasStarted();
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
