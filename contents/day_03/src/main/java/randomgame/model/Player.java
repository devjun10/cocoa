package main.java.randomgame.model;

import main.java.randomgame.GameMachine;
import main.java.randomgame.view.GameResult;

public class Player {
    public GameResult play(GameMachine gameMachine, int gameCount) {
        return gameMachine.play(gameCount);
    }
}