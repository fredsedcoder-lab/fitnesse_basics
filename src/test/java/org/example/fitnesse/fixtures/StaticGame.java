package org.example.fitnesse.fixtures;

import org.example.sut.Game;

public abstract class StaticGame {
    public static Game theGame = new Game();
    public static Game getInstance() {
        return theGame;
    }
}
