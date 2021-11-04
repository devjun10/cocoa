package main.java.randomgame;

import main.java.randomgame.model.Player;
import main.java.randomgame.view.*;

public class Main {
    static InputView inputView = new InputConsoleView();
    static OutputView outputViewr = new OutputConsoleView();

    public static void main(String[] args) throws Exception {
        Player player = new Player();
        GameMachine gameMachine = new GameMachine();

        outputViewr.printStartManual();
        int gameCount = inputView.inputGameCount();

        GameResult memberList = player.play(gameMachine, gameCount);
        outputViewr.printGameResult(memberList);
    }
}