package main.java.indian;

import main.java.indian.view.GameResult;
import main.java.indian.view.PlayerData;

public class Player {
    public GameResult play(GameMachine gameMachine, PlayerData data){
        return gameMachine.play(data);
    }
}
